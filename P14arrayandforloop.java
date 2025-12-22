package com.basic;
//get input using array and forloop
import java.util.Scanner;
public class P14arrayandforloop {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		//numbers[0]=sc.nextInt();
		//numbers[1]=sc.nextInt();
		//numbers[2]=sc.nextInt();
		//numbers[3]=sc.nextInt();
		//numbers[4]=sc.nextInt();
		//here only numbers are changing thus story using forloop
		for(int i=0;i<=4;i=i+1) {
			numbers[i]=sc.nextInt();
			
		}
		//System.out.println(numbers[0]);
		//System.out.println(numbers[1]);
		//System.out.println(numbers[2]);
		//System.out.println(numbers[3]);
		//System.out.println(numbers[4]);
		
		//instead of writting S.O.P 5 times simply use for loop
		for(int i=1;i<=4;i=i+1) {
			System.out.println(numbers[i]);
		}
			
		
	}

}
