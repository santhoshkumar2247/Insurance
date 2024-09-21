package com.sbi;

public class Constructor_Method {
	
	Constructor_Method(){
		this("Santhosh", 3);
		System.out.println("This is default constructor");
	}
	
	Constructor_Method(String name, int a){
		System.out.println("The name is "+name +" and age is "+a);
	}
  
	public void method1() {
		System.out.println("This is method1");
	}
	
	public void method2() {
		method1();
	}
	
	public static void main(String[] args) {
		Constructor_Method cm = new Constructor_Method();
		cm.method2();
		Constructor_Method cm2 =new Constructor_Method("Sandy",20);
	}

}
