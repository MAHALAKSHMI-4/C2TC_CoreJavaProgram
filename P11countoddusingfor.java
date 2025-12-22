package com.basic;

public class P11countoddusingfor {
	public static void main (String[]args) {
		int count=0;
		for(int i=0 ; i<=10;i=i+1) {
			if(i%2!=0) {
				count = count+1;
			}
		}
		System.out.println(count);
	}

}
