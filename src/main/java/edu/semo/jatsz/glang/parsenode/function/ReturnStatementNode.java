package edu.semo.jatsz.glang.parsenode.function;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.Type;
import edu.semo.jatsz.glang.parsenode.statement.StatementListNode;

import java.io.Serializable;

public class ReturnStatementNode implements ParseNode, Serializable {
    private ParseNode expression;
    private Type type;
    private transient SymbolStorage environment;

    public static final long serialVersionUID = 1L;

    public ReturnStatementNode(ParseNode expression) {
        this.expression = expression;
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
        if(expression == null) {
            return null;
        }
        return expression.evaluate();
    }

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        if(expression != null)
            this.expression.setEnvironment(environment);
    }

    @Override
    public void generateSymbols() {
        if(expression != null)
        expression.generateSymbols();
    }

    @Override
    public void resolveTypes() {
        if(expression != null) {
            expression.resolveTypes();
            this.type = expression.getType();
        } else {
            this.type = Type.NULL;
        }
        StatementListNode env = (StatementListNode) environment;
        if(!this.type.equals(env.getReturnType())) {
            System.out.println("Returning the wrong type from the function!");
            System.exit(-1);
        }
    }
}
