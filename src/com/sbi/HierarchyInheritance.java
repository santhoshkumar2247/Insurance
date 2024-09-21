package com.sbi;	
	class parent{
		int a;
		void display() {
			System.out.println(a);
		}
	}

	class child1 extends parent{
		int b;
		void print() {
			System.out.println(b);
		}
	}
	
	class child2 extends parent{
		int c;
		void show() {
			System.out.println(c);
		}
	}

public class HierarchyInheritance {
	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.a = 100;
		c1.b =200;
		c1.display();
		c1.print();
		
		child2 c2 = new child2();
		c2.a = 400;
		c2.c = 300;
		c2.display();
		c2.show();

	}

}
