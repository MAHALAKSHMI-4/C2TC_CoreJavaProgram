package com.basic;

public class Dowhile {
	public static void main(String[]args) {
		int a=0;
		do {
			System.out.println("bat");
			a = a+1;
		}while(a<=2);
	}

}

//working
//initially the a value will be 0
//bat will be printed once 
//then a = a+1
//then while condition will be checked 
//now a =1 .... where 1<2
//again bat will be printed
//a = 1+1
//while condition will be checked
//2=2
//again bat will be printed
//a= 2+1
//while condition will be checked again 3!<=2 thus loop breaks

//output
/*
 * bat 
 * bat 
 * bat
 */