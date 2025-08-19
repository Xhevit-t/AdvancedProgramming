package aud4.calculator;

public class UnknownOperatorException extends Exception {
    public UnknownOperatorException(char op) {
        super("Unknown operator: " + op);
    }
}
