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

        if(!left.getType().equals(Type.INT) || !right.getType().equals(Type.INT)) {
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
        int lval = (Integer) ((Symbol)left.evaluate()).getValue();
        int rval = (Integer) ((Symbol)right.evaluate()).getValue();

        int result = 0;

        switch(this.operation) {
            case "+":
                result = lval + rval;
                break;
            case "-":
                result = lval - rval;
                break;
            default:
                System.out.println("ERROR DOING MATH");
                System.exit(-1);
        }
        return new Symbol(Type.INT, "binOpNodeResult", result);
    }
}
