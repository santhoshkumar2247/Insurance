package com.sbi;

public class Static_Final_Method {
	
	String name;
	int empId;
	static String companyName = "HCL";
	
	void display() {
		System.out.println("Name: "+name +" "+"EmpId ="+empId+" "+"companyName ="+companyName);
	}

	public static void main(String[] args) {
		Static_Final_Method sm = new Static_Final_Method();
		sm.name = "Santhosh";
		sm.empId = 2247;
		sm.display();
		System.out.println(companyName);
	}

}
