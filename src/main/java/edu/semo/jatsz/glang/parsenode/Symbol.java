package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.Type;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.classnode.ClassDeclarationNode;

import java.io.Serializable;
import java.util.Arrays;

public class Symbol implements ParseNode, Serializable {
    private Type type;
    private String name;
    private Object value;

    public static final long serialVersionUID = 1L;


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

    public void set(Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public void set(Symbol s) {
        this.type = s.type;
        this.value = s.value;
    }

    @Override
    public String toString() {
        String value = "";
        if(this.value == null) {
            value = "null";
        } else {
            value = this.value.toString();
        }
        return value;
    }


    @Override
    public SymbolStorage getEnvironment() {
        return null;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
    }

    @Override
    public void generateSymbols() {}

    @Override
    public void resolveTypes() {}
}
