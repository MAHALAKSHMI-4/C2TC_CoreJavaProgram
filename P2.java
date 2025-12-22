package com.basic;
//get input for 3 vaariables name,score,department.
//let the user enter the score for 100 marks
//conver it for 10 and print it
import java.util.Scanner;

public class P2 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		float score = sc.nextInt();
		float s = score/10;
		sc.nextLine();
		String subject = sc.nextLine();
		System.out.println("My name is "+name);
		System.out.println("My score is "+s+"/10");
		System.out.println("My department is "+subject);
		}

}

//Output

//My name is Mahalakshmi
//My score is 9.9/10
//My department is Computer Science
