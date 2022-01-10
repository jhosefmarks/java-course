package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a side of triangle: ");
		int sideA = scan.nextInt();
		
		System.out.print("Another side: ");
		int sideB = scan.nextInt();
		
		System.out.print("One more side: ");
		int sideC = scan.nextInt();
		
		if (sideA > (sideB + sideC) || sideB > (sideA + sideC) || sideC > (sideB + sideA)) {
			System.out.print("Wrong values, it's not a triangle.");
		} else if (sideA == sideB && sideA == sideC) {
			System.out.print("Equilateral triangle.");
		} else if (sideA == sideB || sideA == sideC || sideB == sideC) {
			System.out.print("Isosceles triangle.");				
		} else if (sideA != sideB && sideA != sideC && sideB != sideC) {
			System.out.print("Scalene triangle.");				
		}
		
		scan.close();

	}

}
