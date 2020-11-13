package edu.semo.jatsz.glang;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.model.SymbolTable;
import edu.semo.jatsz.glang.parsenode.Symbol;

import java.util.Scanner;

public class ParseTree implements SymbolStorage {
    private SymbolTable global;
    private static ParseTree instance = null;
    private Scanner s;

    public ParseTree() {
        this.global = new SymbolTable();
        s = new Scanner(System.in);
        instance = this;
    }

    @Override
    public SymbolStorage getParent() {
        return null;
    }

    @Override
    public SymbolTable getSymbolTable() {
        return this.global;
    }

    @Override
    public Symbol get(String name) {
        return global.get(name);
    }

    @Override
    public void set(String name, Symbol sym) {
        global.set(name, sym);
    }

    public static ParseTree get() {
        if (instance == null)
            return new ParseTree();
        return instance;
    }

    public Scanner getScanner() {
        return this.s;
    }
}
