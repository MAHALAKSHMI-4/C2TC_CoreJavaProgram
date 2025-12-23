package com.tnsif.exceptionhandling;

public class Exceptionhandling {

    // method for int division
    static int performDivision(int a, int b) {
        return a / b;   // may throw ArithmeticException
    }

    // method for float division
    static float performDivision(float a, float b) {
        return a / b;   // no exception, returns Infinity if b = 0
    }

    public static void main(String[] args) {

        System.out.println("I am in main method");
        int result;

        try {
            result = performDivision(7, 0);
            System.out.println("Division is " + result);

        } catch (ArithmeticException e) {
            System.out.println("I am in catch block: " + e.getMessage());
        }

        System.out.println();

        result = performDivision(5, 2);
        System.out.println("Division is " + result);

        System.out.println();

        System.out.println(performDivision(15f, 2f));

        System.out.println();

        System.out.println(performDivision(7f, 0f));
    }
}
