package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.ParseTree;
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
        s.set(n);
        return null;
    }

}
