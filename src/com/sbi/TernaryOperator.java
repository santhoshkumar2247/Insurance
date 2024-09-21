package com.sbi;

public class TernaryOperator {

	public static void main(String[] args) {
		int i = 20, j=50, max;		
		max = (i>j) ? i : j;		
		System.out.println("Maximum is = " + max);
		
		String s =(i>j) ? "True" : "False";
		System.out.println(s);
	}

}
