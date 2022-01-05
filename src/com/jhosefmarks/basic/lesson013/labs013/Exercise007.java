package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Side: ");
		double side = scan.nextDouble();
		
		// https://www.omnicalculator.com
		// double area = side * side;
		double area = Math.pow(side, 2);
		double area2 = area * 2;
		
		System.out.println("Area: " + area);
		System.out.println("Double: " + area2);
		
		scan.close();

	}

}
