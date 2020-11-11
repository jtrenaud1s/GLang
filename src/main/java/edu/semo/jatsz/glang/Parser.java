// Output created by jacc on Tue Nov 10 21:57:33 CST 2020

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
                case 62:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 124;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 18;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case SEMI:
                            yyn = 19;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 127;
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
                case 73:
                    switch (yytok) {
                        case ID:
                            yyn = 21;
                            continue;
                    }
                    yyn = 127;
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
                case 74:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 22;
                            continue;
                    }
                    yyn = 127;
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
                case 75:
                    yyn = yys13();
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
                case 76:
                    switch (yytok) {
                        case ID:
                            yyn = 23;
                            continue;
                    }
                    yyn = 127;
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
                case 77:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
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
                case 78:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                    }
                    yyn = 127;
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
                case 79:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 33;
                            continue;
                    }
                    yyn = 127;
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
                case 80:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
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
                case 81:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case SEMI:
                            yyn = 35;
                            continue;
                    }
                    yyn = 127;
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
                case 83:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
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
                case 91:
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
                case 92:
                    yyn = yys30();
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
                case 93:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 127;
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
                case 95:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 127;
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
                case 97:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    switch (yytok) {
                        case SEMI:
                            yyn = 44;
                            continue;
                    }
                    yyn = 127;
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
                case 99:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
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
                case 100:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
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
                case 101:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
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
                case 103:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 50;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 51;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 127;
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
                case 112:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case LCURLY:
                            yyn = 53;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case SEMI:
                            yyn = 54;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                        case DOUBLE:
                            yyn = 29;
                            continue;
                        case LITERAL:
                            yyn = 30;
                            continue;
                        case LPAREN:
                            yyn = 31;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 58;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    switch (yytok) {
                        case LCURLY:
                            yyn = 59;
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 127;
                    continue;

                case 124:
                    return true;
                case 125:
                    yyerror("stack overflow");
                case 126:
                    return false;
                case 127:
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
                return 11;
            case FOR:
                return 12;
            case ID:
                return 13;
            case INT:
                return 14;
            case PRINT:
                return 15;
            case READ:
                return 16;
            case WHILE:
                return 17;
        }
        return 127;
    }

    private int yys9() {
        switch (yytok) {
            case DOUBLE:
                return 11;
            case FOR:
                return 12;
            case ID:
                return 13;
            case INT:
                return 14;
            case PRINT:
                return 15;
            case READ:
                return 16;
            case WHILE:
                return 17;
            case ENDINPUT:
                return yyr1();
        }
        return 127;
    }

    private int yys13() {
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
        return 127;
    }

    private int yys19() {
        switch (yytok) {
            case PRINT:
            case FOR:
            case ENDINPUT:
            case WHILE:
            case DOUBLE:
            case INT:
            case READ:
            case RCURLY:
            case ID:
                return yyr2();
        }
        return 127;
    }

    private int yys25() {
        switch (yytok) {
            case POW:
                return 37;
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr22();
        }
        return 127;
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
                return yyr24();
        }
        return 127;
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
                return yyr26();
        }
        return 127;
    }

    private int yys28() {
        switch (yytok) {
            case ADD:
                return 38;
            case DIVIDE:
                return 39;
            case MULTIPLY:
                return 40;
            case SUB:
                return 41;
            case SEMI:
            case RPAREN:
                return yyr19();
        }
        return 127;
    }

    private int yys29() {
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
        return 127;
    }

    private int yys30() {
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
        return 127;
    }

    private int yys35() {
        switch (yytok) {
            case PRINT:
            case FOR:
            case ENDINPUT:
            case WHILE:
            case DOUBLE:
            case INT:
            case READ:
            case RCURLY:
            case ID:
                return yyr3();
        }
        return 127;
    }

    private int yys45() {
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
        return 127;
    }

    private int yys47() {
        switch (yytok) {
            case POW:
                return 37;
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr21();
        }
        return 127;
    }

    private int yys48() {
        switch (yytok) {
            case POW:
                return 37;
            case MULTIPLY:
            case SUB:
            case SEMI:
            case RPAREN:
            case DIVIDE:
            case ADD:
                return yyr20();
        }
        return 127;
    }

    private int yys50() {
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
        return 127;
    }

    private int yys53() {
        switch (yytok) {
            case DOUBLE:
                return 11;
            case FOR:
                return 12;
            case ID:
                return 13;
            case INT:
                return 14;
            case PRINT:
                return 15;
            case READ:
                return 16;
            case WHILE:
                return 17;
        }
        return 127;
    }

    private int yys55() {
        switch (yytok) {
            case DOUBLE:
                return 11;
            case FOR:
                return 12;
            case ID:
                return 13;
            case INT:
                return 14;
            case PRINT:
                return 15;
            case READ:
                return 16;
            case WHILE:
                return 17;
            case RCURLY:
                return 57;
        }
        return 127;
    }

    private int yys59() {
        switch (yytok) {
            case DOUBLE:
                return 11;
            case FOR:
                return 12;
            case ID:
                return 13;
            case INT:
                return 14;
            case PRINT:
                return 15;
            case READ:
                return 16;
            case WHILE:
                return 17;
        }
        return 127;
    }

    private int yys60() {
        switch (yytok) {
            case DOUBLE:
                return 11;
            case FOR:
                return 12;
            case ID:
                return 13;
            case INT:
                return 14;
            case PRINT:
                return 15;
            case READ:
                return 16;
            case WHILE:
                return 17;
            case RCURLY:
                return 61;
        }
        return 127;
    }

    private int yyr1() { // entrypoint : statementList
        {
    this.entryPoint = (ParseNode) yysv[yysp-1];
}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr12() { // declaration : INT ID
        {
    yyrv = new DeclarationNode(Type.INT, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr13() { // declaration : DOUBLE ID
        {
    yyrv = new DeclarationNode(Type.DOUBLE, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr14() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 22: return 36;
            default: return 3;
        }
    }

    private int yyr17() { // expr : term SUB expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : term ADD expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 44: return 52;
            case 41: return 49;
            case 38: return 46;
            case 33: return 43;
            case 31: return 42;
            case 18: return 34;
            case 15: return 24;
            default: return 56;
        }
    }

    private int yyr23() { // factor : factor POW group
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "^", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr24() { // factor : group
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 40: return 48;
            case 39: return 47;
            default: return 25;
        }
    }

    private int yyr11() { // for : FOR LPAREN assign SEMI expr SEMI expr RPAREN LCURLY statementList RCURLY
        {

    yyrv = new ForStatementNode((AssignmentNode)yysv[yysp-9], (ParseNode)yysv[yysp-7], (ParseNode)yysv[yysp-5], (StatementListNode)yysv[yysp-6]);
}
        yysv[yysp-=11] = yyrv;
        return 4;
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
            case 37: return 45;
            default: return 26;
        }
    }

    private int yyr16() { // input : READ ref
        {
    yyrv = new StdInNode((ReferenceNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr15() { // output : PRINT expr
        {
    yyrv = new StdOutNode((ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 6;
    }

    private int yyr29() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 60: return 7;
            case 59: return 7;
            case 55: return 7;
            case 53: return 7;
            case 22: return 7;
            case 16: return 32;
            case 9: return 7;
            case 0: return 7;
            default: return 27;
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

    private int yyr9() { // statement : for
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 59: return 8;
            case 53: return 8;
            case 0: return 8;
            default: return 20;
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
            case 53: return 55;
            case 0: return 9;
            default: return 60;
        }
    }

    private int yyr20() { // term : term MULTIPLY factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 28;
    }

    private int yyr21() { // term : term DIVIDE factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 28;
    }

    private int yyr22() { // term : factor
        yysp -= 1;
        return 28;
    }

    private int yyr10() { // while : WHILE LPAREN expr RPAREN LCURLY statementList RCURLY
        {
    yyrv = new WhileStatementNode((ParseNode)yysv[yysp-5], (StatementListNode)yysv[yysp-2]);
}
        yysv[yysp-=7] = yyrv;
        return 10;
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
