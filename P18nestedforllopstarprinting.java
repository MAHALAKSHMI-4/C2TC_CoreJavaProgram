package com.basic;

public class P18nestedforllopstarprinting {
	public static void main(String[]args) {
		
		for(int j=1 ; j<=3; j=j+1) {
		for(int i=1 ; i<=j ; i=i+1) {
			System.out.print("*");
			
		}
		System.out.println();
		}
	}

}
//working
//1.j=1 ,1<3 then i =1 ; 1<=1 prints 1 star
//2.system.out.println upcoming star will be printed in next line
//3. j=j+1
//j=2 ; 2<3 then 
//i=i+1
//i = 2 ; 2=2 prints 2 stars
//4.system.out.println upcoming star will be printed in next line
//5.j=j+1
//j=3 ; x=3
//then i= i+1-- 2+1=3
//i=3 ; 3=3 prints 4 stars

//output
//*
//**
//***