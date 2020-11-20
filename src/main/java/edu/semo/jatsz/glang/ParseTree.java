package edu.semo.jatsz.glang;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.model.SymbolTable;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Stack;

public class ParseTree implements SymbolStorage, Serializable {
    private SymbolTable global;
    private static ParseTree instance = null;
    private Scanner s;
    private Stack<ParseNode> stack;

    public static long serialVersionUID = 1L;

    public ParseTree() {
        this.global = new SymbolTable();
        s = new Scanner(System.in);
        instance = this;
        this.stack = new Stack<>();
    }

    @Override
    public SymbolTable getSymbolTable() {
        return this.global;
    }

    @Override
    public Symbol get(String name) {
        if(global.get(name) == null) {
            System.out.println("Symbol " + name + " not found!");
            //System.exit(-1);
        }
        return global.get(name);
    }

    @Override
    public boolean has(String name) {
        return this.getSymbolTable().containsSymbol(name);
    }

    @Override
    public String getName() {
        return "ParseTree";
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

    public Stack<ParseNode> getStack() {
        return stack;
    }
}
