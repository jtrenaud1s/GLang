package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.model.SymbolStorage;

import java.io.Serializable;

public class ReferenceNode implements ParseNode, Serializable {
    private Type type;
    private String name;
    public static final long serialVersionUID = 1;

    public ReferenceNode(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + name);
    }

    @Override
    public ParseNode evaluate() {
        if(name.equals("length") || name.equals("split") || name.equals("sub"))
            return null;
        return this.environment.get(name).evaluate();
    }

    public String getName() {
        return this.name;
    }

    private transient SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
            this.environment = environment;
    }

    @Override
    public void generateSymbols() {

    }

    @Override
    public void resolveTypes() {
        if (!this.environment.has(name) && !(name.equals("length") || name.equals("split") || name.equals("sub"))) {
            System.out.println("Symbol " + name + " does not exist!");
            System.exit(-1);
            return;
        }
        if (!(name.equals("length") || name.equals("split") || name.equals("sub")))
            this.type = this.environment.get(name).getType();
        else {
            switch (name) {
                case "length":
                    this.type = Type.INT;
                    break;
                case "split":
                case "sub":
                    this.type = Type.STRING;
                    break;
            }
        }
    }

}
