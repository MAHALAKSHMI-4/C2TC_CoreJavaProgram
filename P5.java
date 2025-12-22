package com.basic;
import java.util.Scanner;
//get input for a number and check whether it is divisible by both 3 and 5 or not . if yes then print the number is divisible by 3 and 5 print the number is not divisible by 3 and 5.
//logical operator && (and operator) || (or operator) and arithmetic operator is used
public class P5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num %3==0 && num %3==0) {
			System.out.println("Number is divisible by 3 and 5");
		}
		else {
			System.out.println("Number is not divisible by 3 and 5");
		}
	}

}
