package org.example.practicals.coaching.intermidiate.oops.polymorphism.interview.question.staticoverriding;

public class SubclassStaticOverriding extends SuperclassStaticOverriding {

    public static void staticSpeak() {
        System.out.println("Sub -> Static method - Speaking");
    }

    public void nonStaticSpeak() {
        System.out.println("Sub -> NonStatic method - Speaking");
    }
}
