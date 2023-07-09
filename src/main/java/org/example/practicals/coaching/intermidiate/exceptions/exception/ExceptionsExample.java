package org.example.practicals.coaching.intermidiate.exceptions.exception;

// throws cannot be used on Class level
public class ExceptionsExample {

    // In main method syntax, we can
    public static void main(String[] args) throws Exception {

        exceptionExample(2, 0);
    }

    // numerator(dividend)/denominator(divisor)
    public static void exceptionExample(int dividend, int divisor) {
        int quotient = dividend / divisor;
    }
}
