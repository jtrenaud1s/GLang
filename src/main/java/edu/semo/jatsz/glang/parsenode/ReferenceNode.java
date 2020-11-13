package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.ParseTree;

public class ReferenceNode implements ParseNode {
    private Type type;
    private String name;

    public ReferenceNode(String name) {
        this.name = name;
        this.type = ParseTree.get().getSymbolTable().get(name).getType();
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
        return ParseTree.get().getSymbolTable().get(name).evaluate();
    }

    public String getName() {
        return this.name;
    }

}
