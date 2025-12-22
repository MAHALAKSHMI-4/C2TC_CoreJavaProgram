package com.tnsif.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreader {

	public Bufferreader(InputStreamReader inputStreamReader) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {


		Bufferreader br = new Bufferreader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter Country Name: ");
		String country = br.readLine();
		
		System.out.println("Enter Country Code: ");
		int code = Integer.parseInt(br.readLine());
		
		System.out.println("The country name is: "+ country + " and the country code is: "+code);

	}

	private String readLine() {
		return null;
	}

}
