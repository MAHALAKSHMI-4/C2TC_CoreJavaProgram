package com.basic;
//System class sends input from code to terminal
import java.lang.System;
//Scanner class is used to get input from the terminal and stores in the system
import java.util.Scanner;

class Input {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		// getting input as integer
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println(a);
		
		//getting input as string
		
		System.out.println("Enter a string :");
		String b = s1.nextLine();
		System.out.println(b);
		
		
	}

}
