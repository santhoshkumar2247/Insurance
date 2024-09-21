package com.sbi;


	
	class Cycle{
		 void displayFeatures() {
		        System.out.println("This is class Cycle");
		    }
	}

	class Bike extends Cycle{
		void displayFeatures() {
	        super.displayFeatures(); 
	        System.out.println("This is class Bike");
	    }
	}
	
	class Car extends Bike{
		void displayFeatures() {
	        super.displayFeatures(); 
	        System.out.println("This is class Car");
	    }
	}
	
	public class Multilevel_Inheritance {		
		public static void main(String[] args) {
			Car cr = new Car();
			cr.displayFeatures();
	}
}
