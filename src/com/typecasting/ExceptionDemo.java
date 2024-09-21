package com.typecasting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public void method() throws FileNotFoundException {
	  File file = new File("EMPdata");
	  FileInputStream fis = new FileInputStream(file);
	}
	
	public void method2() throws InterruptedException {
		System.out.println(1);
		System.out.println(5+10);
		Thread.sleep(5000);
		System.out.println(500);
	}
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		ExceptionDemo obj = new ExceptionDemo();
		obj.method();
		obj.method2();
	}

}
