package com.CoreProgramming;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
	System.out.println("Please enter the number");
		int num = scan.nextInt();
		
	if ( num % 2 == 0)
	 System.out.println("Given number is prime"); 
	
	else  
		 System.out.println("Given number is Odd");
	}		 	
}


