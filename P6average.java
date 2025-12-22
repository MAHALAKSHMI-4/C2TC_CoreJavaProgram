package com.basic;
//find the average of 5 subjects and print additional class required 
//for below 35 , if average is between 35 and 50 print need practice 
//else return you r gud to go
import java.util.Scanner;
public class P6average {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		int average = (sub1+sub2+sub3+sub4+sub5)/5;
		
		System.out.println("The average mark is: "+average);
		
		if(average<35) {
			System.out.println("Additional class is required");
			
		}
		else if(average<35 && average <50){
			System.out.println("Need more practice");
		}
		else {
			System.out.println("You are good to go");
		}
		}
	

}

//output
//90
//90
//90
//90
//90
//The average mark is: 90
//You are good to go
