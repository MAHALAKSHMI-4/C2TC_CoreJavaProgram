package com.tnsif.interfaces;

public class Greeting {

    public static void main(String[] args) {

        Greet gd = () -> {
            System.out.println("Hi All! Welcome to the Java Session");
        };

        gd.greet();
    }
}
