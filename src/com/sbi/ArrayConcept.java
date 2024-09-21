package com.sbi;

import java.util.Scanner;

public class ArrayConcept {
	
	public void nonLiteralFloat() {
		float[] arr = new float[5];
		arr[0]= (float) 10.5;
		arr[1]= (float) 15.5;
		arr[2]= (float) 20.5;
		arr[3] = (float) 25.5;
		arr[4] = (float) 30.5;
		
		for(float a: arr) {
			System.out.println(a);
		}
	}
	
	public void literalDouble() {
		double[] arr = {10.55,15.55,20.55,25.55,30.55};
		
		for(double a: arr) {
			System.out.println(a);
		}
	}
	
	
	
	public void literalArray() {
		int[][]  a= {{10,20,30},
						{50,20,60},
						{80,30,70}};
		
		for(int i = 0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
	void scannerNonLiteral() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the columns");
		int cols = sc.nextInt();
		int [][] arr = new int[rows][cols];
		
		System.out.println("Enter the values");
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int a []: arr) {
			for(int b :a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
   
	void scannerArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int len = sc.nextInt();
		int [] arr = new int[len];
		
		for (int i=0; i<len; i++) {
			System.out.println("Enter the value " + i);
			arr[i]=sc.nextInt();
		}		
		for (int a:arr) {
			System.out.println(a);
		}
	}	
	public static void main(String[] args) {
		ArrayConcept ac = new ArrayConcept();
		//ac.nonLiteralFloat();
		//ac.literalDouble();
		ac.literalArray();
		//ac.scannerArray();
	    // ac.scannerNonLiteral();
	}

}
