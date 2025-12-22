package com.tnsif.interfaces;

interface Fruits{
	
 void sweet() ; //declaring
	
}
public class Interface implements Fruits {

	public void sweet() {
		System.out.println("The fruits are sweet!!!"); //implementation
	}
	
	public static void main(String[] args) {
		
		Interface fruit = new Interface();
		fruit.sweet();

	}

}
