package com.tnsif.nonaccessmodifiers;

public class Final {
	final int x=200;
	void print() {
		System.out.println("X is :"+x);
	}
	public static void main(String[]args) {
		Final f = new Final();
		f.print();
		//f.x =300; cannot change the value as the final keyword is used
		f.print();
	}
	

}
