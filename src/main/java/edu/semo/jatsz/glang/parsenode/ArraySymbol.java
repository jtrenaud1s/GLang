package edu.semo.jatsz.glang.parsenode;

import java.util.Arrays;

public class ArraySymbol extends Symbol {
    private int length;
    private Type type;
    private String name;
    private Object value;

    public ArraySymbol(Type type, String name, Object value, int length) {
        super(type, name, value);
        this.length = length;
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public Symbol get(int index) {
        return ((Symbol[]) value)[index];
    }

    public int getLength() {
        return this.length;
    }

    public String toString() {
        String value = "";
        if(this.value == null) {
            value = "null";
        } else {
            if(this.value.getClass().isArray()){
                value = Arrays.toString((Object[]) this.value);
            } else {
                value = this.value.toString();
            }
        }
        return this.type + " " + this.name + "[" + this.length + "] = " + value ;
    }
}
