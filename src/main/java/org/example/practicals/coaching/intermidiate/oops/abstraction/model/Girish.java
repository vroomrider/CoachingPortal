package org.example.practicals.coaching.intermidiate.oops.abstraction.model;

public class Girish extends Student {
    private String name;

    private double height;

    @Override
    public String toString() {
        System.out.println("Male Student as a student");
        return "Student: " + getStudentName() + " with " + height;
    }

    @Override
    public void status(String status) {
        System.out.println("Girish's status: " + status);
    }
}
