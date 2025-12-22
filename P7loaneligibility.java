package com.basic;

import java.util.Scanner;
public class P7loaneligibility {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your monthly salary: ");
		int salary = sc.nextInt();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(salary>=20000 || age <=25) {
			System.out.println("Enter the loan amount required: ");
			int loanamount = sc.nextInt();
			
			if(loanamount<=50000) {
				System.out.println("You are eligible for loan");
				
			}
			else {
				System.out.println("Maximum loan amount is 50000");
			}
			
		}
		else {
			System.out.println("Not eligible");
		}
		
	
	}

}
//output
//Enter your monthly salary: 
//3000
//Enter your age: 
//21
//Enter the loan amount required: 
//45000
//You are eligible for loan
