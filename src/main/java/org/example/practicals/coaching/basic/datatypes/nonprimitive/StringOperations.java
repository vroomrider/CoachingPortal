package org.example.practicals.coaching.basic.datatypes.nonprimitive;

import java.util.stream.IntStream;

public class StringOperations {

    public static void stringConcept() {
    /*
     *  String is also called an immutable class
     *  String can be created in two ways
        1. literal way
        2. By using "new" keyword
     *  String creation are stored under
     *      "Constant pool" and "Non-Constant pool" in memory depending on the way of creation
     *  Comparing values in String
     *      ==           compares the address
     *      .equals()    compares the values
     */
        String str = "String";         // Constant pool (similar data - address will be same)
        String string = new String("string");  // Non-Constant pool (similar data - address will not be same)

        String str2 = "String";        // Constant pool
        // str = str2;

        String string2 = new String("string"); // Non-Constant pool
        // string != string2;

        boolean isEqualConstantPool = str.equals(str2);
        System.out.println("Constant Pool: " + isEqualConstantPool);

        boolean isDoubleEqualsConstantPool = str == str2;
        System.out.println("Constant Pool: " + isDoubleEqualsConstantPool);

        boolean isEqualNonConstantPool = string.equals(string2);
        System.out.println("Non-Constant Pool: " + isEqualNonConstantPool);

        boolean isDoubleEqualsNonConstantPool = string == string2;
        System.out.println("Non-Constant Pool: " + isDoubleEqualsNonConstantPool);


        // String Concatenation
        String strConcat1 = new String("non constant 1");
        String strConcat2 = new String("non constant 2");

        String newNonConstantString = strConcat1 + strConcat2;
        String newNonConstantString2 = "constant 3" + strConcat2;
        String newConstantString = "constant 3" + "constant 4";

        extendedClasses();
        subFunctions();
        mutabilityConcept();
    }

    private static void extendedClasses() {
        /*
         * String Builder
         *
         * StringBuilder strBuilder = ""; // Not possible
         * */
        StringBuilder stringBuilder = new StringBuilder("Girish");
        System.out.println(stringBuilder);
        if (stringBuilder.toString() instanceof String) {
            System.out.println("String Instance matched");
        }
        /* After toSting() conversion inbuilt functions will be w.r.t String */
        String resultString = stringBuilder.toString();
        /*
            Functions Available in StringBuilder
            -------------------------------------
            stringBuilder.append();
            stringBuilder.length();
            stringBuilder.delete();
            stringBuilder.deleteCharAt();
            stringBuilder.indexOf();
            stringBuilder.insert();
            stringBuilder.lastIndexOf();
            stringBuilder.replace();
            stringBuilder.reverse();
            stringBuilder.capacity();
            stringBuilder.setCharAt();
            stringBuilder.setLength();
            stringBuilder.subSequence();
            stringBuilder.subString();
            stringBuilder.equals();
            stringBuilder.chars();
            stringBuilder.trimToSize();
            stringBuilder.ensureCapacity();
         */
        // Simple Use of the Builder and Buffer
        StringBuilder strBuilder = new StringBuilder("Girisha");
        System.out.println("BUILDER: " + strBuilder.reverse().toString());


        /*
         * String Buffer
         *
         * StringBuffer strBuffer = ""; // Not Possible
         * */
        StringBuffer stringBuffer = new StringBuffer("Girish");
        System.out.println(stringBuffer);
        stringBuffer.toString();
        /* After toSting() conversion inbuilt functions will be w.r.t String */
        String resultString2 = stringBuffer.toString();
        /*
            Functions Available in stringBuffer
            -------------------------------------
            stringBuffer.append();
            stringBuffer.length();
            stringBuffer.delete();
            stringBuffer.deleteCharAt();
            stringBuffer.indexOf();
            stringBuffer.insert();
            stringBuffer.lastIndexOf();
            stringBuffer.replace();
            stringBuffer.reverse();
            stringBuffer.capacity();
            stringBuffer.setCharAt();
            stringBuffer.setLength();
            stringBuffer.subSequence();
            stringBuffer.subString();
            stringBuffer.equals();
            stringBuffer.chars();
            stringBuffer.trimToSize();
            stringBuffer.ensureCapacity();
         */
        // Simple Use of the Builder and Buffer
        StringBuffer strBuffer = new StringBuffer("Girisha");
        System.out.println("BUFFER: " + strBuffer.reverse().toString());
    }

    private static void subFunctions() {

        StringOperations.toCharArray("Girish");
        StringOperations.charAt("Girish Naik");
        StringOperations.trim("  ABC  CDE  ");
        StringOperations.toUpperCase("Girish Naik");
        StringOperations.toLowerCase("Girish Naik");

        StringOperations.split("Girish Naik", "i");
        StringOperations.endsWith("Girish", "ing");
        StringOperations.startsWith("Girisha", "a");

        StringOperations.subString("Girish Naik", 7, "Girish Naik".length());
        StringOperations.equalsExample("Girish", "Naik");
        StringOperations.equalsIgnoreCase("GirisHA", "Girisha");

        StringOperations.charsMethod("Girish");
        StringOperations.compareTo("Girish", "Girish");
        StringOperations.concat("Girish", "Girisha");
        StringOperations.printASCIIValue();
        StringOperations.isEmpty(""); // Empty String check
    }

    private static void mutabilityConcept() {
        String str = new String("Girish");
        System.out.println("String Value Before: " + str);
        str.concat("Naik"); // Immutable character
        System.out.println("String Value After: " + str);
        String newString = str.concat("Naik"); // Immutable character
        System.out.println("New Created String Value After: " + newString);

        StringBuilder strBuilder = new StringBuilder("Girish");
        System.out.println("StringBuilder Value Before: " + strBuilder);
        strBuilder.append(" ");
        strBuilder.append("Naik"); // Mutable character
        System.out.println("StringBuilder Value After: " + strBuilder);

        StringBuffer strBuffer = new StringBuffer("Girish");
        System.out.println("StringBuffer Value Before: " + strBuffer);
        strBuffer.append(" ");
        strBuffer.append("Naik"); // Mutable character
        System.out.println("StringBuffer Value After: " + strBuffer);
    }

    public static void toCharArray(String str) {
        // str = "Girish"
        char[] chs = str.toCharArray();
        /*
         *  chs.length = 6
         *  chs[]{'G','i','r','i','s','h'}
         *         0,  1,  2,  3,  4,  5
         */
        for (int i = chs.length - 1; i >= 0; i--) {
            System.out.print(chs[i]);
        }
        // o/p: hsiriG
    }

    public static void charAt(String str) {
        /*
         *  str.length() = 6
         *    str{'G','i','r','i','s','h'}
         *         0,  1,  2,  3,  4,  5
         */
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        // o/p: hsiriG
    }

    public static void trim(String str) {
        /*
         *  str = "  ABC  CDE  ";
         *    str{' ',' ','A','B','C',' ',' ','C','D','E',' ',' '}
         *         0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11
         */
        System.out.println("Result Length before Trim: " + str.length());
        String strResult = str.trim();
        System.out.println("Result Length after Trim: " + strResult.length());
        // o/p: ABC  CDE

        /*
         FirstName.maxLength = 3
         FirstName.maxLength = 10
         FirstName: [    Pradeep    ] // length=15
         FirstName.trim()
         FirstName: [Pradeep] // length=7
        */

    }

    public static void toUpperCase(String str) {
        String upperCaseConverted = str.toUpperCase();
        System.out.println(upperCaseConverted);
    }

    public static void toLowerCase(String str) {
        String lowerCaseConverted = str.toLowerCase();
        System.out.println(lowerCaseConverted);
    }

    public static void split(String str, String charPattern) {
        /*
            charPattern = " "
         */
        System.out.println(str + ": length =" + str.length());
        String[] strArray = str.split(charPattern);
        for (String string : strArray) {
            System.out.print(string + " ");
        }
        System.out.print(": length =" + strArray.length);
    }

    public static void subString(String str, int startIndex, int endIndex) {
        String startIndexResult = str.substring(startIndex);
        System.out.println("startIndexResult= " + startIndexResult);
        String startAndEndIndexResult = null;
        try {
            startAndEndIndexResult = str.substring(startIndex, endIndex);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caugth Exception: " + e.getMessage());
        }
        System.out.println("startAndEndIndexResult= " + startAndEndIndexResult);
    }

    public static void equalsExample(String str1, String str2) {
        boolean isEqual = str1.equals(str2);
        if (isEqual) {
            System.out.println("Equal Strings");
        } else {
            System.out.println("Unequal Strings");
        }
    }

    public static void toStringExample(StringBuilder strBuilder, StringBuffer strBuffer) {
        strBuilder.toString();
        strBuffer.toString();
    }

    public static void endsWith(String str, String strRef) {
        if (str.endsWith(strRef)) {
            System.out.println("String \"" + str + "\" ends with " + strRef);
        } else {
            System.out.println("String " + str + " does not end with " + strRef);
        }
    }

    public static void startsWith(String str, String strRef) {
        if (str.startsWith(strRef)) {
            System.out.println("String \"" + str + "\" starts with " + strRef);
        } else {
            System.out.println("String " + str + " does not start with " + strRef);
        }
    }

    public static void equalsIgnoreCase(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("provided Strings match together irrespective of Upper/Lower Case");
        } else {
            System.out.println("provided Strings do not match");
        }
    }

    public static void charsMethod(String str) {
        // JAVA 8 - feature
        IntStream intStream = str.chars();
    }

    public static void compareTo(String str1, String str2) {
        int comparedValue = str1.compareTo(str2);
        /*
            ASCII Char by ASCII Char comparison
            --------------------------------------
            "Girisha".compareTo("Girish")  > 1
            "Girish".compareTo("Girisha")  > -1
            "Girisha".compareTo("aGirish") > 71-97 = -26
            "Girisha".compareTo("bGirish") > 71-98 = -27
            "Girish".compareTo("Girish")   > 0
         */
        if (comparedValue == 0) {
            System.out.println("comparedValue matched:" + comparedValue);
        } else {
            System.out.println("comparedValue difference in specific char case:" + comparedValue);
        }
    }

    public static void concat(String str1, String str2) {
        // String will be joined together and output will be received
        String concatenatedString = str1 + str2;
        System.out.println(concatenatedString);
    }

    public static void printASCIIValue() {
        for (int i = 97; i <= 122; i++) {
            System.out.print("[" + (char) i + ":" + i + "] - ");
        }
        System.out.println();
        System.out.println();
        for (int i = 65; i <= 90; i++) {
            System.out.print("[" + (char) i + ":" + i + "] - ");
        }
    }


    public static void isEmpty(String str) {
        if (str.isEmpty()) {
            System.out.println("String is Empty, Please Enter a Value!");
        } else {
            System.out.println("String value is Not Empty and the value is \"" + str + "\"");
        }
    }
}
