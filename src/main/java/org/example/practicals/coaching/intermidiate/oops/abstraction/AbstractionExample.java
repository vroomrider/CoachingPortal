package org.example.practicals.coaching.intermidiate.oops.abstraction;

import org.example.practicals.coaching.intermidiate.oops.abstraction.pojo.model.Student;

public class AbstractionExample {
    public static void main(String[] args) {

        Student girish = new Student();
        girish.setStudentName("Girish Naik");
        girish.setStudentAge("24");

        System.out.println(girish.getStudentAge());

        Student pradeep = new Student();
        pradeep.setStudentAge("29");
        pradeep.setStudentName("Pradeep Naik");

        System.out.println(girish.getStudentAge() + "-" + girish.getStudentName() + "-" + pradeep.getStudentAge()+ "-" + pradeep.getStudentName());
    }
}
