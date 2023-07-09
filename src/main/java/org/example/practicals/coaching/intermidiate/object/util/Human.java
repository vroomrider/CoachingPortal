package org.example.practicals.coaching.intermidiate.object.util;

public class Human {

    public int hands;

    public int eyes;

    public int legs;

    public String colour;

    public String sitting(){
        return "Sitting";
    }

    public String running(){
        return "running";
    }

    public String eating(){
        return "eating";
    }

    public String reading(){
        return "reading";
    }

    public static void main(String[] args) {

        Human pradeep = new Human();
        pradeep.colour = "White";
        pradeep.eating();

        Human girish = new Human();
        girish.colour = "Whitish Brown";
        girish.eating();
        girish.reading();

        Human pragna = new Human();
        pragna.colour = "Brown";
        pragna.sitting();

        Human pushpalatha = new Human();
        pushpalatha.colour = "Whitish Brown";
        pushpalatha.running();
    }
}
