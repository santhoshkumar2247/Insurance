package com.sbi;

public class ConditionalStatement {

	public static void main(String[] args) {
		int a = 14;
		if(a<10) {
			System.out.println(a + " is lesser than 10");
		}
		else if(a>10 && a<15) {
			System.out.println(a + " is greater than 10 and lesser than 15");
		}
		else {
			System.out.println(a + " is greater than 15");
		}
	}

}
