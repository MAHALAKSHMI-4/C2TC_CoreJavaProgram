package com.tnsif.inheritence;

class Game{
	void show(){
		System.out.println("Games");
		
	}
}

class Badminton extends Game{
	void b() {
		System.out.println("China is widely regarded as the global powerhouse of badminton.");
	}
	
}

class Football extends Game{
	void f() {
		System.out.println("Brazil is the country where football is played the most and loved the deepest.");
	}
}


public class hierarchial {
	public static void main(String[]args) {
		Badminton bd = new Badminton();
		Football fb = new Football();
		fb.show();
		bd.b();
		bd.show();
		fb.f();
		
		
		
	}

}
