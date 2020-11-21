package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.ParseTree;
import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.model.SymbolTable;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.ReferenceNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;
import edu.semo.jatsz.glang.parsenode.function.ReturnStatementNode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StatementListNode implements ParseNode, SymbolStorage, Serializable {
    private List<ParseNode> statements;
    private Type returnType = Type.NULL;
    private String name;

    public static long serialVersionUID = 1;

    public StatementListNode(ParseNode statement) {
        this.statements = new ArrayList<>();
        this.statements.add(statement);
        this.table = new SymbolTable();

    }

    public void add(ParseNode statement) {
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
        for(ParseNode statement : statements) {
            ParseNode eval = statement.evaluate();
            if(statement instanceof ReturnStatementNode)
                return eval;
            if (eval != null && !(eval instanceof ReferenceNode)) {
                return eval;
            }
        }
        return null;
    }

    private transient SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        for(ParseNode n : statements) {
            n.setEnvironment(this);
        }
    }

    @Override
    public void generateSymbols() {
        for(ParseNode n : statements) {
            n.generateSymbols();
        }
    }

    @Override
    public void resolveTypes() {
        for(ParseNode n : statements) {
            n.resolveTypes();
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
    public boolean has(String name) {
        if(this.table.containsSymbol(name))
            return true;
        else
            return this.environment.has(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void set(String name, Symbol sym) {
        this.table.set(name, sym);
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
}
