package org.example.practicals.coaching.intermidiate.oops.inheritance.diamond.problem;

public class BaseSubClassD {  // extends SubClassB, SubClassC   <-  NOT ALLOWED

    /* Extending two classes results in Diamond Problem hence Java does not allow multiple Class Extensions */
    /* To Resolve this Diamond problem,
            Java has introduced "Interface" concept where multiple interfaces can be implemented
    */

    /* Compiler cannot decide which print method to consider hence becomes 'ambiguous' in nature */
    public static void main(String[] args) {
        // print();
    }
}
