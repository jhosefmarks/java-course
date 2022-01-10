package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise016 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bhaskara formula!");
		System.out.print("Enter a value for A: ");
		int numberA = scan.nextInt();
		
		if (numberA == 0) {
			System.out.print("It isn't a quadratic equation!");
		} else {
			System.out.print("Enter a value for B: ");
			int numberB = scan.nextInt();

			System.out.print("Enter a value for C: ");
			int numberC = scan.nextInt();
			
			double delta = Math.pow(numberB, 2) - (4 * numberA * numberC);
			System.out.println("delta = " + delta);
			
			if (delta < 0) {
				System.out.print("Negative Delta. No result!");
			} else {
				double x1 = ((-numberB) + Math.sqrt(delta)) / (2 * numberA);
				double x2 = ((-numberB) - Math.sqrt(delta)) / (2 * numberA);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			
		}
		
		scan.close();

	}

}
