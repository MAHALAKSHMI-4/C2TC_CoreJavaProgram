package com.Accessmodifiers;

public class Test1 {
	
	public static void main (String[]args) {
		Accessmodifiers amd = new Accessmodifiers();
		System.out.println("Public variable: "+amd.var2);
		System.out.println("Protected variable: "+amd.var3);
		System.out.println("Default variable: "+amd.var4);
		//System.out.println("Private variable: "+amd.var2);private is not possible to access in other class
		
	}

}
