package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.parsenode.Type;
import edu.semo.jatsz.glang.parsenode.ParseNode;

public class Symbol implements ParseNode {
    private Type type;
    private String name;
    private Object value;

    public Symbol(Type type, String name, Object value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void print(String prefix) {
        System.out.println("\t" + value);
    }

    public ParseNode evaluate() {
        return this;
    }

    public String generate() {
        return null;
    }

    public void set(Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public void set(Symbol s) {
        this.type = s.type;
        this.value = s.value;
    }
}