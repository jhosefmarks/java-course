package com.jhosefmarks.basic.lesson012;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your first name?");
		String firstName = scan.next();
		// Workaround: use this because next() doesn't read the newline character in your input
		scan.nextLine(); 
				
		System.out.println("What's your full name?");
		String fullName = scan.nextLine();
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		System.out.println("How tall are you?");
		double height = scan.nextDouble();
		
		System.out.println("Your first name is " + firstName);
		System.out.println("Your full name is " + fullName);
		System.out.println("Your are " + age + " years old.");
		System.out.println("Your are " + height	 + " tall.");
		
		scan.close();
	
	}

}
