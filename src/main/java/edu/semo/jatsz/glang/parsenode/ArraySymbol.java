package edu.semo.jatsz.glang.parsenode;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.Arrays;

public class ArraySymbol extends Symbol implements Serializable {
    private int length;
    private Type type;
    private String name;
    private Object value;

    private static final long serialVersionUID = 1L;

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
        return value ;
    }

    @Override
    public void generateSymbols() {

    }

    @Override
    public void resolveTypes() {

    }
}
