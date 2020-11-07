package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.ParseTree;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.ReferenceNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

public class StdInNode extends StatementNode {
    private ReferenceNode ref;

    public StdInNode(ReferenceNode referenceNode) {
        this.ref = referenceNode;
    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public void print(String prefix) {

    }

    @Override
    public ParseNode evaluate() {
        String value = ParseTree.get().getScanner().nextLine().trim();
        try {
            ((Symbol)ref.evaluate()).setValue(Integer.parseInt(value));
        } catch (Exception e){
            //System.out.println("Input was not an int!");
            try {
                ((Symbol)ref.evaluate()).setValue(Double.parseDouble(value));
            } catch (Exception e2) {
                //System.out.println("Input was not a double!");
            }
        }
        return null;
    }
}
