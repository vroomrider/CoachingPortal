package org.example.practicals.coaching.intermidiate.wrapper.classes.boxing;

public class ShortClass {
    public static void main(String[] args) {
        // Primitive DataType
        short shortValue = 10021;

        // Non-Primitive DataTypes
        Short shortObjValue = new Short(shortValue); // AutoBoxing

        System.out.println(shortObjValue.shortValue());// UnBoxing
    }
}
