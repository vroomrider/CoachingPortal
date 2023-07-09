package org.example.practicals.coaching.basic.loops;

public class Loops {

    public static void main(String[] args) {

//        int i=0; // declaration and definition

        // variable(constant), condition(false), infinite
        // a=0, a>1, increment/decrement

//        i++ / ++i

        int i = 1;

        int sum = i++ + ++i + i++ + ++i; // sum=12  i=5

        System.out.println("i = " + i + ", sum = " + sum);

        i = 1; // overriding
        sum = 0; // overriding
        // sum = i++ + ++i + i++ + ++i; // sum=12  i=5

        System.out.println("i = " + i + ", sum = " + sum);

    }

    // stack memory
    // i
    // sum


    // Heap Memory
    // i=1
    // sum=0
}
