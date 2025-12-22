package com.tnsif.inheritence;
//one parent → one child
class Parent{
	void show() {
		System.out.println("This is parent");
	}
}

class Child extends Parent{
	void display() {
		System.out.println("This is child");
	}
}

public class Single {
	public static void main (String[]args) {
		Child c = new Child();
		c.display();
		c.show();
		
	}

}
