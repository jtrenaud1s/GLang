package edu.semo.jatsz.glang.parsenode;

import edu.semo.jatsz.glang.ParseTree;

public class ArrayReferenceNode extends ReferenceNode {
    private ParseNode index;
    private ReferenceNode ref;
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
            return array.evaluate();
        }
    }

    @Override
    public String getName() {
        return ref.getName();
    }

}
