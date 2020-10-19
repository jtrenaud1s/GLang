package edu.semo.jatsz.glang.parsenode;

public interface ParseNode {
    void print(String prefix);

    Object evaluate();

    String generate();
}