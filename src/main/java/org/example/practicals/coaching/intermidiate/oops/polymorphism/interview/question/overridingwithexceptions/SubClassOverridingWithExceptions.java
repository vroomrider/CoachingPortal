package org.example.practicals.coaching.intermidiate.oops.polymorphism.interview.question.overridingwithexceptions;

public class SubClassOverridingWithExceptions extends SuperClassUsingExceptionSignature {

    public void speak() throws Exception {
        System.out.println("Super Class - With - Exceptions -> SubClass - With - Exceptions");
    }

    /*
        // Cannot have throws in Subclass
        public void speakWithoutException() throws Exception{
            System.out.println("Super Class - Without - Exceptions -> Sub Class - With - Exceptions");
        }
    */

    public void speakWithException() {
        System.out.println("SuperClass - With - Exception -> Sub Class - Without - Exceptions");
    }

}
