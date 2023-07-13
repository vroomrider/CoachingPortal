package org.example.practicals.coaching.intermidiate.oops.polymorphism.interview.question.overridingwithexceptions;

public class TestingExceptionsOverriding {
    public static void main(String[] args) {

        SubClassOverridingWithExceptions subClassOverridingWithExceptions = new SubClassOverridingWithExceptions();
        try {
            subClassOverridingWithExceptions.speak();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        subClassOverridingWithExceptions.speakWithException();

        subClassOverridingWithExceptions.speakWithoutException();
    }
}
