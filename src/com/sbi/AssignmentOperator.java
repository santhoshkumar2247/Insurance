package com.sbi;

public class AssignmentOperator {
	public static void main(String[] args) {
		AssignmentOperator obj = new AssignmentOperator();
		obj.assignment();
		obj.relational();
		}
	
	public void assignment() {
		int a = 10;
		int b = 20;
		int c;
		c = a+b;
		System.out.println(c);
		c+=a; // c = c+a
		System.out.println(c);
		c-=a; // c = c-a
		System.out.println(c);
		c*=a; // c = c*a
		System.out.println(c);
		c/=a; //c = c/a
		System.out.println(c);
		c%=a; //c = c%a
		System.out.println(c);
	}
	
	public void relational() {
		int a=1,b=2;
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}

}
