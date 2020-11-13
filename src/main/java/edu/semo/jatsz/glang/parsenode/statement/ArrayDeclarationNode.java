package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.ParseTree;
import edu.semo.jatsz.glang.parsenode.*;

public class ArrayDeclarationNode extends DeclarationNode {
    private String name;
    private ParseNode length;
    private Type type;
    private ParseNode innerLength;
    private boolean multiDimensional;
    public ArrayDeclarationNode(Type type, String name, ParseNode length) {
        super(type, name);
        this.type = type;
        this.name = name;
        this.multiDimensional = false;
        this.length = length;
        ParseTree.get().getSymbolTable().set(name, new ArraySymbol(this.type, name, null, 0));
    }

    @Override
    public ParseNode evaluate() {
        int outerlength = (int)((Symbol)this.length.evaluate()).getValue();




        if(multiDimensional) {
            generateInnerArrays((int)((Symbol)this.innerLength.evaluate()).getValue());
        } else {
            Symbol[] s = new Symbol[outerlength];
            for(int i = 0; i < outerlength; i++) {
                s[i] = new Symbol(type, name + "[" + i + "]", null);
            }
            ParseTree.get().getSymbolTable().set(name, new ArraySymbol(type, name, s, outerlength));
        }

        return new ReferenceNode(name);
    }

    public void setMulti(boolean mult, ParseNode length) {
        this.multiDimensional = mult;
        this.innerLength = length;
    }

    public void generateInnerArrays(int length) {
        int outerlength = (int)((Symbol)this.length.evaluate()).getValue();
        ArraySymbol[] s = new ArraySymbol[outerlength];
        for(int i = 0; i < outerlength; i++) {
            Symbol[] inner = new Symbol[length];
            for(int j = 0; j < length; j++) {
                inner[j] = new Symbol(type, name + "[" + i + "][" + j + "](INNER)", null);
            }
            s[i] = new ArraySymbol(type, name + "[" + i + "](OUTER)", inner, length);
        }
        ParseTree.get().getSymbolTable().set(name, new ArraySymbol(type, name, s, outerlength));
    }
}
