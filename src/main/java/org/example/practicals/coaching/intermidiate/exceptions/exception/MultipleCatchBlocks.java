package org.example.practicals.coaching.intermidiate.exceptions.exception;

public class MultipleCatchBlocks {

    /*
    // Once the Top Hierarchy in Exception is called Child Classes cannot be called or mentioned later
    try{

    }catch (Exception e) {                        // All Exceptions will be handled here
        System.out.println("Catch 3 Block");
    } catch (ArithmeticException e) {             // Unreachable Code/Exception
        System.out.println("Catch 1 Block");
    } catch (NullPointerException e) {            // Unreachable Code/Exception
        System.out.println("Catch 2 Block");
    }

    // Only try block cannot be written - Either catch or finally block must be present
        try{

        }
     //
    */
    public static void main(String[] args) {

        // INTERVIEW QUESTION
        try {
            System.out.println("Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Catch 1 Block");
        } catch (NullPointerException e) {
            System.out.println("Catch 2 Block");
        } catch (Exception e) {
            System.out.println("Catch 3 Block");
        }


    }
}
