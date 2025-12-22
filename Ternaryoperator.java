package com.basic;
//variable=(condition)? "value if true":"value if false"

public class Ternaryoperator {
	public static void main(String[]args) {
		String result1 = false?"yes":"no";
		System.out.println(result1);
		String result2 = true?"yes":"no";
		System.out.println(result2);
		boolean rain = true;
		String result3 =rain?"Take an umbrella":"Enjoy the sunlight";
		System.out.println(result3);
	}

}
