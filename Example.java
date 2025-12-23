package com.tnsif.exceptionhandling;

public class Example {

    static int performDivision(int x, int y) {
        System.out.println("I am in performDivision method");
        int z = x / y;
        return z;
    }

    static float performDivision(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            int result = performDivision(10, 0);
            System.out.println("Result (int): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        float fResult = performDivision(10f, 0f);
        System.out.println("Result (float): " + fResult);

        System.out.println("Program ended");
    }
}
