package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.ParseTree;
import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.ReferenceNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

import java.io.Serializable;

public class DeclarationNode extends StatementNode implements Serializable {
    private Type type;
    private String name;
    public static final long serialVersionUID = 1;

    public DeclarationNode(Type type, String name) {
        this.type = type;
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
        ReferenceNode ref = new ReferenceNode(name);
        ref.setEnvironment(this.getEnvironment());
        ref.generateSymbols();
        ref.resolveTypes();
        return ref;
    }

    public String getName() {
        return name;
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
        this.environment.set(name, new Symbol(this.type, name, null));
    }

    @Override
    public void resolveTypes() {

    }
}
