package edu.semo.jatsz.glang.parsenode.function;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ArraySymbol;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;
import edu.semo.jatsz.glang.parsenode.classnode.ClassDeclarationNode;
import edu.semo.jatsz.glang.parsenode.classnode.ClassSymbol;
import edu.semo.jatsz.glang.parsenode.statement.ArrayDeclarationNode;
import edu.semo.jatsz.glang.parsenode.statement.DeclarationNode;
import edu.semo.jatsz.glang.parsenode.statement.StatementListNode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDefinitionNode extends DeclarationNode implements Serializable {
    private Type type;
    private String name;
    private ArrayList<DeclarationNode> parameters;
    private StatementListNode body;

    private transient SymbolStorage environment;

    public static long serialVersionUID = 1;

    public FunctionDefinitionNode(Type type, String name, ArrayList<DeclarationNode> parameters, StatementListNode body) {
        super(type, name);
        this.type = type;
        this.name = name;
        if(parameters != null)
            this.parameters = parameters;
        else
            this.parameters = new ArrayList<>();
        this.body = body;
        this.body.setReturnType(this.type);
        body.setName("function body");
    }

    public ParseNode call(ArrayList<ParseNode> arguments) {
        if(arguments.size() != parameters.size()) {
            System.out.println("Number of arguments doesn't match function signature!");
            System.exit(-1);
        }
        for(int i = 0; i < arguments.size(); i++) {
            if(arguments.get(i).getType() != parameters.get(i).getType()){
                System.out.println("Argument types don't match function signature!");
                System.exit(-1);
            }

            if(!(arguments.get(i) instanceof ArraySymbol) && (parameters.get(i) instanceof ArrayDeclarationNode)) {
                System.out.println("An array was expected, but not given!");
                System.exit(-1);
            }
        }

        for(int i = 0; i < arguments.size(); i++) {
            DeclarationNode param = parameters.get(i);
            ParseNode arg = arguments.get(i);
            body.set(param.getName(), (Symbol) arg.evaluate().evaluate());
        }

        return body.evaluate();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {
        System.out.println(type + " " + name);
    }

    @Override
    public ParseNode evaluate() {
        this.environment.set(this.name, new FunctionSymbol(this.type, this.name, this));
        return null;
    }

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        for(DeclarationNode d : this.parameters) {
            d.setEnvironment(this.body);
        }
        this.body.setEnvironment(environment);
    }

    @Override
    public void generateSymbols() {
        body.generateSymbols();
        for(DeclarationNode d : this.parameters) {
            if (d instanceof ClassDeclarationNode)
                body.set(d.getName(), new ClassSymbol(((ClassDeclarationNode) d).getClassName(), d.getName(), null));
            else
            body.set(d.getName(), new Symbol(d.getType(), d.getName(), null));
        }
        evaluate();
    }

    @Override
    public void resolveTypes() {
        body.resolveTypes();
    }

    public String toString(){
        String params = "";
        if(parameters.size() == 0)
            return "function()";
        params += parameters.get(0).getType() + " " + parameters.get(0).getName();
        for(DeclarationNode p : parameters.subList(1, parameters.size())) {
            params += ", " + p.getType() + " " + p.getName();
        }
        return "function(" + params + ")";
    }
}
