package edu.semo.jatsz.glang.model;

import edu.semo.jatsz.glang.parsenode.Symbol;

public interface SymbolStorage {
    SymbolStorage getParent();
    SymbolTable getSymbolTable();
    Symbol get(String name);
    void set(String name, Symbol sym);
}
