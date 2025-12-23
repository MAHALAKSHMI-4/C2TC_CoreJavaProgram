package com.tnsif.exceptionhandling;

public class Withoutcatch {
		public static void main(String[] args) {
			System.out.println("the program continues....");
			int data=100/0;
			System.out.println("the program continues....");
		}
		
	}

//error
//the program continues....
//Exception in thread "main" java.lang.ArithmeticException: / by zero
	//at com.tnsif.exceptionhandling.Withoutcatch.main(Withoutcatch.java:6)