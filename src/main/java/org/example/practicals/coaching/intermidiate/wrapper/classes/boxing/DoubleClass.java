package org.example.practicals.coaching.intermidiate.wrapper.classes.boxing;

public class DoubleClass {
    public static void main(String[] args) {
        // Primitive DataType
        double doubleValue = 0.0d;

        // Non-Primitive DataTypes
        Double doubleObjValue = new Double(doubleValue);// AutoBoxing

        System.out.println(doubleObjValue.doubleValue());// UnBoxing
    }
}
