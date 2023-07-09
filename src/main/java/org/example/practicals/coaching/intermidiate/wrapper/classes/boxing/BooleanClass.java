package org.example.practicals.coaching.intermidiate.wrapper.classes.boxing;

public class BooleanClass {

    public static void main(String[] args) {
        // Primitive DataType
        boolean isValue = false;


        // Non-Primitive DataTypes
        Boolean isObjValue = new Boolean(isValue);// AutoBoxing

        System.out.println(isObjValue.booleanValue());// UnBoxing

        convertStringToInteger();
    }

    public static void convertStringToInteger() {
        String str1 = "true";
        String str2 = "false";
        System.out.println("String Before: " + str1 + str2);
        System.out.println("Boolean After: " + Boolean.parseBoolean(str1) + Boolean.parseBoolean(str2));
//        if(Boolean.parseBoolean(str1)){
//
//        }
        System.out.println("-------------");
    }
}
