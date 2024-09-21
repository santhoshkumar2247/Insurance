package com.sbi;

public class LogIn {
	public static void main(String[] args)	
	{
		LogIn obj = new LogIn();
		
		obj.multiplication();
		obj.division();
		obj.modulus();
	}
	
	public void multiplication() {
		int a=10;
		int b=5;
		int c=a*b;
		System.out.println(c);
	}
	
	public void division() {
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}
	
	public void modulus() {
		int a=10;
		int b=5;
		int c=a%b;
		System.out.println(c);
	}

}
