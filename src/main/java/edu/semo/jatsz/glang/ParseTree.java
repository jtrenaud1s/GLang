package edu.semo.jatsz.glang;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.model.SymbolTable;

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

    public static ParseTree get() {
        if (instance == null)
            return new ParseTree();
        return instance;
    }

    public Scanner getScanner() {
        return this.s;
    }
}
