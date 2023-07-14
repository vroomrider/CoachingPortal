package org.example.practicals.coaching.intermidiate.casting.derived;

import org.example.practicals.coaching.intermidiate.casting.derived.model.Animal;
import org.example.practicals.coaching.intermidiate.casting.derived.model.Cat;
import org.example.practicals.coaching.intermidiate.casting.derived.model.Dog;

public class UpCasting {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        animal.eat();

        /* Cat Class - Implementation  */
        Cat cat = new Cat();
        cat.eat();
        cat.speak();
        cat.sleep();

        Animal animalCat = new Cat();
        animalCat.speak();
        animalCat.eat();
        // animalCat.sleeps();

        /* Dog Class - Implementation  */
        Dog dog = new Dog();
        dog.eat();
        dog.speak();
        dog.wagTail();

        Animal animalDog = new Dog();
        animalDog.speak();
        animalDog.eat();
        // animalDog.wagTail();
        // animalDog.search();

    }
}
