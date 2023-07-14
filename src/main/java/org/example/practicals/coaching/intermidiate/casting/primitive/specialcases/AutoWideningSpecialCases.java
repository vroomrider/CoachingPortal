package org.example.practicals.coaching.intermidiate.casting.primitive.specialcases;

/*
    char and boolean conversion cases
 */
public class AutoWideningSpecialCases {

    static byte byteValue = 1;
    static short shortValue = 1;
    static int intValue = 1;
    static long longValue = 1l;

    static float floatValue = 1.0f;
    static double doubleValue = 1.0d;

    static char charValue = 'a';
    static boolean booleanValue = true;

    public static void main(String[] args) {
        /* Special Cases */
        charValue = autoWideningForCharData();
        booleanValue = autoWideningForBooleanData();

        /* Special Cases */
        explicitNarrowingForCharData();
        explicitNarrowingForBooleanData();
    }

    private static char autoWideningForCharData() {
        System.out.println("\n---- !Conversion to char ----");
        /*
            Cannot Convert: char to other primitives
            -------------------------------------
            char charValue = byteValue;
            char charValue = shortValue;
            char charValue = intValue;
            char charValue = longValue;

            char charValue = floatValue;
            char charValue = doubleValue;

            char charValue = booleanValue;
         */
        System.out.println("Cannot Convert: byte, short, int, long, float, double, boolean (to) char[  ]");
        return charValue;
    }

    private static boolean autoWideningForBooleanData() {
        System.out.println("\n---- !Conversion to boolean ----");
        /*
            Cannot Convert: char to other primitives
            -------------------------------------
            boolean booleanValue = byteValue;
            boolean booleanValue = shortValue;
            boolean booleanValue = intValue;
            boolean booleanValue = longValue;

            boolean booleanValue = floatValue;
            boolean booleanValue = doubleValue;

            boolean booleanValue = charValue;
         */
        System.out.println("Cannot Convert: byte, short, int, long, float, double, char (to) boolean[  ]");
        return booleanValue;
    }

    private static void explicitNarrowingForCharData() {
        System.out.println("\n---- !Conversion from char ----");
        /*
            Cannot Convert: char to other primitives
            -------------------------------------
            byte byteValue = charValue;
            short shortValue = charValue;

            boolean booleanValue = charValue;
         */
        int intValue = charValue;
        long longValue = charValue;

        float floatValue = charValue;
        double doubleValue = charValue;
        System.out.println("Cannot Convert: char[  ] (to) byte, short, boolean");
        System.out.println("but Can Convert: char[" + charValue + "] >>> converted >>>  int[" + intValue + "]");
        System.out.println("but Can Convert: char[" + charValue + "] >>> converted >>>  long[" + longValue + "]");
        System.out.println("but Can Convert: char[" + charValue + "] >>> converted >>>  float[" + floatValue + "]");
        System.out.println("but Can Convert: char[" + charValue + "] >>> converted >>>  double[" + doubleValue + "]");
    }

    private static void explicitNarrowingForBooleanData() {
        System.out.println("\n---- !Conversion from boolean ----");
        /*
            Cannot Convert: boolean to other primitives
            -------------------------------------
            byte byteValue = booleanValue;
            short shortValue = booleanValue;
            int intValue = booleanValue;
            long longValue = booleanValue;

            float floatValue = booleanValue;
            double doubleValue = booleanValue;

            char charValue = booleanValue;
         */

        System.out.println("Cannot Convert: boolean[  ] (to) byte, short, int, long, float, double, char");
    }
}
