package org.example.practicals.coaching.intermidiate.casting.derived;

import org.example.practicals.coaching.intermidiate.casting.derived.model.Animal;
import org.example.practicals.coaching.intermidiate.casting.derived.model.Dog;

public class DownCasting {
    public static void main(String[] args) {

        /* SPECIAL CASE: Compiler will compile but JVM throws exception[ ClassCastException ] */
        /* NOTE: Without UpCasting - DownCasting is not possible */
        try {
            Dog dog = (Dog) new Animal();
        } catch (ClassCastException e) {
            System.err.println("SPECIAL CASE: " + e.getMessage() + "\n");
        }

        Animal animal = new Dog(); // UpCasting
        animal.eat();
        animal.speak();
        System.out.println();

        Dog dog = (Dog) animal;
        dog.eat();
        dog.speak();
        dog.wagTail();
        dog.search();
        System.out.println();
    }
}
