package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.model.SymbolStorage;

import java.io.Serializable;

public class BinaryOperationNode implements ParseNode, Serializable {
    private ParseNode left;
    private ParseNode right;
    private String operation;
    private Type type;

    public static final long serialVersionUID = 1L;


    public BinaryOperationNode(ParseNode left, String operation, ParseNode right) {
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {
        left.print(prefix);
        System.out.println(prefix + operation);
        right.print(prefix);
    }

    @Override
    public ParseNode evaluate() {
        if(left.getType().equals(Type.STRING) || right.getType().equals(Type.STRING)) {
            String lval = ((Symbol)left.evaluate()).getValue().toString();
            String rval = ((Symbol)right.evaluate()).getValue().toString();
            String result = "";

            switch(this.operation) {
                case "+":
                    result = lval + rval;
                    break;
                default:
                    System.out.println("ERROR DOING MATH");
                    System.exit(-1);
            }

            return new Symbol(this.type, "concatenationResult", result);
        } else {
            double lval;
            double rval;
            double result = 0;

            if(left.getType().equals(Type.INT)) {
                lval = (Integer) ((Symbol)left.evaluate()).getValue();
            } else {
                lval = (Double) ((Symbol)left.evaluate()).getValue();
            }


            if(right.getType().equals(Type.INT)) {
                rval = (Integer) ((Symbol)right.evaluate()).getValue();
            } else {
                rval = (Double) ((Symbol)right.evaluate()).getValue();
            }


            switch(this.operation) {
                case "+":
                    result = lval + rval;
                    break;
                case "-":
                    result = lval - rval;
                    break;
                case "*":
                    result = lval * rval;
                    break;
                case "/":
                    result = lval / rval;
                    break;
                case "^":
                    result = Math.pow(lval, rval);
                    break;
                case "<":
                    result = lval < rval ? 1 : 0;
                    break;
                case ">":
                    result = lval > rval ? 1 : 0;
                    break;
                case "==":
                    result = lval == rval ? 1 : 0;
                    break;
                case "~=":
                    result = lval != rval ? 1 : 0;
                    break;
                case "<=":
                    result = lval <= rval ? 1 : 0;
                    break;
                case ">=":
                    result = lval >= rval ? 1 : 0;
                    break;
                default:
                    System.out.println("ERROR DOING MATH");
                    System.exit(-1);
            }

            if(this.getType().equals(Type.DOUBLE))
                return new Symbol(this.type, "binOpNodeResult", result);
            else
                return new Symbol(this.type, "binOpNodeResult",(int) result);
        }
    }

    private transient SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;

        left.setEnvironment(this.environment);
        right.setEnvironment(this.environment);
    }

    @Override
    public void generateSymbols() {

    }

    @Override
    public void resolveTypes() {
        left.resolveTypes();
        right.resolveTypes();

        if(left.getType().equals(Type.INT) && right.getType().equals(Type.DOUBLE)) {
            System.out.println("Invalid Types!");
            System.exit(-1);
        } else if(left.getType().equals(Type.DOUBLE) && right.getType().equals(Type.INT)) {
            System.out.println("Invalid Types!");
            System.exit(-1);
        }

        this.type = left.getType();
    }
}
