package com.sbi;

import java.util.Scanner;

public class Scanner_Method {
	
	public void addition() {
		int x,y;		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		x = s.nextInt();
		y= s.nextInt();
		System.out.println("The value of two number is : " +(x+y));
	}
	
	public void test(int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);
		int quotient = num1/num2;
		System.out.println("The quotient is "+ quotient);
		int remainder = num1%num2;
		System.out.println("The remainder is " + remainder);
	}
	
	public void stringMethod() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = s.nextLine();
		System.out.println("My Name is : " + name);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter the number2");
        Scanner_Method obj = new Scanner_Method();
        obj.test(num1, num2);
		//obj.stringMethod();	
		//obj.addition();	
		
	}

}
