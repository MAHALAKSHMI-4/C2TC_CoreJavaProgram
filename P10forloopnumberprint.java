package com.basic;
//get input from user and print the numbers
import java.util.Scanner;
public class P10forloopnumberprint {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int a = sc.nextInt();
		System.out.println("Enter the starting number:");
		int b = sc.nextInt();
		
		for (int i=a; i<=b; i=i+1) {
			System.out.println(i);
			
		}
		
	}

}
//output
//Enter the starting number:
//89
//Enter the starting number:
//99
//89
//90
//91
//92
//93
//94
//95
//96
//97
//98
//99

