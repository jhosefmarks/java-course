package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise006 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Radius: ");
		double radius = scan.nextDouble();
		
		// https://www.omnicalculator.com
		double diameter = radius * 2;
		double area = 3.1416 * (radius * radius);
		
		System.out.println("Diameter: " + diameter);
		System.out.println("Area: " + area);
		
		scan.close();

	}
}

