package com.basic;
//generate random number and stop the program if the random number is 3
import java.util.Random;
public class P19randomnumberwithwhile {
	public static void main(String[]args) {
		Random rand = new Random();
		int num =0;
		
		while(num!=3) {
		num = rand.nextInt(10);//numbers from 0 to 10 will be generated randomly
		System.out.println(num);
		}
	}

}
