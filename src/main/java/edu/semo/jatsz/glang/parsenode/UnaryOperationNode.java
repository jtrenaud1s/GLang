package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.model.SymbolStorage;

public class UnaryOperationNode implements ParseNode{
    private String operation;
    private ParseNode expression;

    public UnaryOperationNode(String operation, ParseNode expression){
        this.operation = operation;
        this.expression = expression;

    }

    @Override
    public Type getType() {
        return expression.getType();
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + operation);
        expression.print(prefix);
    }

    @Override
    public ParseNode evaluate() {
        double rval;
        double result = 0;

        if(expression.getType().equals(Type.INT)) {
            rval = (Integer) ((Symbol)expression.evaluate()).getValue();
        } else {
            rval = (Double) ((Symbol)expression.evaluate()).getValue();
        }

        switch(this.operation) {
            case "-":
                result = -rval;
                break;
            default:
                System.out.println("ERROR NEGATING");
                System.exit(-1);
        }

        if(expression.getType().equals(Type.DOUBLE))
            return new Symbol(Type.DOUBLE, "unOpNodeResult", result);
        else
            return new Symbol(Type.INT, "unOpNodeResult",(int) result);
    }

    private transient SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;

        expression.setEnvironment(this.getEnvironment());
    }

    @Override
    public void generateSymbols() {
        expression.generateSymbols();
    }

    @Override
    public void resolveTypes() {
        expression.resolveTypes();
        if (!expression.getType().equals(Type.INT) && !expression.getType().equals(Type.DOUBLE)){
            System.out.println("Error: invalid data type");
            System.exit(-1);
        }
    }
}
