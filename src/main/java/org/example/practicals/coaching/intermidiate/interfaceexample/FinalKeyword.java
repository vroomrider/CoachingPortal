package org.example.practicals.coaching.intermidiate.interfaceexample;

public class FinalKeyword {

    // defined and declared at the same line
    public final int finalIntValue = 100; // final variable

    // Only defined but declared at the constructor level
    public final int blankFinalIntValue; // Blank final variable

    public FinalKeyword() {
        // constructor level
        blankFinalIntValue = 100;
    }
}
