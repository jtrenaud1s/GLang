package edu.semo.jatsz.glang.parsenode.classnode;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.model.SymbolTable;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;
import edu.semo.jatsz.glang.parsenode.statement.StatementNode;

import java.io.Serializable;

public class ClassDefinitionNode extends StatementNode implements SymbolStorage, Serializable {
    private final String name;
    private final SymbolTable table;
    private transient SymbolStorage environment;

    public ClassDefinitionNode(String name, SymbolTable table) {
        this.name = name;
        this.table = table;
    }

    @Override
    public Type getType() {
        return Type.CLASS_DEF;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + " Class Definition " + name);
    }

    @Override
    public ParseNode evaluate() {
        this.environment.set(name, new Symbol(Type.CLASS_DEF, this.name, this));
        return null;
    }

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
        this.environment.set(name, new Symbol(Type.CLASS_DEF, this.name, this));
        this.table.setSymbolEnvironments(this);
    }

    @Override
    public void resolveTypes() {

    }

    public String getName() {
        return name;
    }

    @Override
    public SymbolTable getSymbolTable() {
        return this.table;
    }

    @Override
    public Symbol get(String name) {
        if(this.table.containsSymbol(name))
            return this.table.get(name);
        else
            return this.environment.get(name);
    }

    @Override
    public boolean has(String name) {
        if(this.table.containsSymbol(name))
            return true;
        else
            return this.environment.has(name);
    }

    @Override
    public void set(String name, Symbol sym) {
        this.table.set(name, sym);
    }
}
