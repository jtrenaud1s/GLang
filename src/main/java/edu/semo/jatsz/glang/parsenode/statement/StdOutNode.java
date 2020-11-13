package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        Object o = ((Symbol)output.evaluate()).getValue();
        if(o.getClass().isArray()) {
            System.out.println(Arrays.toString((Object[]) o));
        }
        System.out.println(o.toString());
        return null;
    }

    private SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        this.output.setEnvironment(this.getEnvironment());
    }
}
