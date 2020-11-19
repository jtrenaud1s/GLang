package edu.semo.jatsz.glang.parsenode.function;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.*;
import edu.semo.jatsz.glang.parsenode.classnode.ClassDeclarationNode;
import edu.semo.jatsz.glang.parsenode.classnode.ClassSymbol;

import java.util.ArrayList;

public class FunctionCallStatement implements ParseNode {
    private Type type;
    private ReferenceNode owner;
    private ReferenceNode function;
    private ArrayList<ParseNode> arguments;
    private transient SymbolStorage environment;

    public FunctionCallStatement(ReferenceNode function, ArrayList<ParseNode> arguments, ReferenceNode owner) {
        this.function = function;
        this.arguments = arguments;
        this.owner = owner;
    }


    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {

    }

    @Override
    public ParseNode evaluate() {

        ArrayList<ParseNode> vals = new ArrayList<>();

        if(this.arguments != null)
            for(ParseNode n : arguments) {
                vals.add(n.evaluate());
            }

        if(this.owner != null) {
            Symbol toExecuteOn = (Symbol) owner.evaluate();
            switch (function.getName()) {
                case "length":
                    if(toExecuteOn instanceof ArraySymbol) {
                        ArraySymbol arr = (ArraySymbol) toExecuteOn;
                        return new Symbol(Type.INT, arr.getName() + ".length()", arr.getLength());
                    } else {
                        if(toExecuteOn.getType().equals(Type.STRING)) {
                            return new Symbol(Type.INT, toExecuteOn.getName() + ".length()", toExecuteOn.getValue().toString().length());
                        }
                    }
                    break;
                case "sub":
                    if(vals.size() == 2){
                        if(toExecuteOn.getType().equals(Type.STRING)) {
                            Symbol a = (Symbol) vals.get(0);
                            Symbol b = (Symbol) vals.get(1);

                            if(!(a.getType().equals(Type.INT) && b.getType().equals(Type.INT))) {
                                System.out.println("Arguments do not match function signature!");
                                System.exit(-1);
                            }

                            int beginIndex = (int) a.getValue();
                            int endIndex = beginIndex + (int) b.getValue();
                            return new Symbol(Type.STRING, toExecuteOn.getName() + ".sub()", toExecuteOn.getValue().toString().substring(beginIndex, endIndex));
                        } else {
                            System.out.println("sub() can only be used on a string!");
                            System.exit(-1);
                        }
                    }
                    break;
                case "split":
                    if(vals.size() == 1){
                        if(toExecuteOn.getType().equals(Type.STRING)) {
                            Symbol a = (Symbol) vals.get(0);

                            if(!(a.getType().equals(Type.STRING))) {
                                System.out.println("Arguments do not match function signature!");
                                System.exit(-1);
                            }

                            String operand = (String)toExecuteOn.getValue();
                            String delim = (String) a.getValue();
                            String[] tokens = operand.split(delim);
                            Symbol symbol[] = new Symbol[tokens.length];

                            for(int i = 0; i < tokens.length; i++) {
                                symbol[i] = new Symbol(Type.STRING, toExecuteOn.getName() + "[" + i + "]", tokens[i]);
                            }
                            return new ArraySymbol(Type.STRING, toExecuteOn.getName() + ".split()", symbol, tokens.length);
                        } else {
                            System.out.println("split() can only be used on a string!");
                            System.exit(-1);
                        }
                    }
                    break;
                default:
                    Symbol ref = (Symbol) this.function.evaluate();

                    if(!(ref instanceof FunctionSymbol)) {
                        System.out.println(this.function.getName() + " is not a function!");
                        System.exit(-1);
                    }

                    FunctionDefinitionNode function = (FunctionDefinitionNode) ref.getValue();


                    return function.call(vals);
            }
        } else {
            Symbol ref = (Symbol) this.function.evaluate();

            if(!(ref instanceof FunctionSymbol)) {
                System.out.println(this.function.getName() + " is not a function!");
                System.exit(-1);
            }

            FunctionDefinitionNode function = (FunctionDefinitionNode) ref.getValue();


            return function.call(vals);
        }
        return null;
    }

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        if(this.owner != null) {
            this.owner.setEnvironment(environment);
            if(this.owner.getType().equals(Type.CLASS)){
                ClassDeclarationNode theClass = (ClassDeclarationNode)((ClassSymbol)owner.evaluate()).getValue();
                this.function.setEnvironment(theClass);
            } else {
                this.function.setEnvironment(environment);
            }
        } else {
            this.function.setEnvironment(environment);
        }



        if(this.arguments != null)
            for(ParseNode n : arguments) {
                n.setEnvironment(environment);
            }

        this.type = function.getType();
    }
}
