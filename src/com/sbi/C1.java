package com.sbi;

public class C1 extends Abstract_Class implements I1,I2 {
	
	public void m1() {
		System.out.println("This is from Interface1 "+x);
	}
	
	public void m2() {
			System.out.println("This is from Interface2 "+y);
		}
	
	public void m3() {
		System.out.println("This is from Abstract Class "+z);
	}

	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
	}

}
