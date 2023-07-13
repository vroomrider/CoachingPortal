package org.example.practicals.coaching.intermidiate.oops.polymorphism.overloading.model;

public class Mammal extends Animal {
    public void speak() {
        System.out.println("Mammals: Speak()");
    }

    public void speak(String sound, String size) {
        System.out.println("Animals: Speak( " + sound + " ), with " + "\"" + size + "\"" + " size");
    }
}
