package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		
		System.out.println("The number is " + number + ".");
		
		scan.close();
	}

}
