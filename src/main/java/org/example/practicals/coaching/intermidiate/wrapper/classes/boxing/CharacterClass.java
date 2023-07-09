package org.example.practicals.coaching.intermidiate.wrapper.classes.boxing;

public class CharacterClass {

    public static void main(String[] args) {
        // Primitive DataType
        char ch = 'c';

        // Non-Primitive DataTypes
        Character chObjValue = new Character(ch);// AutoBoxing

        System.out.println(chObjValue.charValue());// UnBoxing
    }
}
