package org.example.practicals.coaching.intermidiate.casting.primitive;

/*
    Only on Primitive level
    1. byte, short, int, long
    2. float, double
    3. char, boolean
 */
public class ExplicitNarrowing {
    static byte byteValue = 1;
    static short shortValue = 1;
    static int intValue = 1;
    static long longValue = 1l;

    static float floatValue = 1.0f;
    static double doubleValue = 1.0d;

    static char charValue = 'a';
    static boolean booleanValue = true;

    public static void main(String[] args) {
        explicitNarrowingForLongData();
        explicitNarrowingForDoubleData();
    }

    public static int explicitNarrowingForLongData() {
        long longValue = 20;
        int intValue = (int) longValue;
        System.out.println(intValue);
        return intValue;
    }

    /* Important Note: Decimal Value will be ignored while conversion */
    public static int explicitNarrowingForDoubleData() {
        double doubleValue = 20.1234;
        int intValue = (int) doubleValue;
        System.out.println(intValue);
        return intValue;
    }


}
