package com.sbi;

public class Variables_Demo {
	static int i = 10;
	static final int j = 20;
	
	public void method() {
		i = 30;
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		Variables_Demo vd = new Variables_Demo();
		vd.method();
	}

}
