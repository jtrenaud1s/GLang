package edu.semo.jatsz.glang.parsenode;

public interface ParseNode {
    Type getType();
    void print(String prefix);
    ParseNode evaluate();
}