package org.example.practicals.coaching.intermidiate.oops.polymorphism.overloading.model;

public class Animal {

    public void speak() {
        System.out.println("Animals: Speak()");
    }

    /*
        // With No Difference in parameter, return type change does not make sense
        public int speak() {
            System.out.println("Animals: Speak()");
            return 0;
        }
     */

    // With Difference in parameter, return type does not matter
    public int speak(String sound) {
        System.out.println("Animals: Speak( " + sound + " )");
        return 0;
    }

    public void speak(String sound, String size, String category) {
        System.out.println("Animals: Speak( " + sound + " ), with " + "\"" + size + "\"" + " size, falls under " + category + " Catergory");
    }

    public void speak(String sound, String size, String category, int count) {
        System.out.println("Animals: Speak( " + sound + " ), with " + "\"" + size + "\"" + " size, falls under " + category + " Catergory");
    }

    /*
        // Number of Parameters
        // Order  of Parameters
        public void speak(int count, String sound, String size, String category) {
            System.out.println("Animals: Speak( " + sound + " ), with " + "\"" + size + "\"" + " size, falls under " + category + " Catergory");
        }
     */
}
