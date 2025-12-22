package com.abstraction;
//Abstraction = Hide first, show later through child class

abstract class Engine{
	abstract void display();
}

class Vehicle extends Engine{
	void display() {
		System.out.print("An engine converts fuel into mechanical energy through various processes, enabling motion in vehicles and machinery");
	}
}

public class Abstract {
	public static void main(String[]args) {
		Vehicle v = new Vehicle();
		v.display();
	}

}
//Stage  			     What happens
//Abstract class	🔒 Working is hidden
//Child class		🔓 Working is shown