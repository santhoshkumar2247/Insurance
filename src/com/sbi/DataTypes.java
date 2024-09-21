package com.sbi;

public class DataTypes {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bn;
	
	public void method() {
		System.out.println("byte "+b);
		System.out.println("short "+s);
		System.out.println("int "+i);
		System.out.println("long "+l);
		System.out.println("float "+f);
		System.out.println("double "+d);
		System.out.println("char "+c);
		System.out.println("boolean "+bn);
	}
	
	public void datatypes() {
		byte a = 100;
		short b = a;
		System.out.println(b);
		
		int c = 50;
		byte d = (byte) c;
		System.out.println(d);
		
		double f = 12.5;
		float t = (float) f;
		System.out.println(t);
		
		float g = 140;
		double j = g;
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		DataTypes dt = new DataTypes();
		//dt.method();
		  dt.datatypes();
	}

}
