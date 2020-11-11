// Output created by jacc on Tue Nov 10 22:47:13 CST 2020

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
                case 53:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 106;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 16;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case SEMI:
                            yyn = 17;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 109;
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
                case 63:
                    switch (yytok) {
                        case ID:
                            yyn = 19;
                            continue;
                    }
                    yyn = 109;
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
                case 64:
                    yyn = yys11();
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
                case 65:
                    switch (yytok) {
                        case ID:
                            yyn = 20;
                            continue;
                    }
                    yyn = 109;
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
                case 66:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
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
                case 67:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                    }
                    yyn = 109;
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
                case 68:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 32;
                            continue;
                    }
                    yyn = 109;
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
                case 69:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
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
                case 70:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case SEMI:
                            yyn = 34;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 109;
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
                case 73:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    yyn = yys28();
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
                case 82:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
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
                case 83:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 109;
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
                case 85:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 109;
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
                case 87:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                        case DOUBLE:
                            yyn = 27;
                            continue;
                        case LITERAL:
                            yyn = 28;
                            continue;
                        case LPAREN:
                            yyn = 29;
                            continue;
                        case SUB:
                            yyn = 30;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 48;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 49;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    switch (yytok) {
                        case LCURLY:
                            yyn = 50;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 106:
                    return true;
                case 107:
                    yyerror("stack overflow");
                case 108:
                    return false;
                case 109:
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

    private int yys0() {
        switch (yytok) {
            case DOUBLE:
                return 10;
            case ID:
                return 11;
            case INT:
                return 12;
            case PRINT:
                return 13;
            case READ:
                return 14;
            case WHILE:
                return 15;
        }
        return 109;
    }

    private int yys8() {
        switch (yytok) {
            case DOUBLE:
                return 10;
            case ID:
                return 11;
            case INT:
                return 12;
            case PRINT:
                return 13;
            case READ:
                return 14;
            case WHILE:
                return 15;
            case ENDINPUT:
                return yyr1();
        }
        return 109;
    }

    private int yys11() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case EQUAL:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr29();
        }
        return 109;
    }

    private int yys17() {
        switch (yytok) {
            case RCURLY:
            case PRINT:
            case ID:
            case ENDINPUT:
            case WHILE:
            case DOUBLE:
            case READ:
            case INT:
                return yyr2();
        }
        return 109;
    }

    private int yys22() {
        switch (yytok) {
            case POW:
                return 35;
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr20();
        }
        return 109;
    }

    private int yys23() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr24();
        }
        return 109;
    }

    private int yys24() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr26();
        }
        return 109;
    }

    private int yys25() {
        switch (yytok) {
            case ADD:
                return 36;
            case DIVIDE:
                return 37;
            case MULTIPLY:
                return 38;
            case SUB:
                return 39;
            case SEMI:
            case RPAREN:
                return yyr17();
        }
        return 109;
    }

    private int yys26() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr22();
        }
        return 109;
    }

    private int yys27() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr28();
        }
        return 109;
    }

    private int yys28() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr27();
        }
        return 109;
    }

    private int yys34() {
        switch (yytok) {
            case RCURLY:
            case PRINT:
            case ID:
            case ENDINPUT:
            case WHILE:
            case DOUBLE:
            case READ:
            case INT:
                return yyr3();
        }
        return 109;
    }

    private int yys41() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr23();
        }
        return 109;
    }

    private int yys43() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr21();
        }
        return 109;
    }

    private int yys45() {
        switch (yytok) {
            case POW:
                return 35;
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr19();
        }
        return 109;
    }

    private int yys46() {
        switch (yytok) {
            case POW:
                return 35;
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr18();
        }
        return 109;
    }

    private int yys48() {
        switch (yytok) {
            case POW:
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr25();
        }
        return 109;
    }

    private int yys50() {
        switch (yytok) {
            case DOUBLE:
                return 10;
            case ID:
                return 11;
            case INT:
                return 12;
            case PRINT:
                return 13;
            case READ:
                return 14;
            case WHILE:
                return 15;
        }
        return 109;
    }

    private int yys51() {
        switch (yytok) {
            case DOUBLE:
                return 10;
            case ID:
                return 11;
            case INT:
                return 12;
            case PRINT:
                return 13;
            case READ:
                return 14;
            case WHILE:
                return 15;
            case RCURLY:
                return 52;
        }
        return 109;
    }

    private int yyr1() { // entrypoint : statementList
        {
    this.entryPoint = (ParseNode) yysv[yysp-1];
}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr10() { // declaration : INT ID
        {
    yyrv = new DeclarationNode(Type.INT, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr11() { // declaration : DOUBLE ID
        {
    yyrv = new DeclarationNode(Type.DOUBLE, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr12() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr15() { // expr : term SUB expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : term ADD expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 36: return 44;
            case 32: return 42;
            case 29: return 40;
            case 16: return 33;
            case 13: return 21;
            default: return 47;
        }
    }

    private int yyr21() { // factor : factor POW unary
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "^", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr22() { // factor : unary
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 38: return 46;
            case 37: return 45;
            default: return 22;
        }
    }

    private int yyr25() { // group : LPAREN expr RPAREN
        {
    yyrv = new GroupNode((ParseNode)yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return yypgroup();
    }

    private int yyr26() { // group : ref
        yysp -= 1;
        return yypgroup();
    }

    private int yyr27() { // group : LITERAL
        {
    yyrv = new Symbol(Type.INT, "int-literal", (Integer) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypgroup();
    }

    private int yyr28() { // group : DOUBLE
        {
    yyrv = new Symbol(Type.DOUBLE, "double-literal", (Double) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypgroup();
    }

    private int yypgroup() {
        switch (yyst[yysp-1]) {
            case 30: return 41;
            default: return 23;
        }
    }

    private int yyr14() { // input : READ ref
        {
    yyrv = new StdInNode((ReferenceNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 4;
    }

    private int yyr13() { // output : PRINT expr
        {
    yyrv = new StdOutNode((ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr29() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 51: return 6;
            case 50: return 6;
            case 14: return 31;
            case 8: return 6;
            case 0: return 6;
            default: return 24;
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

    private int yyr8() { // statement : while
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 50: return 7;
            case 0: return 7;
            default: return 18;
        }
    }

    private int yyr2() { // statementList : statement SEMI
        {
    yyrv = new StatementListNode((StatementNode) yysv[yysp-2]);
}
        yysv[yysp-=2] = yyrv;
        return yypstatementList();
    }

    private int yyr3() { // statementList : statementList statement SEMI
        {
    ((StatementListNode) yysv[yysp-3]).add((StatementNode) yysv[yysp-2]);
    yyrv = yysv[yysp-3];
}
        yysv[yysp-=3] = yyrv;
        return yypstatementList();
    }

    private int yypstatementList() {
        switch (yyst[yysp-1]) {
            case 0: return 8;
            default: return 51;
        }
    }

    private int yyr18() { // term : term MULTIPLY factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 25;
    }

    private int yyr19() { // term : term DIVIDE factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 25;
    }

    private int yyr20() { // term : factor
        yysp -= 1;
        return 25;
    }

    private int yyr23() { // unary : SUB group
        {
    yyrv = new UnaryOperationNode("-", (ParseNode) yysv[yysp-1] );
}
        yysv[yysp-=2] = yyrv;
        return yypunary();
    }

    private int yyr24() { // unary : group
        yysp -= 1;
        return yypunary();
    }

    private int yypunary() {
        switch (yyst[yysp-1]) {
            case 35: return 43;
            default: return 26;
        }
    }

    private int yyr9() { // while : WHILE LPAREN expr RPAREN LCURLY statementList RCURLY
        {
    yyrv = new WhileStatementNode((ParseNode)yysv[yysp-5], (StatementListNode)yysv[yysp-2]);
}
        yysv[yysp-=7] = yyrv;
        return 9;
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
