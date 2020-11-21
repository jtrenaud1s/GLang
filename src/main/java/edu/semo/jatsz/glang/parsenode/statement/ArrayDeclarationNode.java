package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.model.SymbolStorage;
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

    }

    @Override
    public ParseNode evaluate() {
        if(this.length != null){
            int outerlength = (int) ((Symbol) this.length.evaluate()).getValue();

            if (multiDimensional) {
                generateInnerArrays((int) ((Symbol) this.innerLength.evaluate()).getValue());
            } else {
                Symbol[] s = new Symbol[outerlength];
                for (int i = 0; i < outerlength; i++) {
                    s[i] = new Symbol(type, name + "[" + i + "]", null);
                }
                environment.set(name, new ArraySymbol(type, name, s, outerlength));
            }
        }


        ReferenceNode ref = new ReferenceNode(name);
        ref.setEnvironment(this.environment);
        return ref;
    }

    public void setMulti(boolean mult, ParseNode length) {
        this.multiDimensional = mult;
        this.innerLength = length;
        this.innerLength.setEnvironment(this.environment);
    }



    private transient SymbolStorage environment;
    public void setEnvironment(SymbolStorage env) {
        this.environment = env;
        if(this.length != null)
            this.length.setEnvironment(env);
        if(this.innerLength != null) {
            innerLength.setEnvironment(env);
        }

    }

    @Override
    public void generateSymbols() {
        environment.set(name, new ArraySymbol(type, name, null, 0));

        if(this.length != null)
            this.length.generateSymbols();
        if(this.innerLength != null) {
            innerLength.generateSymbols();
        }
    }

    public void generateInnerArrays(int length) {
        environment.set(name, new ArraySymbol(type, name, null, 0));
        if(this.length != null) {
            int outerlength = (int) ((Symbol) this.length.evaluate()).getValue();
            ArraySymbol[] s = new ArraySymbol[outerlength];
            for (int i = 0; i < outerlength; i++) {
                Symbol[] inner = new Symbol[length];
                for (int j = 0; j < length; j++) {
                    inner[j] = new Symbol(type, name + "[" + i + "][" + j + "](INNER)", null);
                }
                s[i] = new ArraySymbol(type, name + "[" + i + "](OUTER)", inner, length);
            }
            environment.set(name, new ArraySymbol(type, name, s, outerlength));
        }
    }

    @Override
    public void resolveTypes() {
        if(this.length != null)
            length.resolveTypes();
        if(innerLength != null)
            innerLength.resolveTypes();
    }
}
