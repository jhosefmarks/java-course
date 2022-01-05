package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your height (meters): ");
		double height = scan.nextDouble();
		
		// https://www.omnicalculator.com
		double weight = (72.7 * height) - 58;
		
		System.out.println("Ideal weight: " + weight);
		
		scan.close();

	}

}
