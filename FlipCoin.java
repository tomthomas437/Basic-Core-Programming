package com.CoreProgramming;
import java.util.Scanner;

public class FlipCoin {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the total number of times the coin should be flipped. ");
		double flip = scanner.nextDouble();
		
		double heads = 0;
		double tails = 0;
		
		for(int i=0; i<flip; i++)
		{
			int coin = (int)Math.floor(Math.random()*2);
			if(coin == 1) {
				heads=heads+1;	
			}
			else
			{
				tails=tails+1;
			}
		}
		
		System.out.println("Total percentage of heads flipped is : " +Math.floor((heads/flip)*100));
		System.out.println("Total percentage of tails flipped is : " +Math.floor((tails/flip)*100));
	}
}

