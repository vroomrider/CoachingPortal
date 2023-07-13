package org.example.practicals.coaching.intermidiate.oops.polymorphism.interview.question.overridingwithexceptions;

/*
    Observe the SubClass OverRiding Results with Method Signature
 */
public class SuperClassUsingExceptionSignature {

    public void speak() throws Exception {
        System.out.println("SuperClass - With - Exceptions");
    }

    public void speakWithoutException() {
        System.out.println("SuperClass - Without - Exceptions");
    }

    public void speakWithException() throws Exception {
        System.out.println("SuperClass - With - Exceptions");
    }
}
