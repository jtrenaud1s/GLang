package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.ParseTree;
import edu.semo.jatsz.glang.model.SymbolStorage;

public class ArrayReferenceNode extends ReferenceNode {
    private ParseNode index;
    private ReferenceNode ref;
    private Type type;
    public ArrayReferenceNode(ReferenceNode ref, ParseNode index) {
        super(ref.getName());

        this.index = index;
        this.ref = ref;
    }

    @Override
    public ParseNode evaluate() {
        int index = (int)((Symbol)this.index.evaluate()).getValue();
        Symbol array = (Symbol)ref.evaluate();

        if(array instanceof ArraySymbol) {
            return ((ArraySymbol) array.evaluate()).get(index);
        } else {
            System.out.println("Symbol is not an array: " + ref.getName());
            System.exit(-1);
        }
        return array.evaluate();
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "Array Reference " + this.getName() + "");
    }

    @Override
    public String getName() {
        return ref.getName();
    }

    @Override
    public Type getType() {
        return this.type;
    }

    private transient SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;

        ref.setEnvironment(this.environment);
        index.setEnvironment(this.environment);
    }

    @Override
    public void generateSymbols() {
        ref.generateSymbols();
        index.generateSymbols();
    }

    @Override
    public void resolveTypes() {
        ref.resolveTypes();
        index.resolveTypes();
        this.type = ref.getType();

    }

}
