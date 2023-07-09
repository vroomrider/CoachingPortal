package org.example.practicals.coaching.intermidiate.oops.abstraction.pojo.model;


// POJO - Plain Old Java Object
public class Student {

    private int studentId;

    private String studentName;

    private String studentAge;

    private String studentSection;

    public String getStudentName() {
        System.out.println(studentName);
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }
}
