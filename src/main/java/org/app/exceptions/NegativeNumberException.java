package org.app.exceptions;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException() {
        super("You must provide only not negative numbers");
    }
}