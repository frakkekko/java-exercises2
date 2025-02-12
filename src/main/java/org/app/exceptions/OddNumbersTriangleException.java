package org.app.exceptions;

public class OddNumbersTriangleException extends RuntimeException {
    public OddNumbersTriangleException(int providedNumber, int startingRange, int endRange) {
        super("Number inserted: " + providedNumber + ". You must provide a number contained in range [" + startingRange + "," + endRange + "]");
    }
}
