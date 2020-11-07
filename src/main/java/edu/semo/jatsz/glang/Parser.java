// Output created by jacc on Fri Nov 06 21:05:57 CST 2020

package edu.semo.jatsz.glang;

import edu.semo.jatsz.glang.parsenode.*;
import edu.semo.jatsz.glang.parsenode.statement.*;
import edu.semo.jatsz.glang.model.*;

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
                case 42:
                    switch (yytok) {
                        case DOUBLE:
                            yyn = 9;
                            continue;
                        case ID:
                            yyn = 10;
                            continue;
                        case INT:
                            yyn = 11;
                            continue;
                        case PRINT:
                            yyn = 12;
                            continue;
                        case READ:
                            yyn = 13;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 84;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 14;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    switch (yytok) {
                        case SEMI:
                            yyn = 15;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    yyn = yys8();
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
                case 51:
                    switch (yytok) {
                        case ID:
                            yyn = 17;
                            continue;
                    }
                    yyn = 87;
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
                case 52:
                    yyn = yys10();
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
                case 53:
                    switch (yytok) {
                        case ID:
                            yyn = 18;
                            continue;
                    }
                    yyn = 87;
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
                case 54:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                        case DOUBLE:
                            yyn = 24;
                            continue;
                        case LITERAL:
                            yyn = 25;
                            continue;
                        case LPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 87;
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
                case 55:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                    }
                    yyn = 87;
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
                case 56:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                        case DOUBLE:
                            yyn = 24;
                            continue;
                        case LITERAL:
                            yyn = 25;
                            continue;
                        case LPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case SEMI:
                            yyn = 29;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    yyn = yys23();
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
                case 66:
                    yyn = yys24();
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
                case 67:
                    yyn = yys25();
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
                case 68:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                        case DOUBLE:
                            yyn = 24;
                            continue;
                        case LITERAL:
                            yyn = 25;
                            continue;
                        case LPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys29();
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
                case 72:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                        case DOUBLE:
                            yyn = 24;
                            continue;
                        case LITERAL:
                            yyn = 25;
                            continue;
                        case LPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                        case DOUBLE:
                            yyn = 24;
                            continue;
                        case LITERAL:
                            yyn = 25;
                            continue;
                        case LPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                        case DOUBLE:
                            yyn = 24;
                            continue;
                        case LITERAL:
                            yyn = 25;
                            continue;
                        case LPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                        case DOUBLE:
                            yyn = 24;
                            continue;
                        case LITERAL:
                            yyn = 25;
                            continue;
                        case LPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    switch (yytok) {
                        case ID:
                            yyn = 10;
                            continue;
                        case DOUBLE:
                            yyn = 24;
                            continue;
                        case LITERAL:
                            yyn = 25;
                            continue;
                        case LPAREN:
                            yyn = 26;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 41;
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    switch (yytok) {
                        case RPAREN:
                        case SEMI:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case RPAREN:
                        case SEMI:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 87;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    yyn = yys41();
                    continue;

                case 84:
                    return true;
                case 85:
                    yyerror("stack overflow");
                case 86:
                    return false;
                case 87:
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

    private int yys8() {
        switch (yytok) {
            case DOUBLE:
                return 9;
            case ID:
                return 10;
            case INT:
                return 11;
            case PRINT:
                return 12;
            case READ:
                return 13;
            case ENDINPUT:
                return yyr1();
        }
        return 87;
    }

    private int yys10() {
        switch (yytok) {
            case RPAREN:
            case POW:
            case EQUAL:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr25();
        }
        return 87;
    }

    private int yys15() {
        switch (yytok) {
            case READ:
            case ID:
            case PRINT:
            case DOUBLE:
            case ENDINPUT:
            case INT:
                return yyr2();
        }
        return 87;
    }

    private int yys20() {
        switch (yytok) {
            case POW:
                return 30;
            case RPAREN:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr18();
        }
        return 87;
    }

    private int yys21() {
        switch (yytok) {
            case RPAREN:
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr20();
        }
        return 87;
    }

    private int yys22() {
        switch (yytok) {
            case RPAREN:
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr22();
        }
        return 87;
    }

    private int yys23() {
        switch (yytok) {
            case ADD:
                return 31;
            case DIVIDE:
                return 32;
            case MULTIPLY:
                return 33;
            case SUB:
                return 34;
            case RPAREN:
            case SEMI:
                return yyr15();
        }
        return 87;
    }

    private int yys24() {
        switch (yytok) {
            case RPAREN:
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr24();
        }
        return 87;
    }

    private int yys25() {
        switch (yytok) {
            case RPAREN:
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr23();
        }
        return 87;
    }

    private int yys29() {
        switch (yytok) {
            case READ:
            case ID:
            case PRINT:
            case DOUBLE:
            case ENDINPUT:
            case INT:
                return yyr3();
        }
        return 87;
    }

    private int yys36() {
        switch (yytok) {
            case RPAREN:
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr19();
        }
        return 87;
    }

    private int yys38() {
        switch (yytok) {
            case POW:
                return 30;
            case RPAREN:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr17();
        }
        return 87;
    }

    private int yys39() {
        switch (yytok) {
            case POW:
                return 30;
            case RPAREN:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr16();
        }
        return 87;
    }

    private int yys41() {
        switch (yytok) {
            case RPAREN:
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case DIVIDE:
            case ADD:
                return yyr21();
        }
        return 87;
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

    private int yyr9() { // declaration : DOUBLE ID
        {
    yyrv = new DeclarationNode(Type.DOUBLE, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr10() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr13() { // expr : term SUB expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : term ADD expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 31: return 37;
            case 26: return 35;
            case 14: return 28;
            case 12: return 19;
            default: return 40;
        }
    }

    private int yyr19() { // factor : factor POW group
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "^", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr20() { // factor : group
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 33: return 39;
            case 32: return 38;
            default: return 20;
        }
    }

    private int yyr21() { // group : LPAREN expr RPAREN
        {
    yyrv = new GroupNode((ParseNode)yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return yypgroup();
    }

    private int yyr22() { // group : ref
        yysp -= 1;
        return yypgroup();
    }

    private int yyr23() { // group : LITERAL
        {
    yyrv = new Symbol(Type.INT, "int-literal", (Integer) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypgroup();
    }

    private int yyr24() { // group : DOUBLE
        {
    yyrv = new Symbol(Type.DOUBLE, "double-literal", (Double) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypgroup();
    }

    private int yypgroup() {
        switch (yyst[yysp-1]) {
            case 30: return 36;
            default: return 21;
        }
    }

    private int yyr12() { // input : READ ref
        {
    yyrv = new StdInNode((ReferenceNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 4;
    }

    private int yyr11() { // output : PRINT expr
        {
    yyrv = new StdOutNode((ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr25() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 13: return 27;
            case 8: return 6;
            case 0: return 6;
            default: return 22;
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
            default: return 16;
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

    private int yyr16() { // term : term MULTIPLY factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 23;
    }

    private int yyr17() { // term : term DIVIDE factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 23;
    }

    private int yyr18() { // term : factor
        yysp -= 1;
        return 23;
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
