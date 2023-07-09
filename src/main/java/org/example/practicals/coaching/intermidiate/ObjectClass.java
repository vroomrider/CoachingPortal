package org.example.practicals.coaching.intermidiate;

public class ObjectClass {

    public static void main(String[] args) {
        Object obj = new Object();

        obj.getClass();                            // 1
        obj.notify();                              // 2
        obj.notifyAll();                           // 3

        try {
            obj.wait();                            // 4
            obj.wait(1000);                 // 5
            obj.wait(1000, 1000);     // 6
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Main functions/methods used in every other classes
        obj.equals(null);                          // 7
        obj.hashCode();                            // 8
        obj.toString();                            // 9

        // Address of any class(Syntax)

    }
}
