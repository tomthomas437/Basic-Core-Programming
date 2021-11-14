package com.CoreProgramming;
import java.util.Scanner;

public class LeapYear {
	   public static void main(String[] args){
	      int year;
	      System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();
	      
	      if (year < 1000 || year > 9999) {
				System.out.println(" Please enter a year of four digits");
				sc.close();
				return;
			}

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   }
	}
