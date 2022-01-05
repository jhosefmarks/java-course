package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the grade for first quarter: ");
		float grade1 = scan.nextFloat();
		
		System.out.print("Enter the grade for second quarter: ");
		float grade2 = scan.nextFloat();
		
		System.out.print("Enter the grade for third quarter: ");
		float grade3 = scan.nextFloat();
		
		System.out.print("Enter the grade for fourth quarter: ");
		float grade4 = scan.nextFloat();
		
		float average = (grade1 + grade2 + grade3 + grade4) / 4;
		System.out.println("The grade point average is " + average + ".");
		
		scan.close();

	}

}
