package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.ParseTree;
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
        ParseTree.get().getSymbolTable().set(name, new Symbol(this.type, name, null));
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
        ParseTree.get().getSymbolTable().set(name, new Symbol(this.type, name, null));
        return new ReferenceNode(name);
    }

    public String getName() {
        return name;
    }
}
