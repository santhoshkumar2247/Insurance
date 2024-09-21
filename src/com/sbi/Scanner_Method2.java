package com.sbi;

import java.util.Scanner;

public class Scanner_Method2 {
	
	public int method1(int num1, int num2) {
		int num3 = num1/num2;
		return num3;
		
	}
	
	public int method2(int num1, int num2) {
		int num3 = num1%num2;
		return num3;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1 = sc.nextInt();
		System.out.println("Enter the number2");
		int num2 = sc.nextInt();
		
		Scanner_Method2 obj = new Scanner_Method2();
		int num4 = obj.method1(num1,num2);
		int num5 = obj.method2(num1,num2);
		System.out.println("The quotient is "+num4);
		System.out.println("The remainder is "+num5);

	}

}
