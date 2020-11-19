package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

public class IfStatementNode extends StatementNode {
    private ParseNode condition;
    private StatementListNode body;
    private StatementListNode elseBody;
    private transient SymbolStorage environment;

    public IfStatementNode(ParseNode condition, StatementListNode body, StatementListNode elseBody) {
        super();
        this.condition = condition;
        this.body = body;
        this.elseBody = elseBody;
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
        Symbol result = (Symbol) condition.evaluate();

        if(!result.getType().equals(Type.INT)) {
            System.out.println("Can't evaluate a non-boolean condition!");
            System.exit(-1);
        }

        if((int)result.getValue() != 0) {
            return this.body.evaluate();
        } else {
            if(elseBody != null)
                return elseBody.evaluate();
        }
        return null;
    }

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        this.condition.setEnvironment(environment);
        this.body.setEnvironment(environment);

        if(this.elseBody != null)
            this.elseBody.setEnvironment(environment);
    }
}
