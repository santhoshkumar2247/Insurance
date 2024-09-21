package com.typecasting;

public class Child_Class extends Parent_Class {
 
	public void method3() {
		System.out.println("This is method3 from child class");
	}
	
	public static void main(String[] args) {
		Child_Class cs = new Child_Class();
		cs.method3();
		
		Parent_Class ps = new Child_Class(); //upcasting
		ps.method();
		ps.method2();
		
		//Child_Class cs1 = (Child_Class) new Parent_Class();
	//	cs1.method3();
	}

}
