package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise006 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int numberA = scan.nextInt();
		
		System.out.print("Another number: ");
		int numberB = scan.nextInt();
		
		System.out.print("One more number: ");
		int numberC = scan.nextInt();
		
		int biggerNumber = numberA;
		
		// Math.max(Math.max(numberA, numberB), numberC);
		if (numberB > biggerNumber) {
			biggerNumber = numberB;
		} 

		if (numberC > biggerNumber) {
			biggerNumber = numberC;
		}
		
		System.out.print("The bigger number is " + biggerNumber + ".");
		
		scan.close();

	}

}
