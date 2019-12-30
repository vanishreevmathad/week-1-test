package com.deloitte;

public class Exceptionalhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=5,b=0;
     try {
     double x=a/b;
     System.out.println("Result = "+x);
     
	}
     catch (ArithmeticException ex) {
    	 System.out.println("Value of b shouldn't be zero");
    	 
     }
     System.out.println("Execution Done....");
  
   }
}