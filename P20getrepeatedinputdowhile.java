package com.basic;
import java.lang.System;
import java.util.Scanner;
//wajp to print the statement again until the user enters a correct input
public class P20getrepeatedinputdowhile {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		
		do {
			System.out.println("Enter a number <= 10 :");
			a = sc.nextInt();
		}while(a>10);
		
	}

}

//output
/*
 * Enter a number <= 10 : 275 
 * Enter a number <= 10 : 23 
 * Enter a number <= 10 : 1
 */