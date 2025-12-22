package com.basic;
//print the number which are divisible by both 3 and 5 in the range 1 to 100
public class P12divisibleandrangeusingforloop {
	public static void main(String[]args) {
		System.out.println("The numbers which are divisible by 3 and 5 are:");
		for(int i=1;i<=100;i=i+1) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
				
			}
		}
	}

}
//output
//The numbers which are divisible by 3 and 5 are:
//15
//30
//45
//60
//75
//90