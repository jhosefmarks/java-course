package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise005 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first note: ");
		float note1 = scan.nextFloat();
		
		System.out.print("Enter the second note: ");
		float note2 = scan.nextFloat();
		
		float average = (note1 + note2) / 2;
		
		System.out.print("Your average is " + average + ". ");
		if (average < 7) {
			System.out.print("Disapproved!");	
		} else if (average >= 7 && average < 10) {
			System.out.print("Approved!");	
		} else {
			System.out.print("Perfect approval!");	
		}
		
		scan.close();

	}

}
