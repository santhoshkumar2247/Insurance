package com.sbi;

public class TestProject {

	public static void main(String[] args) {
		
		TestProject tp = new TestProject();
		//tp.positiveNegative();
		//tp.getDays();
		//tp.naturalNumbers();
	//	tp.loopingNumbers();
		int a[] = {10,20,30,40,50};
		
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		for (int i=a.length-1;i>=0;i--) {
			//System.out.println(a[i]);
		}

	}
	
	public void positiveNegative() {
		
		int i=10;
		
			if(i>0) {
				System.out.println(i+" is positive");
			}else {
				System.out.println(i+" is Negative");
			}
			
		
	}
	

	public void getDays() {
		int i=18;
		switch (i) {
		
		case 1:System.out.println("Monday");
		break;
		

		case 2:System.out.println("Tuesday");
		break;

		case 3:System.out.println("Wednesday");
		break;

		case 4:System.out.println("Thursday");
		break;

		case 5:System.out.println("Friday");
		break;

		case 6:System.out.println("Saturday");
		break;
		
		case 7:System.out.println("Sunday");
		break;
		
		default:System.out.println("Invalid Day");
		
		
		}
	}
	
	public void naturalNumbers() {
		int a= 8;
		for(int i=1; i<=a; i++) {
		  	
		 System.out.println(i); 	
		}
	}
	
	public void loopingNumbers() {
		int n=10;
		for(int i=n;i>0;i--)
	
		{
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
	    }
		
		 for (int i = 1; i <= 5; i++) 
		 {  
			 System.out.println(i);
		   	for(int j = 1; j <=2; j++) {
		   		System.out.println(j);
		   	}
		 }

	}

}
