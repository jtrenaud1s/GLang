package edu.semo.jatsz.glang.parsenode;

import java.io.Serializable;
import java.util.Arrays;

public class ArraySymbol extends Symbol implements Serializable{
    private int length;
    private static final long serialVersionUID = 1L;

    public ArraySymbol(Type type, String name, Object value, int length) {
        super(type, name, value);
        this.length = length;
    }

    public Symbol get(int index) {
        return ((Symbol[]) getValue())[index];
    }

    public int getLength() {
        return this.length;
    }

    public String toString() {
        String value = "";
        if(getValue() == null) {
            value = "null";
        } else {
            if(getValue().getClass().isArray()){
                value = Arrays.toString((Object[]) getValue());
            } else {
                value = getValue().toString();
            }
        }
        return value ;
    }
}
