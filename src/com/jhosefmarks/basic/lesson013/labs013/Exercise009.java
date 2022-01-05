package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		
		// https://www.omnicalculator.com
		double celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("Celsius: " + celsius);
		
		scan.close();

	}

}
