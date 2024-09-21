package com.sbi;

public class Method_Overloading {
	
	public void method() {
		System.out.println("This is method overloading");
	}
	
	public int method(int a, int b) {
		return a+b;
	}

	public float method(float a, float b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Method_Overloading mo = new Method_Overloading();
		mo.method();
		int a = mo.method(20, 10);
		float b = mo.method(2.0f, 10.5f);
		System.out.println(a);
		System.out.println(b);
	}

}
