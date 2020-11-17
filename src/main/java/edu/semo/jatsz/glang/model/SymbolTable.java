package edu.semo.jatsz.glang.model;


import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.classnode.ClassDeclarationNode;

import java.util.Map;

public class SymbolTable implements Cloneable
{
    private final Map<String, Symbol> map;

    public SymbolTable() {
        map = new java.util.LinkedHashMap<>();
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
    public SymbolTable clone() {
        SymbolTable s = new SymbolTable();
        s.map.putAll(this.map);
        return s;
    }

    public void print() {
        System.out.println("Symbol Table");
        for(Map.Entry<String, Symbol> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ----- " + entry.getValue().getValue() + (entry.getValue().getValue() != null ? ("::" + entry.getValue().getValue().getClass().getSimpleName()) : "null"));
        }
        System.out.println();
    }

    public void setSymbolEnvironments(SymbolStorage environment) {
        for(Map.Entry<String, Symbol> entry : map.entrySet()) {
            if(entry.getValue().getValue() != null)
                ((ParseNode) entry.getValue().getValue()).setEnvironment(environment);
        }
    }

    public String getMemberString(String prefix) {
        StringBuilder members = new StringBuilder();
        for(Map.Entry<String, Symbol> entry : map.entrySet()) {
            if(entry.getValue().getValue() instanceof ClassDeclarationNode) {
                ClassDeclarationNode member = (ClassDeclarationNode) entry.getValue().getValue();
                members.append(prefix).append(entry.getKey()).append(": ").append("\n");
                members.append(prefix).append(member.getSymbolTable().getMemberString("\t"));
            } else
            members.append(prefix).append(entry.getKey()).append(": ").append(entry.getValue().getValue()).append("\n");
        }
        return members.toString();
    }
}