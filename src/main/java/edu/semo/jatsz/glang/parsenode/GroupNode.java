package edu.semo.jatsz.glang.parsenode;

public class GroupNode implements ParseNode{
    private ParseNode expression;
    private Type type;

    public GroupNode(ParseNode expression) {
        this.expression = expression;
        this.type = expression.getType();
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {
        expression.print(prefix);
    }

    @Override
    public ParseNode evaluate() {
        return expression.evaluate();
    }
}
