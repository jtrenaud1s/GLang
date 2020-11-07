package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

import javax.sql.StatementEventListener;

public class WhileStatementNode extends StatementNode{

    private ParseNode condition;
    private StatementListNode statement;

    public WhileStatementNode(ParseNode condition, StatementListNode statement) {
        this.condition = condition;
        this.statement = statement;
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
        while ((int)((Symbol)condition.evaluate()).getValue() !=0){
            statement.evaluate();
        }
        return null;
    }
}
