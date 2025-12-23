package com.tnsif.polymorphisim;



public class Methodoverloading {
	int addition(int a, int b) {
		return a + b ;
	}
	float addition(float c, float d) {
		return c + d; 
	}
	public static void main(String[] args) {
		Methodoverloading mo = new Methodoverloading();
		//mo.addition(0, 0); or 
		System.out.println("Addition: " +mo.addition(5, 10));
		//mo.float(10.1,3.1); or
		System.out.println("Addition: " +mo.addition(0, 0));
		
		
	}

}
