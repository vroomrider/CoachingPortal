package org.example.practicals.coaching.intermidiate.exceptions.exception;

import org.example.practicals.coaching.intermidiate.exceptions.exception.custom.AgeValidationException;

public class CustomExceptionExecution {

    public static void main(String[] args) {
        try {
            getAgeValidation(17);
        } catch (AgeValidationException e) {
            System.out.println("AgeValidationException " + e);
        }
    }

    public static String getAgeValidation(int age) throws AgeValidationException {
        if (age > 18) {
            System.out.println("Allowed for Voting");
            return "eligible";
        } else {
            throw new AgeValidationException("eligible but allowed after 18");
        }
    }
}
