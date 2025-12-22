package com.basic;

public class Array {
	public static void main(String[]args) {
		String[] playlist = new String[3]; //datatype array name = new arrayname[size];
		playlist[0]="Song1";//index starts from 0
		playlist[1]="Song2";//store value at index 1
		System.out.println(playlist[0]);
		System.out.println(playlist[1]);
		System.out.println(playlist[2]);//value not stored at 2nd index
		System.out.println();
		//or
		System.out.println("Printing values without using new. Used flower brackets to store value in arrat");
		String[] name = {"Sneha","Maha","Yalini"};
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
	}

}
//output
//Song1
//Song2
//null
