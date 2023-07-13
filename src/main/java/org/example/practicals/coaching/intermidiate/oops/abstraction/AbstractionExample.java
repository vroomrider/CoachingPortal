package org.example.practicals.coaching.intermidiate.oops.abstraction;

import org.example.practicals.coaching.intermidiate.oops.abstraction.model.Girish;
import org.example.practicals.coaching.intermidiate.oops.abstraction.model.Pradeep;
import org.example.practicals.coaching.intermidiate.oops.abstraction.model.Student;


/*
    Pre-requisite:
    1. Polymorphism(OverLoading and OverRiding)
    2. UpCasting and DownCasting
 */
public class AbstractionExample {
    public static void main(String[] args) {

        // UpCasting
        Student student = new Girish();
        student.status("Student");

        // DownCasting can only be performed for the upcasted object
        Girish girish = (Girish) student;
        student.status("Student");

        Student student1 = new Pradeep();
        student1.status("Teacher");
    }
}
