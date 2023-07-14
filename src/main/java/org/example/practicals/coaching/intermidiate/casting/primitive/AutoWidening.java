package org.example.practicals.coaching.intermidiate.casting.primitive;

/*
    Only on Primitive level
    1. byte, short, int, long
    2. float, double
    3. char, boolean
 */
public class AutoWidening {
    static byte byteValue = 1;
    static short shortValue = 1;
    static int intValue = 1;
    static long longValue = 1l;

    static float floatValue = 1.0f;
    static double doubleValue = 1.0d;

    static char charValue = 'a';
    static boolean booleanValue = true;

    public static void main(String[] args) {
        System.out.println(" ---- AutoWidening Process ---- ");
        /*  -- AutoWidening Process --
            input = Smaller primitive value, Output = Higher primitive value
        */
        shortValue = autoWideningForByteData(byteValue);
        intValue = autoWideningForShortData(shortValue);
        longValue = autoWideningForIntData(intValue);


        floatValue = autoWideningForFloatData(longValue);
        doubleValue = autoWideningForDoubleData(floatValue);

        doubleValue = autoWideningForDoubleData(longValue);
        autoWidening_Converting_ToPrimitiveData();
    }

    private static short autoWideningForByteData(byte byteValue) {
        // Converting: byte to short
        short shortValue = byteValue;
        System.out.println("Converting: byte[" + byteValue + "] >>> upgraded >>>  short[" + shortValue + "]");
        return shortValue;
    }

    private static int autoWideningForShortData(short shortValue) {
        // Converting: short to int
        int intValue = shortValue;
        System.out.println("Converting: short[" + shortValue + "] >>> upgraded >>>  int[" + intValue + "]");
        return intValue;
    }

    public static long autoWideningForIntData(int intValue) {
        // Converting: int to long
        long longValue = intValue;
        System.out.println("Converting: int[" + intValue + "] >>> upgraded >>>  long[" + longValue + "]");
        return longValue;
    }

    private static void autoWidening_Converting_ToPrimitiveData() {
        System.out.println("\n---- Edge Cases ----");
        float floatValue;
        double doubleValue;
        // Converting: byte to float
        floatValue = byteValue;
        System.out.println("Converting: byte[" + byteValue + "] > converted > float[" + floatValue + "]"); // 1.0 or 1.0f

        // Converting: byte to double
        doubleValue = byteValue;
        System.out.println("Converting: byte[" + byteValue + "] > converted > double[" + doubleValue + "]"); // 1.0 or 1.0d

        // Converting: short to float
        floatValue = shortValue;
        System.out.println("Converting: short[" + shortValue + "] > converted > float[" + floatValue + "]"); // 1.0 or 1.0f

        // Converting: short to double
        doubleValue = shortValue;
        System.out.println("Converting: short[" + shortValue + "] > converted > double[" + doubleValue + "]"); // 1.0 or 1.0d

        // Converting: int to float
        floatValue = intValue;
        System.out.println("Converting: int[" + intValue + "] > converted > float[" + floatValue + "]"); // 1.0 or 1.0f

        // Converting: int to double
        doubleValue = intValue;
        System.out.println("Converting: int[" + intValue + "] > converted > double[" + doubleValue + "]"); // 1.0 or 1.0d


        // Converting: long to float
        floatValue = longValue;
        System.out.println("Converting: long[" + longValue + "] > converted > float[" + floatValue + "]"); // 1.0 or 1.0f

        // Converting: long to double
        doubleValue = longValue;
        System.out.println("Converting: long[" + longValue + "] > converted > double[" + doubleValue + "]"); // 1.0 or 1.0d
    }

    private static float autoWideningForFloatData(long longValue) {
        // Converting: long to float
        float floatValue = longValue;
        System.out.println("Converting: long[" + longValue + "] >>> upgraded >>>  float[" + floatValue + "]");
        return floatValue;
    }

    private static double autoWideningForDoubleData(float floatValue) {
        // Converting: float to double
        double doubleValue = floatValue;
        System.out.println("Converting: float[" + floatValue + "] >>> upgraded >>>  double[" + doubleValue + "]");
        return doubleValue;
    }

    private static double autoWideningForDoubleData(long longValue) {
        // Converting: long to double
        double doubleValue = longValue;
        System.out.println("Converting: long[" + longValue + "] >>> upgraded >>>  double[" + doubleValue + "]");
        return doubleValue;
    }


}
