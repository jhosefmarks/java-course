package com.jhosefmarks.basic.lesson015.labs015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int numberA = scan.nextInt();
		
		System.out.print("Another number: ");
		int numberB = scan.nextInt();
		
		System.out.print("One more number: ");
		int numberC = scan.nextInt();

		
		System.out.print("In descending order: ");
		
		// With "if" and "else"
		if (numberA >= numberB && numberA >= numberC && numberB >= numberC) {
			System.out.print(numberA + " - " + numberB + " - " + numberC);
		} else if (numberA >= numberB && numberA >= numberC && numberC >= numberB) {
			System.out.print(numberA + " - " + numberC + " - " + numberA);
		} else if (numberB >= numberA && numberB >= numberC && numberC >= numberA) {
			System.out.print(numberB + " - " + numberC + " - " + numberA);
		} else if (numberB >= numberA && numberB >= numberC && numberA >= numberC) {
			System.out.print(numberB + " - " + numberA + " - " + numberC);
		} else if (numberC >= numberA && numberC >= numberB && numberB >= numberA) {
			System.out.print(numberC + " - " + numberB + " - " + numberA);
		} else if (numberC >= numberA && numberC >= numberB && numberA >= numberB) {
			System.out.print(numberC + " - " + numberA + " - " + numberB);
		} 
		
		
		scan.close();

	}

}
