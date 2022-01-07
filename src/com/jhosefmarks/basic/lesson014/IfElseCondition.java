package com.jhosefmarks.basic.lesson014;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		int age = scan.nextInt();
		
		if (age >= 18) {
			System.out.println("You are of legal age.");
		 } else {
			System.out.println("You are not of legal age.");
		}
		
		System.out.print("\nHow much this cake? ");
		double cake = scan.nextDouble();
		
		if (cake <= 10) {
			System.out.print("It's cheap, you can buy it now!");
		} else if (cake > 10 && cake < 15)  {
			System.out.print("You can ask for a discount.");
		} else if (cake >= 15 && cake < 17)  {
			System.out.print("Let's look at another store.");
		} else {
			System.out.print("RUN!!! It's very expensive.");
		}
		
		
		scan.close();
		
	}

}
