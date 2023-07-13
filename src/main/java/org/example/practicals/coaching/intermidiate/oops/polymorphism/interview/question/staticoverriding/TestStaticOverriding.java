package org.example.practicals.coaching.intermidiate.oops.polymorphism.interview.question.staticoverriding;

public class TestStaticOverriding {

    public static void main(String[] args) {
        System.out.println("\n --- Static ---");
        SuperclassStaticOverriding.staticSpeak();
        SuperclassStaticOverriding superclassStaticOverriding = new SubclassStaticOverriding();
        superclassStaticOverriding.nonStaticSpeak();


        System.out.println("\n --- Non Static ---");
        SubclassStaticOverriding.staticSpeak();
        SubclassStaticOverriding subclassStaticOverriding = new SubclassStaticOverriding();
        subclassStaticOverriding.nonStaticSpeak();

    }
}
