package edu.semo.jatsz.glang.parsenode.classnode;

import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

public class ClassSymbol extends Symbol {
    private String className;
    public ClassSymbol(String type, String name, Object value) {
        super(Type.CLASS, name, value);
        this.className = type;
    }

    public String getClassName() {
        return className;
    }
}
