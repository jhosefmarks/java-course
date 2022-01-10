package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise014 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first note: ");
		float note1 = scan.nextFloat();
		
		System.out.print("Enter the second note: ");
		float note2 = scan.nextFloat();
		
		float average = (note1 + note2) / 2;
		
		System.out.println("Your average is " + average + ". ");
		if (average < 4) {
			System.out.print("E - Disapproved!");	
		} else if (average >= 4 && average < 6) {
			System.out.print("D - Disapproved!");	
		} else if (average >= 6 && average < 7.5) {
			System.out.print("C - Approved!");	
		} else if (average >= 7.5 && average < 9) {
			System.out.print("B - Approved!");	
		} else if (average >= 9) {
			System.out.print("A - Approved!");
		}
		
		scan.close();

	}

}
