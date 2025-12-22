package com.tnsif.inheritence;

class Grandparent{
	void gp(){
		System.out.println("GrandParents");
		
	}
}

class Parent1 extends Grandparent{
	void p() {
		System.out.println("Parents");
	}
}

class Child1 extends Parent1{
	void c() {
		System.out.println("Child");
	}
}


public class Multilevel {
	public static void main (String[]args) {
		
		Child1 ch = new Child1();
		ch.c();
		ch.p();
		ch.gp();
		
		Parent1 pt = new Parent1();
		pt.p();
		pt.gp();
		
		
	}

}

//Child
//Parents
//GrandParents
//Parents
//GrandParents

