package org.example.practicals.coaching.intermidiate.wrapper.classes.boxing;

public class FloatClass {
    public static void main(String[] args) {
        // Primitive DataType
        float floatValue = 0.0f;

        // Non-Primitive DataTypes
        Float floatObjValue = new Float(floatValue);// AutoBoxing

        System.out.println(floatObjValue.floatValue());// UnBoxing
    }
}
