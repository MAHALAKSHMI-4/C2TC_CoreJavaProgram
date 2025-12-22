package com.basic;

public class Comparisonequaltooperator {
	
	public static void main (String[]args) {
		String f1 = "Cat";
		String f2 ="Cat";
		System.out.println(f1==f2);// here cat value is stored in container and f1 and f2 points towards single Cat(string) 2 strings are not created. Cat's address is given to f1 and f2 ,thus they have same address and equal is shown
		
		String f3 = new String("Apple");
		String f4 = new String("Apple");
		
		System.out.println(f3.equals(f4));//here Apple string is stored in a container and another new String is stored in container . thus f3 and f4 will have different address, using == we can find the equaltity , thus we use  obj1.equals(obj2)	}
		System.out.println(f3==f4);//throws false
}
}
//output
//t rue
//true
//false