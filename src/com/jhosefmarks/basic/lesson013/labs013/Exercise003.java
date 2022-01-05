package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number #1: ");
		int number1 = scan.nextInt();
		
		System.out.print("Enter a number #2: ");
		int number2 = scan.nextInt();
		
		int sum = number1 + number2;
		System.out.println("The sum is " + sum + ".");
		
		scan.close();

	}

}
