package org.example.practicals.coaching.intermidiate.oops.abstraction.model;

public class Pradeep extends Student {

    private double height;

    @Override
    public String toString() {
        System.out.println("Male Student as a teacher");
        return "Student: " + getStudentName() + " with " + height;
    }

    @Override
    public void status(String status){
        System.out.println("Pradeep's status: " + status);
    }
}
