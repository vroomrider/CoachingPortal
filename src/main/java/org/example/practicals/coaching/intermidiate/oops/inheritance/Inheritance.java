package org.example.practicals.coaching.intermidiate.oops.inheritance;

import org.example.practicals.coaching.intermidiate.oops.inheritance.model.Subclass;

public class Inheritance {
    /*
        Inheriting all the members(properties and methods) of a super class into subclass
        To denote inheritance with two classes, we use "extends" keyword
        In inheritance, Except private and constructor all are inherited into subclass
     */
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.getSuperProperties();
        subclass.name = "girish";

        // Object class members are inherited automatically, Since it is the superclass of any class created
        subclass.toString();
        System.out.println(subclass.toString());

    }
}
