package com.sbi;

public class Method_Overriding extends Method_Overloading {
	
	public void method() {
		System.out.println("This is method overriding");
	}
	
	public int method(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		Method_Overriding mr = new Method_Overriding();
		mr.method();
		int a= mr.method(20, 10);
		System.out.println(a);

	}

}
