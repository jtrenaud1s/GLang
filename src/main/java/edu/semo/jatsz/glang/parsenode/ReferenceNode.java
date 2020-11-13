package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.model.SymbolStorage;

public class ReferenceNode implements ParseNode {
    private Type type;
    private String name;

    public ReferenceNode(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {
        System.out.println("\t" + name);
    }

    @Override
    public ParseNode evaluate() {
        return getEnvironment().get(name).evaluate();
    }

    public String getName() {
        return this.name;
    }

    private SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        this.type = this.environment.get(name).getType();

    }

}
