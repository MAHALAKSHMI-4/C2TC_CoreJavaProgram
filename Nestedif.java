package com.basic;

public class Nestedif {

	public static void main (String[]args) {
	boolean kfc = true;
	boolean vegburger = false;
	if(kfc){
		System.out.println("I am coming to kfc");
		if(vegburger) {
			System.out.println("I will eat veg burger");
		}
		else {
			System.out.println("I will eat frenchfries");
		}
		
	}
	else {
		System.out.println("I will not come to kfc");
	}
	}
}


//output
//I am coming to kfc
//I will eat frenchfries