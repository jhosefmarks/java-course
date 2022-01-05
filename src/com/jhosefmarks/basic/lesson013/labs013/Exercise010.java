package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise010 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Celsius: ");
		double celsius = scan.nextDouble();
		
		// https://www.omnicalculator.com
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("Fahrenheit: " + fahrenheit + "F");
		
		scan.close();

	}

}
