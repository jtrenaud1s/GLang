// Output created by jacc on Thu Nov 12 20:32:14 CST 2020

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
                case 99:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 198;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 21;
                            continue;
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    switch (yytok) {
                        case LSQUARE:
                            yyn = 22;
                            continue;
                        case SEMI:
                        case EQUAL:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 23;
                            continue;
                        case LSQUARE:
                            yyn = 24;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    switch (yytok) {
                        case SEMI:
                            yyn = 25;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 201;
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
                case 111:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                    }
                    yyn = 201;
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
                case 112:
                    switch (yytok) {
                        case ID:
                            yyn = 28;
                            continue;
                    }
                    yyn = 201;
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
                case 113:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 29;
                            continue;
                    }
                    yyn = 201;
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
                case 114:
                    yyn = yys15();
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
                case 115:
                    switch (yytok) {
                        case ID:
                            yyn = 30;
                            continue;
                    }
                    yyn = 201;
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
                case 116:
                    yyn = yys17();
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
                case 117:
                    switch (yytok) {
                        case ID:
                            yyn = 15;
                            continue;
                    }
                    yyn = 201;
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
                case 118:
                    switch (yytok) {
                        case ID:
                            yyn = 46;
                            continue;
                    }
                    yyn = 201;
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
                case 119:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 47;
                            continue;
                    }
                    yyn = 201;
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
                case 120:
                    yyn = yys21();
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
                case 121:
                    yyn = yys22();
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
                case 122:
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
                case 123:
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
                case 124:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    switch (yytok) {
                        case SEMI:
                            yyn = 52;
                            continue;
                    }
                    yyn = 201;
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
                case 126:
                    switch (yytok) {
                        case LSQUARE:
                            yyn = 53;
                            continue;
                        case SEMI:
                        case EQUAL:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 201;
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
                case 127:
                    switch (yytok) {
                        case LSQUARE:
                            yyn = 54;
                            continue;
                        case SEMI:
                        case EQUAL:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 201;
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
                case 128:
                    switch (yytok) {
                        case CHARACTER:
                            yyn = 12;
                            continue;
                        case DOUBLE:
                            yyn = 13;
                            continue;
                        case ID:
                            yyn = 15;
                            continue;
                        case INT:
                            yyn = 16;
                            continue;
                        case STRING:
                            yyn = 19;
                            continue;
                    }
                    yyn = 201;
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
                case 129:
                    switch (yytok) {
                        case LSQUARE:
                            yyn = 57;
                            continue;
                        case SEMI:
                        case EQUAL:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr24();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    yyn = yys38();
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
                case 138:
                    yyn = yys39();
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
                case 139:
                    switch (yytok) {
                        case CHARS:
                            yyn = 63;
                            continue;
                    }
                    yyn = 201;
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
                case 140:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case CHAR:
                            yyn = 65;
                            continue;
                    }
                    yyn = 201;
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
                case 143:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case LSQUARE:
                            yyn = 24;
                            continue;
                        case SEMI:
                            yyn = yyr25();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    switch (yytok) {
                        case LSQUARE:
                            yyn = 67;
                            continue;
                        case SEMI:
                        case EQUAL:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr23();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case RSQUARE:
                            yyn = 69;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr22();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    switch (yytok) {
                        case RSQUARE:
                            yyn = 70;
                            continue;
                    }
                    yyn = 201;
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
                case 151:
                    yyn = yys52();
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
                case 152:
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
                case 153:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case SEMI:
                            yyn = 73;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 21;
                            continue;
                    }
                    yyn = 201;
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
                case 156:
                    yyn = yys57();
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
                case 157:
                    yyn = yys58();
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
                case 158:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
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
                case 160:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case DQUOTE:
                            yyn = 80;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 81;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case QUOTE:
                            yyn = 82;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 84;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case SEMI:
                        case EQUAL:
                        case LSQUARE:
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case RSQUARE:
                            yyn = 85;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    switch (yytok) {
                        case RSQUARE:
                            yyn = 86;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case RSQUARE:
                            yyn = 88;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    switch (yytok) {
                        case SEMI:
                        case RSQUARE:
                        case RPAREN:
                            yyn = yyr27();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    switch (yytok) {
                        case SEMI:
                        case RSQUARE:
                        case RPAREN:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case RSQUARE:
                            yyn = 89;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case LCURLY:
                            yyn = 90;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case SEMI:
                        case EQUAL:
                        case LSQUARE:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case SEMI:
                        case EQUAL:
                        case LSQUARE:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case SEMI:
                            yyn = 91;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    switch (yytok) {
                        case SEMI:
                        case EQUAL:
                        case LSQUARE:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case SEMI:
                        case EQUAL:
                        case LSQUARE:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    switch (yytok) {
                        case CHARACTER:
                            yyn = 12;
                            continue;
                        case DOUBLE:
                            yyn = 13;
                            continue;
                        case ID:
                            yyn = 15;
                            continue;
                        case INT:
                            yyn = 16;
                            continue;
                        case STRING:
                            yyn = 19;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 95;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case LCURLY:
                            yyn = 96;
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 201;
                    continue;

                case 198:
                    return true;
                case 199:
                    yyerror("stack overflow");
                case 200:
                    return false;
                case 201:
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
            case CHARACTER:
                return 12;
            case DOUBLE:
                return 13;
            case FOR:
                return 14;
            case ID:
                return 15;
            case INT:
                return 16;
            case PRINT:
                return 17;
            case READ:
                return 18;
            case STRING:
                return 19;
            case WHILE:
                return 20;
        }
        return 201;
    }

    private int yys10() {
        switch (yytok) {
            case CHARACTER:
                return 12;
            case DOUBLE:
                return 13;
            case FOR:
                return 14;
            case ID:
                return 15;
            case INT:
                return 16;
            case PRINT:
                return 17;
            case READ:
                return 18;
            case STRING:
                return 19;
            case WHILE:
                return 20;
            case ENDINPUT:
                return yyr1();
        }
        return 201;
    }

    private int yys15() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case EQUAL:
            case POW:
            case MULTIPLY:
            case LSQUARE:
            case ADD:
                return yyr42();
        }
        return 201;
    }

    private int yys17() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys21() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys22() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys23() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys24() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys25() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case STRING:
            case INT:
            case ID:
            case READ:
            case RCURLY:
            case FOR:
            case PRINT:
            case CHARACTER:
            case DOUBLE:
                return yyr2();
        }
        return 201;
    }

    private int yys31() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr41();
        }
        return 201;
    }

    private int yys33() {
        switch (yytok) {
            case POW:
                return 58;
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case MULTIPLY:
            case ADD:
                return yyr31();
        }
        return 201;
    }

    private int yys34() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr35();
        }
        return 201;
    }

    private int yys35() {
        switch (yytok) {
            case LSQUARE:
                return 24;
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr37();
        }
        return 201;
    }

    private int yys36() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr40();
        }
        return 201;
    }

    private int yys37() {
        switch (yytok) {
            case ADD:
                return 59;
            case DIVIDE:
                return 60;
            case MULTIPLY:
                return 61;
            case SUB:
                return 62;
            case SEMI:
            case RSQUARE:
            case RPAREN:
                return yyr28();
        }
        return 201;
    }

    private int yys38() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr33();
        }
        return 201;
    }

    private int yys39() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr39();
        }
        return 201;
    }

    private int yys41() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr38();
        }
        return 201;
    }

    private int yys42() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys44() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
        }
        return 201;
    }

    private int yys47() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys52() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case STRING:
            case INT:
            case ID:
            case READ:
            case RCURLY:
            case FOR:
            case PRINT:
            case CHARACTER:
            case DOUBLE:
                return yyr3();
        }
        return 201;
    }

    private int yys53() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys54() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys57() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys58() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys59() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys60() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys61() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys62() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys66() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr34();
        }
        return 201;
    }

    private int yys67() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys70() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case EQUAL:
            case POW:
            case MULTIPLY:
            case LSQUARE:
            case ADD:
                return yyr43();
        }
        return 201;
    }

    private int yys73() {
        switch (yytok) {
            case ID:
                return 15;
            case DOUBLE:
                return 39;
            case DQUOTE:
                return 40;
            case LITERAL:
                return 41;
            case LPAREN:
                return 42;
            case QUOTE:
                return 43;
            case SUB:
                return 44;
        }
        return 201;
    }

    private int yys75() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr32();
        }
        return 201;
    }

    private int yys77() {
        switch (yytok) {
            case POW:
                return 58;
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case MULTIPLY:
            case ADD:
                return yyr30();
        }
        return 201;
    }

    private int yys78() {
        switch (yytok) {
            case POW:
                return 58;
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case MULTIPLY:
            case ADD:
                return yyr29();
        }
        return 201;
    }

    private int yys80() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr44();
        }
        return 201;
    }

    private int yys81() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr36();
        }
        return 201;
    }

    private int yys82() {
        switch (yytok) {
            case SUB:
            case DIVIDE:
            case SEMI:
            case RSQUARE:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr45();
        }
        return 201;
    }

    private int yys90() {
        switch (yytok) {
            case CHARACTER:
                return 12;
            case DOUBLE:
                return 13;
            case FOR:
                return 14;
            case ID:
                return 15;
            case INT:
                return 16;
            case PRINT:
                return 17;
            case READ:
                return 18;
            case STRING:
                return 19;
            case WHILE:
                return 20;
        }
        return 201;
    }

    private int yys92() {
        switch (yytok) {
            case CHARACTER:
                return 12;
            case DOUBLE:
                return 13;
            case FOR:
                return 14;
            case ID:
                return 15;
            case INT:
                return 16;
            case PRINT:
                return 17;
            case READ:
                return 18;
            case STRING:
                return 19;
            case WHILE:
                return 20;
            case RCURLY:
                return 94;
        }
        return 201;
    }

    private int yys96() {
        switch (yytok) {
            case CHARACTER:
                return 12;
            case DOUBLE:
                return 13;
            case FOR:
                return 14;
            case ID:
                return 15;
            case INT:
                return 16;
            case PRINT:
                return 17;
            case READ:
                return 18;
            case STRING:
                return 19;
            case WHILE:
                return 20;
        }
        return 201;
    }

    private int yys97() {
        switch (yytok) {
            case CHARACTER:
                return 12;
            case DOUBLE:
                return 13;
            case FOR:
                return 14;
            case ID:
                return 15;
            case INT:
                return 16;
            case PRINT:
                return 17;
            case READ:
                return 18;
            case STRING:
                return 19;
            case WHILE:
                return 20;
            case RCURLY:
                return 98;
        }
        return 201;
    }

    private int yyr1() { // entrypoint : statementList
        {
    this.entryPoint = (ParseNode) yysv[yysp-1];
}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr22() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypassign();
    }

    private int yyr23() { // assign : declaration EQUAL expr
        {
    yyrv = new AssignmentNode((DeclarationNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypassign();
    }

    private int yypassign() {
        switch (yyst[yysp-1]) {
            case 91: return 93;
            case 29: return 55;
            default: return 2;
        }
    }

    private int yyr45() { // char : QUOTE CHAR QUOTE
        {
    yyrv = new Symbol(Type.CHAR, "char-literal", (char) yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return 31;
    }

    private int yyr12() { // declaration : INT ID
        {
    yyrv = new DeclarationNode(Type.INT, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr13() { // declaration : DOUBLE ID
        {
    yyrv = new DeclarationNode(Type.DOUBLE, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr14() { // declaration : STRING ID
        {
    yyrv = new DeclarationNode(Type.STRING, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr15() { // declaration : CHARACTER ID
        {
    yyrv = new DeclarationNode(Type.CHAR, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return yypdeclaration();
    }

    private int yyr16() { // declaration : arrayDeclaration
        yysp -= 1;
        return yypdeclaration();
    }

    private int yypdeclaration() {
        switch (yyst[yysp-1]) {
            case 91: return 56;
            case 29: return 56;
            default: return 3;
        }
    }

    private int yyr17() { // arrayDeclaration : INT ID LSQUARE expr RSQUARE
        {
    yyrv = new ArrayDeclarationNode(Type.INT, (String) yysv[yysp-4], (ParseNode) yysv[yysp-2]);
}
        yysv[yysp-=5] = yyrv;
        return 4;
    }

    private int yyr18() { // arrayDeclaration : DOUBLE ID LSQUARE expr RSQUARE
        {
    yyrv = new ArrayDeclarationNode(Type.DOUBLE, (String) yysv[yysp-4], (ParseNode) yysv[yysp-2]);
}
        yysv[yysp-=5] = yyrv;
        return 4;
    }

    private int yyr19() { // arrayDeclaration : STRING ID LSQUARE expr RSQUARE
        {
    yyrv = new ArrayDeclarationNode(Type.STRING, (String) yysv[yysp-4], (ParseNode) yysv[yysp-2]);
}
        yysv[yysp-=5] = yyrv;
        return 4;
    }

    private int yyr20() { // arrayDeclaration : CHARACTER ID LSQUARE expr RSQUARE
        {
    yyrv = new ArrayDeclarationNode(Type.CHAR, (String) yysv[yysp-4], (ParseNode) yysv[yysp-2]);
}
        yysv[yysp-=5] = yyrv;
        return 4;
    }

    private int yyr21() { // arrayDeclaration : arrayDeclaration LSQUARE expr RSQUARE
        {
    ((ArrayDeclarationNode)yysv[yysp-4]).setMulti(true, (ParseNode)yysv[yysp-2]);
    yyrv = yysv[yysp-4];
}
        yysv[yysp-=4] = yyrv;
        return 4;
    }

    private int yyr26() { // expr : term SUB expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr27() { // expr : term ADD expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr28() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 67: return 83;
            case 62: return 79;
            case 59: return 76;
            case 57: return 74;
            case 54: return 72;
            case 53: return 71;
            case 47: return 68;
            case 42: return 64;
            case 24: return 51;
            case 23: return 50;
            case 22: return 49;
            case 21: return 48;
            case 17: return 32;
            default: return 87;
        }
    }

    private int yyr32() { // factor : factor POW unary
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "^", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr33() { // factor : unary
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 61: return 78;
            case 60: return 77;
            default: return 33;
        }
    }

    private int yyr11() { // for : FOR LPAREN assign SEMI expr SEMI assign RPAREN LCURLY statementList RCURLY
        {
    yyrv = new ForStatementNode((AssignmentNode)yysv[yysp-9], (ParseNode)yysv[yysp-7], (AssignmentNode)yysv[yysp-5], (StatementListNode)yysv[yysp-2]);
}
        yysv[yysp-=11] = yyrv;
        return 5;
    }

    private int yyr36() { // group : LPAREN expr RPAREN
        {
    yyrv = new GroupNode((ParseNode)yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return yypgroup();
    }

    private int yyr37() { // group : ref
        yysp -= 1;
        return yypgroup();
    }

    private int yyr38() { // group : LITERAL
        {
    yyrv = new Symbol(Type.INT, "int-literal", (Integer) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypgroup();
    }

    private int yyr39() { // group : DOUBLE
        {
    yyrv = new Symbol(Type.DOUBLE, "double-literal", (Double) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypgroup();
    }

    private int yyr40() { // group : string
        yysp -= 1;
        return yypgroup();
    }

    private int yyr41() { // group : char
        yysp -= 1;
        return yypgroup();
    }

    private int yypgroup() {
        switch (yyst[yysp-1]) {
            case 44: return 66;
            default: return 34;
        }
    }

    private int yyr25() { // input : READ ref
        {
    yyrv = new StdInNode((ReferenceNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 6;
    }

    private int yyr24() { // output : PRINT expr
        {
    yyrv = new StdOutNode((ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 7;
    }

    private int yyr42() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypref();
    }

    private int yyr43() { // ref : ref LSQUARE expr RSQUARE
        {
    yyrv = new ArrayReferenceNode((ReferenceNode) yysv[yysp-4], (ParseNode) yysv[yysp-2]);
}
        yysv[yysp-=4] = yyrv;
        return yypref();
    }

    private int yypref() {
        switch (yyst[yysp-1]) {
            case 97: return 8;
            case 96: return 8;
            case 92: return 8;
            case 91: return 8;
            case 90: return 8;
            case 29: return 8;
            case 18: return 45;
            case 10: return 8;
            case 0: return 8;
            default: return 35;
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
            case 96: return 9;
            case 90: return 9;
            case 0: return 9;
            default: return 26;
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
            case 90: return 92;
            case 0: return 10;
            default: return 97;
        }
    }

    private int yyr44() { // string : DQUOTE CHARS DQUOTE
        {
    yyrv = new Symbol(Type.STRING, "string-literal", (String) yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return 36;
    }

    private int yyr29() { // term : term MULTIPLY factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 37;
    }

    private int yyr30() { // term : term DIVIDE factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 37;
    }

    private int yyr31() { // term : factor
        yysp -= 1;
        return 37;
    }

    private int yyr34() { // unary : SUB group
        {
    yyrv = new UnaryOperationNode("-", (ParseNode) yysv[yysp-1] );
}
        yysv[yysp-=2] = yyrv;
        return yypunary();
    }

    private int yyr35() { // unary : group
        yysp -= 1;
        return yypunary();
    }

    private int yypunary() {
        switch (yyst[yysp-1]) {
            case 58: return 75;
            default: return 38;
        }
    }

    private int yyr10() { // while : WHILE LPAREN expr RPAREN LCURLY statementList RCURLY
        {
    yyrv = new WhileStatementNode((ParseNode)yysv[yysp-5], (StatementListNode)yysv[yysp-2]);
}
        yysv[yysp-=7] = yyrv;
        return 11;
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
                parser.getEntryPoint().setEnvironment(ParseTree.get());
                parser.getEntryPoint().evaluate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
