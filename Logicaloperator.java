package com.basic;

//get input for a number and check whether it is divisible by both 3 and 5 or not . if yes then print the number is divisible by 3 and 5 print the number is not divisible by 3 and 5.
//logical operator && (and operator) || (or operator)
public class Logicaloperator {
	public static void main(String[]args) {
		boolean cricket =false;
		boolean football = false;
		//true or true = true
		//true or false = true
		//false or true = true
		//false or false = false
		//true && true = true
		// true && false = false
		// false && false = false
		
		if(cricket || football) {
			System.out.println("Play");
		}
		else {
			System.out.println("Dont play");
		}
	}

}
//output
//Dont play
