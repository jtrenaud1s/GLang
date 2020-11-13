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
        index.setEnvironment(this.getEnvironment());
        ref.setEnvironment(this.getEnvironment());

        int index = (int)((Symbol)this.index.evaluate()).getValue();
        Symbol array = (Symbol)ref.evaluate();

        if(array instanceof ArraySymbol) {
            return ((ArraySymbol) array.evaluate()).get(index);
        } else {
            return array.evaluate();
        }
    }

    @Override
    public String getName() {
        return ref.getName();
    }

    @Override
    public Type getType() {
        return this.type;
    }

    private SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;

        ref.setEnvironment(this.getEnvironment());
        index.setEnvironment(this.getEnvironment());

        this.type = ref.getType();
    }

}
