package com.basic;
//we must declare all the variable types.helps to catch the error
//primitive data types are:
//byte,short,int,float,long,double,boolean,char
public class Datatype {
	public static void main(String[]args){
		byte a = 127;//cant store 128 and more
		short b = 3276;
		int c = 13875343;
		long d =847334238;
		float e =3.8745757f;//can take up to 6 or 7 decimals
		double f = 348.836483;//after decimal 15 digits can be used
		char g = 'a';//char should be within single quotes
		String h ="Game";//enclosed within double quotes. it is collection of characters
		boolean i = true;
		boolean j = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(h.charAt(3));//index starts from 0
		System.out.println(i);
		System.out.println(j);
		
	}

}

