package org.example.practicals.coaching.intermidiate.exceptions.exception.custom;


/*
    Note:
    * Constructor is not a member of the class

    Criteria to convert a class into Custom Exception
    -------------------------------------------------
    1. Extends Exception
    2. Constructor(msg){ super(msg); }
 */
public class AgeValidationException extends Exception {

    public AgeValidationException(String msg) {
        /*
         * Calls the parent class constructor
         * In a constructor, super should be the first statement
         */
        super(msg);
        System.out.println(msg);
    }

    // INTERVIEW QUESTION
    public AgeValidationException() {
        super("Not Allowed For Voting");
        System.out.println("Not Allowed For Voting");
    }

}
