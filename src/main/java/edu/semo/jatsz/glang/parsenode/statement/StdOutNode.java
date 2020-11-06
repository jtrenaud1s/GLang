package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

public class StdOutNode extends StatementNode{
    private ParseNode output;
    public StdOutNode(ParseNode output) {
        this.output = output;
    }

    @Override
    public Type getType() {
        return Type.NULL;
    }

    @Override
    public void print(String prefix) {
        output.print(prefix);
    }

    @Override
    public ParseNode evaluate() {
        System.out.println(((Symbol)output.evaluate()).getValue());
        return null;
    }
}
