package AdvJavaExam;

import java.util.Scanner;

public class Q5_monetaryAmount {
	/*
	 * 1 dollar = 100 cents
	 * 1 quarter = 25 cents
	 * 1 dime = 10 cents
	 * 1 nickle = 5 cents
	 * 1 penny = 1 cent
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monetary amount in cents : ");
		int cents = input.nextInt();
		
		//dollar
		int dollar = cents/100;
		int remainingCents = (cents % 100);	
		System.out.println("dollar is " + dollar);
		System.out.println("Remaining cents after dollar is : " + remainingCents);
		
		//quarter
		int quarter = remainingCents/25;
		remainingCents = (remainingCents % 25);
		System.out.println("quarter is " + quarter);
		System.out.println("Remaining cents after quarter is : " + remainingCents);
		
		//dime
		int dime = remainingCents/10;
		remainingCents = (remainingCents % 10);
		System.out.println("dime is " + dime);
		System.out.println("Remaining cents after dime is : " + remainingCents);
		
		//penny
		int penny = remainingCents/1;
		remainingCents = (remainingCents % 1);
		System.out.println("penny is " + penny);
		System.out.println("Remaining cents after penny is : " + remainingCents);
		
		System.out.println("**************************************************************");
		
		//Total coins
		System.out.println("Total number of possible coins equaling the " + cents + " monetary amount is : " + (dollar+quarter+dime+penny));
	}
}
