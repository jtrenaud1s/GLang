package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

import javax.swing.plaf.nimbus.State;

public class ForStatementNode extends StatementNode {
    private ParseNode condition;
    private StatementListNode statement;
    private AssignmentNode assign;
    private ParseNode increment;

    public ForStatementNode(AssignmentNode assign, ParseNode condition, ParseNode increment, StatementListNode statement) {
        this.assign = assign;
        this.condition = condition;
        this.statement = statement;
        this.increment = increment;
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
        assign.evaluate();
        while ((int)((Symbol)condition.evaluate()).getValue() !=0){
            statement.evaluate();
            increment.evaluate();
        }
        return null;
    }
}


