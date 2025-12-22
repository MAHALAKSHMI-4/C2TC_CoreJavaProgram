package com.basic;
//get the input for 3 variables:a,b,c.
//now multiply all the variables and store it in d. 
//now add all the variables and store it in e
//now divide d by e
import java.util.Scanner;
class P1 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = a*b*c;
	int e = a+b+c+d;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(d/e);
}
}
