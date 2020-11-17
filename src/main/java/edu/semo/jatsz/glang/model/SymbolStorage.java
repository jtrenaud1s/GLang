package edu.semo.jatsz.glang.model;

import edu.semo.jatsz.glang.parsenode.Symbol;

public interface SymbolStorage {
    SymbolTable getSymbolTable();
    Symbol get(String name);
    boolean has(String name);
    void set(String name, Symbol sym);
}
