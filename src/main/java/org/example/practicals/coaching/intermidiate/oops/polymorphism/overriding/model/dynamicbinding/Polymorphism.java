package org.example.practicals.coaching.intermidiate.oops.polymorphism.overriding.model.dynamicbinding;

import org.example.practicals.coaching.intermidiate.oops.polymorphism.overriding.model.Animal;
import org.example.practicals.coaching.intermidiate.oops.polymorphism.overriding.model.Dog;
import org.example.practicals.coaching.intermidiate.oops.polymorphism.overriding.model.Mammal;

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

        Mammal mammal = new Mammal();
        mammal.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
