package org.example.practicals.coaching.intermidiate.oops.inheritance.diamond.problem.resolution;

public class BaseSubClassD implements SubInterfaceB, SubInterfaceC {
    /* Multiple interfaces are allowed for implementing */
    /*
        Interface concept is the Java's resolution to [ Diamond problem ]
     */
    public void print() {
        System.out.println("This is the Base Sub Class B");
    }

    public void getData() {
        System.out.println("This is a method from Sub interface C");
    }

    public static void main(String[] args) {
        BaseSubClassD baseSubClassD = new BaseSubClassD();
        baseSubClassD.print();
        baseSubClassD.getData();
    }
}
