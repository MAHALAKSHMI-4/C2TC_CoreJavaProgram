package com.tnsif.encapsulation;


//Encapsulation is the process of wrapping data (variables) and methods into a single unit (class)
//and protecting data by making variables private and accessing them using public methods (getters & setters)

public class Encapsulation {
	private int id;
	private String str;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public static void main (String[] args) {
		Encapsulation es = new Encapsulation();
		es.setId(10);
		es.setAge(21);
		es.setStr("Maha");
		
		System.out.println("Id:"+es.getId());
		System.out.println("Age:"+es.getAge());
		System.out.println("Name:"+es.getStr());
		
		
	}
	

}
