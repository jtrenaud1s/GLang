package edu.semo.jatsz.glang;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Written By:
 * Dr. Robert Lowe
 *
 * Adapted By:
 * Jordan Renaud, Alex Garza, Tushar Saini, Zach Philipp, Shane Hoocke (JATZS)
 *
 * Represents the assignment of a value to a variable reference
 */
public class Lexer implements Tokens {
    //constructor
    public Lexer(final InputStream in) {
        line = "";
        lineNo = 0;
        colNo = 0;
        currentChar = ' ';
        scan = new Scanner(in);
    }

    // input status
    private String line;
    private int lineNo;
    private int colNo;
    private char currentChar;
    private final Scanner scan;

    // get the next character
    private void nextChar() {
        colNo++;
        while (colNo > line.length()) {
            if (!scan.hasNext()) {
                colNo--;
                currentChar = (char) 0;
                return;
            }

            line = scan.nextLine() + "\n";
            colNo = 1;
            lineNo++;
        }

        currentChar = line.charAt(colNo - 1);
    }

    // report current line number
    public int getLineNumber() {
        return lineNo;
    }

    // report current column number
    public int getColumnNumber() {
        return colNo;
    }

    // return the current line
    public String getLine() {
        return line;
    }

    // print an error message
    public void printError(final String msg) {
        final String lineMsg = "Line " + getLineNumber() + " Column " + getColumnNumber();
        System.err.println(msg);
        System.out.printf("%s: %s", lineMsg, getLine());
        System.out.printf(" %" + lineMsg.length() + "s %" + getColumnNumber() + "s\n", "", "^");
        System.out.println();
    }

    // Lexer Status
    int token;
    Object value;

    public int getToken() {
        return token;
    }

    public Object getValue() {
        return value;
    }


    // matches a single character token
    // Returns true on match
    private boolean singleMatch(final char[] c, final int[] token) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == currentChar) {
                this.token = token[i];
                this.value = null;
                return true;
            }
        }

        return false;
    }


    //matches an id
    private void idOrKw() {
        StringBuilder sb = new StringBuilder();

        while (Character.isLetterOrDigit(currentChar)) {
            sb.append(currentChar);
            nextChar();
        }

        value = sb.toString();

        if (value.equals("int")) {
            token = INT;
        } else if (value.equals("double")) {
            token = DOUBLE;
        } else if (value.equals("print")) {
            token = PRINT;
            value = null;
        } else if (value.equals("read")) {
            token = READ;
            value = null;
        } else if (!Character.isDigit(value.toString().toCharArray()[0])) {
            token = ID;
            value = sb.toString();
        } else {
            token = error;
        }

    }


    //matches literals
    private void literal() {
        StringBuilder sb = new StringBuilder();

        //grab the whole number part
        while (Character.isDigit(currentChar)) {
            sb.append(currentChar);
            nextChar();
        }
        //grab the fractional part (if there is one)
        if (currentChar == '.') {
            sb.append('.');
            nextChar();
            while (Character.isDigit(currentChar)) {
                sb.append(currentChar);
                nextChar();
            }
            token = DOUBLE;
            value = Double.valueOf(sb.toString());
        } else {
            value = Integer.valueOf(sb.toString());
            token = LITERAL;
            return;
        }
    }


    // load the next token
    public void next() {
        final char[] c = { '=', '+', '-', ';', '(', ')', '*', '/', '^' };
        final int[] ct = { EQUAL, ADD, SUB, SEMI, LPAREN, RPAREN, MULTIPLY, DIVIDE, POW};

        // skip whitespace
        while (Character.isWhitespace(currentChar)) {
            nextChar();
        }

        // detect end of the file
        if (currentChar == 0) {
            token = ENDINPUT;
            return;
        }

        // assume there is an error
        token = error;
        value = String.valueOf(currentChar);

        // match strings
        if (Character.isLetter(currentChar)) {
            idOrKw();
        } else if (Character.isDigit(currentChar)) {
            literal();
        } else if (singleMatch(c, ct)) {
            nextChar();
        } else {
            currentChar = ' ';
        }
    }

    // convert the current token to a string
    public String toString() {
        String[] label = new String[error + 1];

        label[EQUAL] = "EQUAL";
        label[ID] = "ID";
        label[ADD] = "ADD";
        label[SUB] = "SUB";
        label[LITERAL] = "LITERAL";
        label[LPAREN] = "LPAREN";
        label[RPAREN] = "RPAREN";
        label[SEMI] = "SEMI";
        label[INT] = "INT";
        label[ENDINPUT] = "ENDINPUT";
        label[DOUBLE] = "DOUBLE";
        label[PRINT] = "PRINT";
        label[READ] = "READ";
        label[error] = "error";

        return label[token] + ": " + value;
    }

    // test the lexer
    public static void main(final String[] args) {
        final Lexer lexer = new Lexer(System.in);

        do {
            lexer.next();
            if (lexer.getToken() == error) {
                lexer.printError("Invalid Token");
            } else {
                System.out.println(lexer);
            }
        } while (lexer.getToken() != ENDINPUT);
    }
}
