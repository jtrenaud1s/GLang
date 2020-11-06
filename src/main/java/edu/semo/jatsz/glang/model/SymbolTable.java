package edu.semo.jatsz.glang.model;


import edu.semo.jatsz.glang.parsenode.Symbol;

import java.util.Map;

public class SymbolTable implements Cloneable
{
    private final Map<String, Symbol> map;

    public SymbolTable() {
        //create the map for storing the symbols
        map = new java.util.HashMap<>();
    }

    public void set(String name, Symbol value) {
        if(containsSymbol(name)) {
            map.replace(name, value);
        } else {
            map.put(name, value);
        }
    }

    public Symbol get(String name) {
        if(containsSymbol(name)) {
            return map.get(name);
        }

        return null;
    }

    public boolean containsSymbol(String name) {
        return map.containsKey(name);
    }

    @Override
    public SymbolTable clone() throws CloneNotSupportedException {
        super.clone();
        SymbolTable s = new SymbolTable();
        s.map.putAll(this.map);
        return s;
    }

    public void print() {
        System.out.println("Symbol Table");
        for(Map.Entry<String, Symbol> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ----- " + entry.getValue().getValue());
        }
        System.out.println();
    }
}