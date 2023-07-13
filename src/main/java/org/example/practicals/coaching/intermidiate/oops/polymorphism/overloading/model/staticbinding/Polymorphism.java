package org.example.practicals.coaching.intermidiate.oops.polymorphism.overloading.model.staticbinding;

import org.example.practicals.coaching.intermidiate.oops.polymorphism.overloading.model.Animal;
import org.example.practicals.coaching.intermidiate.oops.polymorphism.overloading.model.Dog;
import org.example.practicals.coaching.intermidiate.oops.polymorphism.overloading.model.Mammal;

/*
    Pre-Requisite:
    1. Object Class

    Post:
    1. Wrapper Classes
 */
public class Polymorphism {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.speak();
        animal.speak("Bow Bow");
        animal.speak("Meow Meow", "Small", "Cat");

        Mammal mammal = new Mammal();
        mammal.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
