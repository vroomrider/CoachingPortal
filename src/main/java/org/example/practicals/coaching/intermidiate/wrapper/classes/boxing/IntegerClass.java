package org.example.practicals.coaching.intermidiate.wrapper.classes.boxing;

public class IntegerClass {

    public static void main(String[] args) {
        // Primitive DataType
        int intValue = 1001;

        // Non-Primitive DataTypes
        Integer intObjValue = new Integer(intValue);// AutoBoxing

        System.out.println(intObjValue.intValue());// UnBoxing

        convertStringToInteger();
        convertIntegerToString();
    }

    public static void convertStringToInteger() {
        String str1 = "1234";
        String str2 = "1234";
        System.out.println("String Before: " + (str1 + str2));
        System.out.println("Integer After: " + (Integer.parseInt(str1) + Integer.parseInt(str2)));
        System.out.println("-------------");
    }

    public static void convertIntegerToString() {
        Integer int1 = 1234;
        Integer int2 = 1234;
        System.out.println("Integer Before: " + (int1 + int2));
        System.out.println("String After: " + (Integer.toString(int1) + Integer.toString(int2)));
        System.out.println("-------------");
    }
}
