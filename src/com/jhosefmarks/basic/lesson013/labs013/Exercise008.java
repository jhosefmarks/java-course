package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Pay per hour ($): ");
		double pay = scan.nextDouble();
		
		System.out.print("Hour per month: ");
		double hours = scan.nextDouble();
		
		double salary = hours * pay;
		
		System.out.println("Your salary: " + salary);
		
		scan.close();

	}

}
