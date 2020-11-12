// Output created by jacc on Thu Nov 12 13:28:54 CST 2020

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
                case 77:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 154;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    switch (yytok) {
                        case EQUAL:
                            yyn = 20;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case SEMI:
                            yyn = 21;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 157;
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
                case 88:
                    switch (yytok) {
                        case ID:
                            yyn = 23;
                            continue;
                    }
                    yyn = 157;
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
                case 89:
                    switch (yytok) {
                        case ID:
                            yyn = 24;
                            continue;
                    }
                    yyn = 157;
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
                case 90:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 25;
                            continue;
                    }
                    yyn = 157;
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
                case 91:
                    yyn = yys14();
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
                case 92:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                    }
                    yyn = 157;
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
                case 93:
                    yyn = yys16();
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
                case 94:
                    switch (yytok) {
                        case ID:
                            yyn = 14;
                            continue;
                    }
                    yyn = 157;
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
                case 95:
                    switch (yytok) {
                        case ID:
                            yyn = 42;
                            continue;
                    }
                    yyn = 157;
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
                case 96:
                    switch (yytok) {
                        case LPAREN:
                            yyn = 43;
                            continue;
                    }
                    yyn = 157;
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
                case 97:
                    yyn = yys20();
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
                case 98:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    switch (yytok) {
                        case SEMI:
                            yyn = 45;
                            continue;
                    }
                    yyn = 157;
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
                case 100:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 157;
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
                case 101:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 157;
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
                case 102:
                    switch (yytok) {
                        case ID:
                            yyn = 14;
                            continue;
                    }
                    yyn = 157;
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
                case 103:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
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
                case 112:
                    yyn = yys35();
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
                case 113:
                    switch (yytok) {
                        case CHARS:
                            yyn = 52;
                            continue;
                    }
                    yyn = 157;
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
                case 114:
                    yyn = yys37();
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
                case 115:
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
                case 116:
                    switch (yytok) {
                        case CHAR:
                            yyn = 54;
                            continue;
                    }
                    yyn = 157;
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
                case 117:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 157;
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
                case 119:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 157;
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
                case 120:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    switch (yytok) {
                        case SEMI:
                            yyn = 57;
                            continue;
                    }
                    yyn = 157;
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
                case 124:
                    yyn = yys47();
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
                case 125:
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
                case 126:
                    yyn = yys49();
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
                case 127:
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
                case 128:
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
                case 129:
                    switch (yytok) {
                        case DQUOTE:
                            yyn = 63;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 64;
                            continue;
                    }
                    yyn = 157;
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
                case 131:
                    switch (yytok) {
                        case QUOTE:
                            yyn = 65;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 66;
                            continue;
                    }
                    yyn = 157;
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
                case 134:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case SEMI:
                        case RPAREN:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 157;
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
                case 140:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    yyn = yys64();
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
                case 142:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    switch (yytok) {
                        case LCURLY:
                            yyn = 68;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case SEMI:
                            yyn = 69;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys68();
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
                case 146:
                    switch (yytok) {
                        case ID:
                            yyn = 14;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case RPAREN:
                            yyn = 73;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 157;
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
                case 150:
                    switch (yytok) {
                        case LCURLY:
                            yyn = 74;
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case SEMI:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 157;
                    continue;

                case 154:
                    return true;
                case 155:
                    yyerror("stack overflow");
                case 156:
                    return false;
                case 157:
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
                return 11;
            case DOUBLE:
                return 12;
            case FOR:
                return 13;
            case ID:
                return 14;
            case INT:
                return 15;
            case PRINT:
                return 16;
            case READ:
                return 17;
            case STRING:
                return 18;
            case WHILE:
                return 19;
        }
        return 157;
    }

    private int yys9() {
        switch (yytok) {
            case CHARACTER:
                return 11;
            case DOUBLE:
                return 12;
            case FOR:
                return 13;
            case ID:
                return 14;
            case INT:
                return 15;
            case PRINT:
                return 16;
            case READ:
                return 17;
            case STRING:
                return 18;
            case WHILE:
                return 19;
            case ENDINPUT:
                return yyr1();
        }
        return 157;
    }

    private int yys14() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case EQUAL:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr35();
        }
        return 157;
    }

    private int yys16() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys20() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys21() {
        switch (yytok) {
            case ENDINPUT:
            case INT:
            case STRING:
            case ID:
            case READ:
            case FOR:
            case RCURLY:
            case WHILE:
            case CHARACTER:
            case PRINT:
            case DOUBLE:
                return yyr2();
        }
        return 157;
    }

    private int yys27() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr34();
        }
        return 157;
    }

    private int yys29() {
        switch (yytok) {
            case POW:
                return 47;
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case MULTIPLY:
            case ADD:
                return yyr24();
        }
        return 157;
    }

    private int yys30() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr28();
        }
        return 157;
    }

    private int yys31() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr30();
        }
        return 157;
    }

    private int yys32() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr33();
        }
        return 157;
    }

    private int yys33() {
        switch (yytok) {
            case ADD:
                return 48;
            case DIVIDE:
                return 49;
            case MULTIPLY:
                return 50;
            case SUB:
                return 51;
            case SEMI:
            case RPAREN:
                return yyr21();
        }
        return 157;
    }

    private int yys34() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr26();
        }
        return 157;
    }

    private int yys35() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr32();
        }
        return 157;
    }

    private int yys37() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr31();
        }
        return 157;
    }

    private int yys38() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys40() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
        }
        return 157;
    }

    private int yys43() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys45() {
        switch (yytok) {
            case ENDINPUT:
            case INT:
            case STRING:
            case ID:
            case READ:
            case FOR:
            case RCURLY:
            case WHILE:
            case CHARACTER:
            case PRINT:
            case DOUBLE:
                return yyr3();
        }
        return 157;
    }

    private int yys47() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys48() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys49() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys50() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys51() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys55() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr27();
        }
        return 157;
    }

    private int yys57() {
        switch (yytok) {
            case ID:
                return 14;
            case DOUBLE:
                return 35;
            case DQUOTE:
                return 36;
            case LITERAL:
                return 37;
            case LPAREN:
                return 38;
            case QUOTE:
                return 39;
            case SUB:
                return 40;
        }
        return 157;
    }

    private int yys58() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr25();
        }
        return 157;
    }

    private int yys60() {
        switch (yytok) {
            case POW:
                return 47;
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case MULTIPLY:
            case ADD:
                return yyr23();
        }
        return 157;
    }

    private int yys61() {
        switch (yytok) {
            case POW:
                return 47;
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case MULTIPLY:
            case ADD:
                return yyr22();
        }
        return 157;
    }

    private int yys63() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr36();
        }
        return 157;
    }

    private int yys64() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr29();
        }
        return 157;
    }

    private int yys65() {
        switch (yytok) {
            case DIVIDE:
            case SUB:
            case SEMI:
            case RPAREN:
            case POW:
            case MULTIPLY:
            case ADD:
                return yyr37();
        }
        return 157;
    }

    private int yys68() {
        switch (yytok) {
            case CHARACTER:
                return 11;
            case DOUBLE:
                return 12;
            case FOR:
                return 13;
            case ID:
                return 14;
            case INT:
                return 15;
            case PRINT:
                return 16;
            case READ:
                return 17;
            case STRING:
                return 18;
            case WHILE:
                return 19;
        }
        return 157;
    }

    private int yys70() {
        switch (yytok) {
            case CHARACTER:
                return 11;
            case DOUBLE:
                return 12;
            case FOR:
                return 13;
            case ID:
                return 14;
            case INT:
                return 15;
            case PRINT:
                return 16;
            case READ:
                return 17;
            case STRING:
                return 18;
            case WHILE:
                return 19;
            case RCURLY:
                return 72;
        }
        return 157;
    }

    private int yys74() {
        switch (yytok) {
            case CHARACTER:
                return 11;
            case DOUBLE:
                return 12;
            case FOR:
                return 13;
            case ID:
                return 14;
            case INT:
                return 15;
            case PRINT:
                return 16;
            case READ:
                return 17;
            case STRING:
                return 18;
            case WHILE:
                return 19;
        }
        return 157;
    }

    private int yys75() {
        switch (yytok) {
            case CHARACTER:
                return 11;
            case DOUBLE:
                return 12;
            case FOR:
                return 13;
            case ID:
                return 14;
            case INT:
                return 15;
            case PRINT:
                return 16;
            case READ:
                return 17;
            case STRING:
                return 18;
            case WHILE:
                return 19;
            case RCURLY:
                return 76;
        }
        return 157;
    }

    private int yyr1() { // entrypoint : statementList
        {
    this.entryPoint = (ParseNode) yysv[yysp-1];
}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr37() { // char : QUOTE CHAR QUOTE
        {
    yyrv = new Symbol(Type.CHAR, "char-literal", (char) yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return 27;
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

    private int yyr14() { // declaration : STRING ID
        {
    yyrv = new DeclarationNode(Type.STRING, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr15() { // declaration : CHARACTER ID
        {
    yyrv = new DeclarationNode(Type.CHAR, (String) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr16() { // assign : ref EQUAL expr
        {
    yyrv = new AssignmentNode((ReferenceNode)yysv[yysp-3], (ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 69: return 71;
            case 25: return 46;
            default: return 3;
        }
    }

    private int yyr19() { // expr : term SUB expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "-", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr20() { // expr : term ADD expr
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "+", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr21() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 51: return 62;
            case 48: return 59;
            case 43: return 56;
            case 38: return 53;
            case 20: return 44;
            case 16: return 28;
            default: return 67;
        }
    }

    private int yyr25() { // factor : factor POW unary
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "^", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yyr26() { // factor : unary
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 50: return 61;
            case 49: return 60;
            default: return 29;
        }
    }

    private int yyr11() { // for : FOR LPAREN assign SEMI expr SEMI assign RPAREN LCURLY statementList RCURLY
        {
    yyrv = new ForStatementNode((AssignmentNode)yysv[yysp-9], (ParseNode)yysv[yysp-7], (AssignmentNode)yysv[yysp-5], (StatementListNode)yysv[yysp-2]);
}
        yysv[yysp-=11] = yyrv;
        return 4;
    }

    private int yyr29() { // group : LPAREN expr RPAREN
        {
    yyrv = new GroupNode((ParseNode)yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return yypgroup();
    }

    private int yyr30() { // group : ref
        yysp -= 1;
        return yypgroup();
    }

    private int yyr31() { // group : LITERAL
        {
    yyrv = new Symbol(Type.INT, "int-literal", (Integer) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypgroup();
    }

    private int yyr32() { // group : DOUBLE
        {
    yyrv = new Symbol(Type.DOUBLE, "double-literal", (Double) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        return yypgroup();
    }

    private int yyr33() { // group : string
        yysp -= 1;
        return yypgroup();
    }

    private int yyr34() { // group : char
        yysp -= 1;
        return yypgroup();
    }

    private int yypgroup() {
        switch (yyst[yysp-1]) {
            case 40: return 55;
            default: return 30;
        }
    }

    private int yyr18() { // input : READ ref
        {
    yyrv = new StdInNode((ReferenceNode) yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr17() { // output : PRINT expr
        {
    yyrv = new StdOutNode((ParseNode)yysv[yysp-1]);
}
        yysv[yysp-=2] = yyrv;
        return 6;
    }

    private int yyr35() { // ref : ID
        {
    yyrv = new ReferenceNode((String) yysv[yysp-1]);
}
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 75: return 7;
            case 74: return 7;
            case 70: return 7;
            case 69: return 7;
            case 68: return 7;
            case 25: return 7;
            case 17: return 41;
            case 9: return 7;
            case 0: return 7;
            default: return 31;
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
            case 74: return 8;
            case 68: return 8;
            case 0: return 8;
            default: return 22;
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
            case 68: return 70;
            case 0: return 9;
            default: return 75;
        }
    }

    private int yyr36() { // string : DQUOTE CHARS DQUOTE
        {
    yyrv = new Symbol(Type.STRING, "string-literal", (String) yysv[yysp-2]);
}
        yysv[yysp-=3] = yyrv;
        return 32;
    }

    private int yyr22() { // term : term MULTIPLY factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "*", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 33;
    }

    private int yyr23() { // term : term DIVIDE factor
        {
    yyrv = new BinaryOperationNode((ParseNode) yysv[yysp-3], "/", (ParseNode) yysv[yysp-1]);
}
        yysv[yysp-=3] = yyrv;
        return 33;
    }

    private int yyr24() { // term : factor
        yysp -= 1;
        return 33;
    }

    private int yyr27() { // unary : SUB group
        {
    yyrv = new UnaryOperationNode("-", (ParseNode) yysv[yysp-1] );
}
        yysv[yysp-=2] = yyrv;
        return yypunary();
    }

    private int yyr28() { // unary : group
        yysp -= 1;
        return yypunary();
    }

    private int yypunary() {
        switch (yyst[yysp-1]) {
            case 47: return 58;
            default: return 34;
        }
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
