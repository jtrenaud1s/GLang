// Output created by jacc on Thu Nov 05 20:55:59 CST 2020

package edu.semo.jatsz.glang;

import edu.semo.jatsz.glang.parsenode.*;
import edu.semo.jatsz.glang.parsenode.statement.*;


class Parser implements Tokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                        case INT:
                            yyn = 10;
                            continue;
                        case PRINT:
                            yyn = 11;
                            continue;
                        case READ:
                            yyn = 12;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 62;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 34:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 35:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 36:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 13;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    switch (yytok) {
                        case SEMI:
                            yyn = 14;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                        case INT:
                            yyn = 10;
                            continue;
                        case PRINT:
                            yyn = 11;
                            continue;
                        case READ:
                            yyn = 12;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 40:
                    switch (yytok) {
                        case SUB:
                        case SEMI:
                        case RPAREN:
                        case EQUAL:
                        case ADD:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    switch (yytok) {
                        case ID:
                            yyn = 16;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                        case LITERAL:
                            yyn = 20;
                            continue;
                        case LPAREN:
                            yyn = 21;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                        case LITERAL:
                            yyn = 20;
                            continue;
                        case LPAREN:
                            yyn = 21;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case ENDINPUT:
                        case INT:
                        case READ:
                        case ID:
                        case PRINT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case SEMI:
                            yyn = 24;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    switch (yytok) {
                        case ADD:
                            yyn = 25;
                            continue;
                        case SUB:
                            yyn = 26;
                            continue;
                        case SEMI:
                        case RPAREN:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case SUB:
                        case SEMI:
                        case RPAREN:
                        case ADD:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    switch (yytok) {
                        case SUB:
                        case SEMI:
                        case RPAREN:
                        case ADD:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                        case LITERAL:
                            yyn = 20;
                            continue;
                        case LPAREN:
                            yyn = 21;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case ENDINPUT:
                        case INT:
                        case READ:
                        case ID:
                        case PRINT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                        case LITERAL:
                            yyn = 20;
                            continue;
                        case LPAREN:
                            yyn = 21;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                        case LITERAL:
                            yyn = 20;
                            continue;
                        case LPAREN:
                            yyn = 21;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 30;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    switch (yytok) {
                        case SUB:
                        case SEMI:
                        case RPAREN:
                        case ADD:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 62:
                    return true;
                case 63:
                    yyerror("stack overflow");
                case 64:
                    return false;
                case 65:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yyr1() { // entrypoint : statementList
        {
    this.entryPoint = (ParseNode) yysv[yysp-1];
}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr8() { // declaration : INT ID
        {
    yyrv = new DeclarationNode(Type.INT, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr9() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr12() { // expr : group SUB expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr13() { // expr : group ADD expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : group
        yysp -= 1;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 25: return 28;
            case 21: return 27;
            case 13: return 23;
            case 11: return 17;
            default: return 29;
        }
    }

    private int yyr15() { // group : LPAREN expr RPAREN
        {
    yyrv = new GroupNode((ParseNode)yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return 18;
    }

    private int yyr16() { // group : ref
        yysp -= 1;
        return 18;
    }

    private int yyr17() { // group : LITERAL
        {
    yyrv = new Symbol(Type.INT, "literal", (Integer) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return 18;
    }

    private int yyr11() { // input : READ ref
        {
    yyrv = new StdInNode((ReferenceNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 4;
    }

    private int yyr10() { // output : PRINT expr
        {
    yyrv = new StdOutNode((ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr18() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 12: return 22;
            case 8: return 6;
            case 0: return 6;
            default: return 19;
        }
    }

    private int yyr4() { // statement : declaration
        yysp -= 1;
        return yypstatement();
    }

    private int yyr5() { // statement : assign
        yysp -= 1;
        return yypstatement();
    }

    private int yyr6() { // statement : output
        yysp -= 1;
        return yypstatement();
    }

    private int yyr7() { // statement : input
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 0: return 7;
            default: return 15;
        }
    }

    private int yyr2() { // statementList : statement SEMI
        {
    yyrv = new StatementListNode((StatementNode) yysv[yysp-2]);
}
        yysv[yysp-=2] = yyrv;
        return 8;
    }

    private int yyr3() { // statementList : statementList statement SEMI
        {
    ((StatementListNode) yysv[yysp-3]).add((StatementNode) yysv[yysp-2]);
    yyrv = yysv[yysp-3];
}
        yysv[yysp-=3] = yyrv;
        return 8;
    }

    protected String[] yyerrmsgs = {
    };

    private Lexer lexer;
    private ParseNode entryPoint;
    private ParseNode currentNode;

    public Parser(java.io.InputStream in)
    {
        lexer = new Lexer(in);
        new ParseTree();
    }


    public ParseNode getEntryPoint()
    {
        return entryPoint;
    }

    /*SymbolTable addDeclaration(Object sym, Object decl) {
        if(sym == null)
            sym = new SymbolTable();
        SymbolTable table = (SymbolTable)sym;
        DeclarationNode declaration = (DeclarationNode)decl;
        table.set(declaration.getName(), new Symbol(declaration.getType(), "declaration", null));
        return table;
    }*/


    public int next() {
        lexer.next();
        return lexer.getToken();
    }


    public void yyerror(String msg) {
        lexer.printError("ERROR: " + msg);
    }


    public static void main(String [] args) {
        try {
            Parser parser = new Parser(new java.io.FileInputStream(args[0]));
            parser.next();
            if(parser.parse()) {
                parser.getEntryPoint().evaluate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
