package org.example.practicals.coaching.intermidiate.exceptions.exception;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println("Try Block");
        } catch (Exception e) {
            System.out.println("Catch 1 Block");
        } finally {
            System.out.println("Finally Block");
        }
    }
}
