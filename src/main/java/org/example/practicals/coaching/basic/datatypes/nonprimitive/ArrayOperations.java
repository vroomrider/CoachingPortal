package org.example.practicals.coaching.basic.datatypes.nonprimitive;

public class ArrayOperations {

    public static void arrayConcept() {
        /*
           - Array is indicated by using the Common Open and Close Brackets("[]"): String[], int[], float[] ...
           - Array contains 'collection of data' with same "Data Type"
             ex: int[] intArray = {1, 2, 3 ,4 }, float[] floatArray = {0.0f, 0.1f, 0.2f}
           - Array index starts from "0"
           - Array Size should be defined mandatorily **
           - To fetch any element from array -> we use common brackets with index value -> intArray[0]
         */

        /*
         Declaration & Definition
         Syntax: DataType[] arrayVariableName = new DataType[size]; // 1-D Array
         syntax: DataType[] arrayVariableName = new DataType[rowSize][columnSize]; // 2-D Array

         Initialisation
         Syntax: DataType[] arrayVariableName = {element1, element2, . . ., elementN};
         Syntax: DataType[][] arrayVariableName = {element1, element2, . . ., elementN};
         Syntax: arrayVariableName[indexValue 0] = element1;
                 arrayVariableName[indexValue 0] = element1;
                 arrayVariableName[indexValue 1] = element2;
                 arrayVariableName[indexValue N] = elementN;
         */
        /*
        --------------------------------------------------------------------------------
           1 - Dimensional Array
         */
        int[] intArray = new int[6];
        intArray[1] = 10;
        intArray[5] = 30;
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("intArray[" + i + "] = " + intArray[i] + ", ");
        }
        System.out.println(); // cursor will be placed into new line
        String[] stringArray = new String[6];
        stringArray[2] = "Girish";
        stringArray[stringArray.length - 1] = "Girish Naik";
        stringArray[4] = "Girish Naik T";
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray[" + i + "] = " + stringArray[i] + ", ");
        }

        /*
        --------------------------------------------------------------------------------
           2 - Dimensional Array
         */
        int[][] int2DArray = {{1, 2, 3}, {3, 4}, {5, 6, 7}};
        /*
            1 2 3
            3 4
            5 6 7
         */
        for (int i = 0; i < int2DArray.length; i++) {
            for (int j = 0; j < int2DArray[i].length; j++) {
                System.out.print("int2DArray[" + i + "," + j + "] = " + int2DArray[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
