package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.model.SymbolStorage;

public interface ParseNode {
    Type getType();
    void print(String prefix);
    ParseNode evaluate();
    SymbolStorage getEnvironment();
    void setEnvironment(SymbolStorage environment);
    void generateSymbols();
    void resolveTypes();
}