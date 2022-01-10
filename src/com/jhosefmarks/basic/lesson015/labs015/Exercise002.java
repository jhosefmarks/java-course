package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		
		if (number % 2 == 0) {
			System.out.print("Number " + number + " is even!");	
		} else {
			System.out.print("Number " + number + " is odd!");
		}
		
		scan.close();

	}

}
