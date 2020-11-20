package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

import java.io.Serializable;

public class IfStatementNode extends StatementNode implements Serializable {
    private ParseNode condition;
    private StatementListNode body;
    private StatementListNode elseBody;
    private transient SymbolStorage environment;

    private static final long serialVersionUID = 1L;

    public IfStatementNode(ParseNode condition, StatementListNode body, StatementListNode elseBody) {
        super();
        this.condition = condition;
        this.body = body;
        this.elseBody = elseBody;
    }

    @Override
    public Type getType() {
        return ((StatementListNode)getEnvironment()).getType();
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

    @Override
    public void generateSymbols() {
        condition.generateSymbols();
        body.generateSymbols();
        if(elseBody != null)
            elseBody.generateSymbols();
    }

    @Override
    public void resolveTypes() {
        condition.resolveTypes();
        body.setReturnType(((StatementListNode)environment).getReturnType());
        body.resolveTypes();
        if(elseBody != null){
            elseBody.setReturnType(((StatementListNode)environment).getReturnType());
            elseBody.resolveTypes();
        }
    }
}
