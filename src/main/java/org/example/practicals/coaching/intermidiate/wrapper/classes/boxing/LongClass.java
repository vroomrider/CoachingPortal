package org.example.practicals.coaching.intermidiate.wrapper.classes.boxing;

public class LongClass {
    public static void main(String[] args) {
        // Primitive DataType
        long longValue = 1001l;

        // Non-Primitive DataTypes
        Long longObjValue = new Long(longValue);// AutoBoxing

        System.out.println(longObjValue.longValue());// UnBoxing
    }
}
