package org.example.practicals.coaching.intermidiate.oops.inheritance.model;

public class Superclass {

    public String name;

    public String gender;

    public String height;

    public String weight;

    public int shirt;

    private int underGarments;

    public Superclass() {
        System.out.println("Super class constructor");
    }

    public int getSuperProperties() {
        return 100000;
    }
}
