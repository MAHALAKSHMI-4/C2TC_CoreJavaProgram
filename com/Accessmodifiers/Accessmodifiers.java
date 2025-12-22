package com.Accessmodifiers;

public class Accessmodifiers {
	private int var1= 10;
	public int var2 = 20;
	protected int var3 = 30;
	int var4 = 40;
	
	public void show() {
		System.out.println("Privatevar : " +var1);
		System.out.println("Publicvar : "+var2);
		System.out.println("Protectedvar : "+var3);
		System.out.println("Defaultvar : "+var4);
	}
	
	public static void main (String[]args) {
		Accessmodifiers amd = new Accessmodifiers();
		amd.show();
		
	}

}
