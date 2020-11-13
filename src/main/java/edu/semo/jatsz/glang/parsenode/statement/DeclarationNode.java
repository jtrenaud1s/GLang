package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.ParseTree;
import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.ReferenceNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

public class DeclarationNode extends StatementNode {
    private Type type;
    private String name;

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
        this.getEnvironment().set(name, new Symbol(this.type, name, null));
        ReferenceNode ref = new ReferenceNode(name);
        ref.setEnvironment(this.getEnvironment());
        return ref;
    }

    public String getName() {
        return name;
    }


    private SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;

        this.environment.set(name, new Symbol(this.type, name, null));

    }
}
