package com.basic;
//create an integer array,get input for 5 numbers 
//and print their sum or total
import java.util.Scanner;
public class P13addnumbersinarray {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//get the input value
		int value1= sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		int value4 = sc.nextInt();
		int value5 = sc.nextInt();
		//create an array
		int[] array = new int[5];
		array[0] = value1;
		array[1] = value2;
		array[2] = value3;
		array[3] = value4;
		array[4] = value5;
		//add the values in the array
		
		//or use
		//array[0]=sc.nextInt();
		//array[1]=sc.nextInt();....
		System.out.println(array[0]+array[1]+array[2]+array[3]+array[4]);
	}

}
