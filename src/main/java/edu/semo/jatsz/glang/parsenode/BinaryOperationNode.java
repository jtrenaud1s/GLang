package edu.semo.jatsz.glang.parsenode;

public class BinaryOperationNode implements ParseNode{
    private ParseNode left;
    private ParseNode right;
    private String operation;
    private Type type;

    public BinaryOperationNode(ParseNode left, String operation, ParseNode right) {
        this.left = left;
        this.operation = operation;
        this.right = right;

        if(left.getType().equals(Type.INT) && right.getType().equals(Type.DOUBLE)) {
            System.out.println("Invalid Types!");
            System.exit(-1);
        } else if(left.getType().equals(Type.DOUBLE) && right.getType().equals(Type.INT)) {
            System.out.println("Invalid Types!");
            System.exit(-1);
        } else if((left.getType().equals(Type.STRING) && !right.getType().equals(Type.STRING)) || (!left.getType().equals(Type.STRING) && right.getType().equals(Type.STRING))) {
            System.out.println("Invalid Types!");
            System.exit(-1);
        }

        this.type = left.getType();
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
        if(left.getType().equals(Type.STRING) && right.getType().equals(Type.STRING)) {
            String lval = (String)((Symbol)left.evaluate()).getValue();
            String rval = (String)((Symbol)right.evaluate()).getValue();
            String result = "";

            switch(this.operation) {
                case "+":
                    result = lval + rval;
                    break;
                default:
                    System.out.println("ERROR DOING MATH");
                    System.exit(-1);
            }

            return new Symbol(this.type, "binOpNodeResult", result);
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
}
