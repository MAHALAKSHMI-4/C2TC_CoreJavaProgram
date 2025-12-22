package com.basic;
//get input for size of an array
//get input for each element in an array

import java.util.Scanner;
public class P16arraybased {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the box size:");
	int size = sc.nextInt();
	
	int[] boxnumbers = new int[size];
	System.out.println("Enter the numbers that has to be store");
	
	for(int i = 1; i<size;i=i+1) {
		boxnumbers[i] = sc.nextInt();
		
	}
	
	}
	

}
