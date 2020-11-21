package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;

import java.io.Serializable;

public class WhileStatementNode extends StatementNode implements Serializable {

    private ParseNode condition;
    private StatementListNode statements;
    private Type type;

    public static final long serialVersionUID = 1L;

    public WhileStatementNode(ParseNode condition, StatementListNode statements) {
        this.condition = condition;
        this.statements = statements;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {

    }

    @Override
    public ParseNode evaluate() {

        while ((int)((Symbol)condition.evaluate()).getValue() !=0){
            statements.evaluate();
        }
        return null;
    }

    private transient SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        statements.setEnvironment(this.environment);

        condition.setEnvironment(statements);

    }

    @Override
    public void generateSymbols() {
        statements.generateSymbols();
        condition.generateSymbols();
    }

    @Override
    public void resolveTypes() {
        statements.resolveTypes();
        condition.resolveTypes();
        this.type = ((StatementListNode)this.getEnvironment()).getReturnType();
    }
}
