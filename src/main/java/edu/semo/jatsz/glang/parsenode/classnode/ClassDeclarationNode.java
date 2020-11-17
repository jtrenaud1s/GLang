package edu.semo.jatsz.glang.parsenode.classnode;

import edu.semo.jatsz.glang.ParseTree;
import edu.semo.jatsz.glang.model.SymbolStorage;
import edu.semo.jatsz.glang.model.SymbolTable;
import edu.semo.jatsz.glang.parsenode.ParseNode;
import edu.semo.jatsz.glang.parsenode.ReferenceNode;
import edu.semo.jatsz.glang.parsenode.Symbol;
import edu.semo.jatsz.glang.parsenode.Type;
import edu.semo.jatsz.glang.parsenode.statement.DeclarationNode;
import edu.semo.jatsz.glang.parsenode.statement.StatementNode;

public class ClassDeclarationNode extends DeclarationNode implements SymbolStorage {
    private Type type;
    private String name;
    private String className;

    public ClassDeclarationNode(String className, String name) {
        super(Type.CLASS, name);
        this.className = className;
        this.name = name;
        this.type = Type.CLASS;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + name);
    }

    @Override
    public ParseNode evaluate() {
        if(this.getEnvironment().has(this.className)) {
            if(this.getEnvironment().get(this.className).getType().equals(Type.CLASS_DEF)) {
                this.table = ((ClassDefinitionNode)this.getEnvironment().get(this.className).getValue()).getSymbolTable().clone();
                Symbol dec = new ClassSymbol(this.className, this.name, this);
                this.getEnvironment().set(name, dec);
            } else {
                System.out.println(this.className + " is not a class!");
                System.exit(-1);
            }
        } else {
            System.out.println(this.className + " does not exist!");
            System.exit(-1);
        }
        ReferenceNode ref = new ReferenceNode(name);
        ref.setEnvironment(this.getEnvironment());
        return ref;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    private SymbolStorage environment;

    @Override
    public SymbolStorage getEnvironment() {
        return this.environment;
    }

    @Override
    public void setEnvironment(SymbolStorage environment) {
        this.environment = environment;
        this.environment.set(name, new Symbol(this.type, name, null));
        evaluate();
    }

    private SymbolTable table;

    @Override
    public SymbolTable getSymbolTable() {
        return this.table;
    }

    @Override
    public Symbol get(String name) {
        if(this.table.containsSymbol(name))
            return this.table.get(name);
        else
            return this.environment.get(name);
    }

    @Override
    public boolean has(String name) {
        if(this.table.containsSymbol(name))
            return this.table.containsSymbol(name);
        else
            return this.environment.has(name);
    }

    @Override
    public void set(String name, Symbol sym) {
        this.table.set(name, sym);
    }

    @Override
    public String toString() {
        return this.getSymbolTable().getMemberString("");
    }
}
