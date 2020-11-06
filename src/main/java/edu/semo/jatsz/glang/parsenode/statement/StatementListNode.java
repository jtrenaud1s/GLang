package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Type;

import java.util.ArrayList;
import java.util.List;

public class StatementListNode implements ParseNode {
    private List<StatementNode> statements;

    public StatementListNode(StatementNode statement) {
        this.statements = new ArrayList<>();
        this.statements.add(statement);
    }

    public void add(StatementNode statement) {
        this.statements.add(statement);
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
        for(StatementNode statement : statements) {
            statement.evaluate();
        }
        return null;
    }
}
