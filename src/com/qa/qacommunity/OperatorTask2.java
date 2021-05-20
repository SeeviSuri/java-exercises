package com.qa.qacommunity;

public class OperatorTask2 {

	public static double percentage;
	
	public static void main(String[] args) {
		addition( 100, 120, 145);
		double Biology = 100;
		double Chemistry = 120;
		double Physics = 145;
		double result = Biology + Chemistry + Physics;
		double Overallpercentage = result / 450;
	    Percent(Overallpercentage, Biology, Chemistry, Physics);
	    percentage = (((Biology + Chemistry + Physics) * 100) / 450);
	    
	}



	public static void addition(double num1, double num2, double num3) {
		double result = num1 + num2 + num3;
		System.out.println("Biology mark is " + num1 + " out of 150. ");
		System.out.println("Chemistry mark is " + num2 + " out of 150. ");
		System.out.println("Physics mark is " + num2 + " out of 150. ");
		System.out.println("Total marks for exams is " + result + " out of 450.");
	}
	
	
	public static void Percent( double Overallpercentage, double Biology, double Chemistry, double Physics) {
		
		
		if (((Biology * 100) / 150) > 60) {
			System.out.println("Your Biology grade is " + Biology + ". Your Biology percentage is " + ((Biology * 100) / 150) + "%." );
		} else {
			System.out.println("You have failed Biology."); 
	} 
		if (((Chemistry * 100) / 150) > 60) {
			System.out.println("Your Chemistry grade is " + Chemistry + ". Your Chemistry percentage is " + ((Chemistry * 100) / 150) + "%.");
		} else { 
			System.out.println("You have failed Chemistry.");
		}
		
		if (((Physics * 100) / 150) > 60) {
			System.out.println("Your Physics grade is " + Physics + ". Your Physics percentage is " + ((Physics *100) / 150) + "%.");
		} else {
			System.out.println("You have failed Physics.");
		}
		
		
		if ( percentage > 60 && ((Biology * 100) / 150) > 60 && ((Chemistry * 100) / 150 ) > 60 
				 && ((Physics * 100) / 150) > 60) {
			System.out.println("Your percentage is: " + percentage + "%. Well Done, You Passed! ");
			
		}  else {
			if (((Biology * 100) / 150) > 60 && ((Chemistry * 100) / 150) >60 && ((Physics * 100) / 150) < 60) {
				System.out.println("You have failed Physics.");
				
			} else if (((Biology * 100) / 150) > 60 && ((Physics * 100) / 150) >60 && ((Chemistry * 100) / 150) < 60 ) {
				System.out.println("You have failed Chemistry.");
				
			} else if (((Physics * 100) / 150) > 60 && ((Chemistry * 100) / 150) >60 && ((Biology * 100) / 150) < 60) {
				System.out.println("You have failed Biology.");
			}
		}
			 
		}
	}
	    


 