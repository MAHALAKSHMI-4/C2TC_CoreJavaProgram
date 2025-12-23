package com.tnsif.nonaccessmodifiers;
//static can be used for class but not for object .Overloading is possible , overriding is not possible
//static block is used to share with all other classes

public class StaticExample1 {
	
	static int count;
	static int variable;//int variable= instance variable
	
	//static block
	static {
		count = 10;
		variable=10;// static should be mentioned in the class if they are used inside static block
		System.out.println("Showing the static variable count:"+count);
	}
	
	static void display() {
		System.out.println("Displaying the static method with count");
		
	}

	public static void main (String[]args) {
		
		System.out.println("printing the main method");
		
		display();//without creating object we have called a method
		
		
	}

}
