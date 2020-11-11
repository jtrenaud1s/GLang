package edu.semo.jatsz.glang.parsenode;

public class UnaryOperationNode implements ParseNode{
    private String operation;
    private ParseNode expression;

    public UnaryOperationNode(String operation, ParseNode expression){
        this.operation = operation;
        this.expression = expression;
        if (!expression.getType().equals(Type.INT) && !expression.getType().equals(Type.DOUBLE)){
            System.out.println("Error: invalid data type");
            System.exit(-1);
        }
    }

    @Override
    public Type getType() {
        return Type.NULL;
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
                result = -1 * rval;
                break;
            default:
                System.out.println("ERROR DOING MATH");
                System.exit(-1);
        }

        if(this.getType().equals(Type.DOUBLE))
            return new Symbol(expression.getType(), "binOpNodeResult", result);
        else
            return new Symbol(expression.getType(), "binOpNodeResult",(int) result);
    }
}
