package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.ReferenceNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

public class AssignmentNode extends StatementNode {
    private Type type;
    private ReferenceNode ref;
    private ParseNode expression;



    public AssignmentNode(ReferenceNode referenceNode, ParseNode parseNode) {
        super();
        this.type = referenceNode.getType();
        this.ref = referenceNode;
        this.expression = parseNode;


    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {
       ref.print(prefix);
       expression.print(prefix);
    }

    @Override
    public ParseNode evaluate() {

        Symbol s = (Symbol) ref.evaluate();
        Symbol n = (Symbol) expression.evaluate();

        if(s.getType().equals(Type.DOUBLE) && n.getType().equals(Type.INT)) {
            double value = (Integer) n.getValue();
            n.setValue(value);
        }


        s.set(n);
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
        ref.setEnvironment(this.environment);

        expression.setEnvironment(this.environment);

        // Compare types of the variable and the value you're trying to store in it.
        if(ref.getType().equals(Type.INT) && expression.getType().equals(Type.DOUBLE)) {
            System.out.println("Cannot store a double value in an integer variable, you will lose data!");
            System.exit(-1);
        }
    }


}
