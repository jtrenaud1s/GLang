package edu.semo.jatsz.glang.parsenode.classnode;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.*;

public class FieldReferenceNode extends ReferenceNode {
    private SymbolStorage environment;
    private ReferenceNode field;
    private ReferenceNode classRef;
    private Type type;

    public FieldReferenceNode(ReferenceNode classRef, ReferenceNode field) {
        super(field.getName());
        this.classRef = classRef;
        this.field = field;
    }

    @Override
    public ParseNode evaluate() {
        return field.evaluate();
    }

    public void print(String prefix) {
        System.out.println(((ClassDeclarationNode)field.getEnvironment()).getName() + "." + field.getName() + "::" + field.getClass().getName());
    }

    @Override
    public String getName() {
        return this.field.getName();
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        classRef.setEnvironment(environment);
        ClassSymbol classDef = (ClassSymbol)classRef.evaluate();
        ClassDeclarationNode ref = (ClassDeclarationNode) classDef.getValue();
        this.field.setEnvironment(ref);
        this.type = field.getType();
    }


}
