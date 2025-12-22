package com.basic;
import java.util.Scanner;
//get input from user and check for condition if it is win print cup is ours
//else print better luck next time

public class p4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("win or lose? ");
		String decision = sc.nextLine();
		String CSK = decision;
		
		
		
		if(CSK.equals("win")) {
			System.out.println("Cup is ours");
			
		}
		else {
			System.out.println("Better luck next time");
		}
	}

}
