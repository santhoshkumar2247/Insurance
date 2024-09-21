package com.sbi;

class A{
	int a;
	void display() {
		System.out.println(a);
	}
}

class B extends A{
	int b;
	void print() {
		System.out.println(b);
	}
}


public class InheritanceTypes {

	public static void main(String[] args) {
		B s = new B();
		s.a = 100;
		s.b =200;
		s.display();
		s.print();
			
	}

}
