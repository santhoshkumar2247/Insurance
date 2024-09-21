package com.sbi;

public class LoopingStatements {

	public static void main(String[] args) {
		// outer loop
		for (int i = 1; i <= 5; i++) {
		 System.out.println(i);

		  // inner loop
		  for(int j = 1; j <=2; j++) {
		   System.out.println(j);
		  }
		  System.out.println(" ");
		}
		
	    int marks=65;  
	      
	    if(marks<50){  
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60){  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80){  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90){  
	        System.out.println("A grade");  
	    }else if(marks>=90 && marks<100){  
	        System.out.println("A+ grade");  
	    }else{  
	        System.out.println("Invalid!");  
	    } 

		
           int i =55;
           while (i>50) {
        	   System.out.println(i);
        	   i--;
        	   System.out.println(i);
           }
//	    for (int i = 0; i < 4; i++ )
//	    {
//	      for (int j = 0 ; j < 4; j++ )
//	      {
//	        if (i == 0 || i == 4 - 1 || j == 0 || j == 4 - 1)
//	        {
//	          //System.out.print("*"+" ");
//	        }
//	        else {
//	        //  System.out.print(" "+ " ");
//	        }
//	      }
//	      //System.out.println();
//	    }
		
	}

}
