package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.model.SymbolStorage;

import java.io.Serializable;

public class GroupNode implements ParseNode, Serializable {
    private ParseNode expression;
    private Type type;

    public static final long serialVersionUID = 1L;

    public GroupNode(ParseNode expression) {
        this.expression = expression;
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

    private transient SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        expression.setEnvironment(this.environment);
    }

    @Override
    public void generateSymbols() {
        expression.generateSymbols();
    }

    @Override
    public void resolveTypes() {
        expression.resolveTypes();
        this.type = expression.getType();
    }
}
