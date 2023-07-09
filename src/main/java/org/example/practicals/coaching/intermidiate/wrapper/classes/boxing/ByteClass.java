package org.example.practicals.coaching.intermidiate.wrapper.classes.boxing;

public class ByteClass {

    public static void main(String[] args) {
        // Primitive DataType
        byte value = 10;

        // Non-Primitive DataTypes
        Byte byteObjValue = new Byte(value);// AutoBoxing

        System.out.println(byteObjValue.byteValue());// UnBoxing

    }
}
