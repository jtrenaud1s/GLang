package edu.semo.jatsz.glang.model;


import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.classnode.ClassDeclarationNode;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class SymbolTable implements Serializable
{
    private final Map<String, Symbol> map;

    public static final long serialVersionUID = 1L;

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
        for(Map.Entry<String, Symbol> entry : map.entrySet()) {
            s.set(entry.getKey(), SerializationUtils.clone(entry.getValue()));
        }
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

    public void generateSymbols() {
        for(Map.Entry<String, Symbol> entry : map.entrySet()) {
            if(entry.getValue().getValue() != null)
                ((ParseNode) entry.getValue().getValue()).generateSymbols();
        }
    }

    public void resolveTypes() {
        for(Map.Entry<String, Symbol> entry : map.entrySet()) {
            if(entry.getValue().getValue() != null)
                ((ParseNode) entry.getValue().getValue()).resolveTypes();
        }
    }
}