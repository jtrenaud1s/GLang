package edu.semo.jatsz.glang.parsenode.statement;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.ReferenceNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;
import edu.semo.jatsz.glang.parsenode.function.ReturnStatementNode;

import javax.swing.plaf.nimbus.State;
import java.io.Serializable;

public class ForStatementNode extends StatementNode implements Serializable {
    private ParseNode condition;
    private StatementListNode statement;
    private AssignmentNode assign;
    private ParseNode increment;

    public static final long serialVersionUID = 1L;

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
            ParseNode eval = statement.evaluate();
            if(eval != null) {
                return eval;
            }
            increment.evaluate();
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
        statement.setEnvironment(environment);

        assign.setEnvironment(statement);


        condition.setEnvironment(statement);
        increment.setEnvironment(statement);

    }

    @Override
    public void generateSymbols() {
        statement.generateSymbols();
        assign.generateSymbols();
        condition.generateSymbols();
        increment.generateSymbols();
    }

    @Override
    public void resolveTypes() {
        statement.resolveTypes();
        assign.resolveTypes();
        condition.resolveTypes();
        increment.resolveTypes();
    }
}


