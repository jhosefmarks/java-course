package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a gender: ");
		String gender = scan.nextLine();
		
		switch (gender) {
			case "F": System.out.print("Female"); break;
			case "M": System.out.print("Male"); break;
			case "O": System.out.print("Other"); break;
			default: System.out.print("Wrong value!!!");
		}
		
		scan.close();

	}

}
