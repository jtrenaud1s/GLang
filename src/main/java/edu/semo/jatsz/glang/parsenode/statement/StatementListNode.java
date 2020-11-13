package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.model.SymbolTable;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

import java.util.ArrayList;
import java.util.List;

public class StatementListNode implements ParseNode, SymbolStorage {
    private List<StatementNode> statements;

    public StatementListNode(StatementNode statement) {
        this.statements = new ArrayList<>();
        this.statements.add(statement);
        this.table = new SymbolTable();

    }

    public void add(StatementNode statement) {
        this.statements.add(statement);
    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public void print(String prefix) {

    }

    @Override
    public ParseNode evaluate() {
        for(StatementNode statement : statements) {
            statement.evaluate();
        }
        return null;
    }

    private SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        for(StatementNode n : statements) {
            n.setEnvironment(this);
        }
    }

    private SymbolTable table;

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
    public void set(String name, Symbol sym) {
        this.table.set(name, sym);
    }
}
