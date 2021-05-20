package com.qa.qacommunity;

public class OperatorsTask {

	public static void main(String[] args) {
		addition( 2, 5);
        multiplication( 3, 6);
        subtraction ( 5, 8);
        division ( 180, 36);
	}
     public static void addition(int num1, int num2) {
    	 int result = num1 + num2;
 		System.out.println(result);
     }
     
     public static void multiplication(int num1, int num2) {
    	 int result = num1 * num2;
    	 System.out.println(result);
     }
     
     public static void subtraction(int num1, int num2) {
    	 int result = num1 - num2;
    	 System.out.println(result);
     }
     
     public static void division(int num1, int num2) {
    	 int result = num1 / num2;
    	 
    	 if(num1 < num2) {
    	 System.out.println(result);
    	 } else {
    		 System.out.println("This division cannot be performed.");
    	 }
    	 
    	 
    	 
     }
     
     
     
     
     
     
     
     
     
     
}
