package edu.semo.jatsz.glang.parsenode.classnode;

import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.parsenode.*;

public class FieldReferenceNode extends ReferenceNode {
    private transient SymbolStorage environment;
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
        System.out.println(field.getEnvironment().getName() + "." + field.getName() + "::" + field.getClass().getName());
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
    }

    @Override
    public void generateSymbols() {
        field.generateSymbols();
        classRef.generateSymbols();
    }

    @Override
    public void resolveTypes() {
        ClassSymbol classDef = (ClassSymbol)classRef.evaluate();
        ClassDeclarationNode ref = (ClassDeclarationNode) classDef.getValue();
        this.field.setEnvironment(ref);

        field.resolveTypes();
        classRef.resolveTypes();
        this.type = field.getType();
    }

}
