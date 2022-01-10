package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise010 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("What period do you study? (M, A or N) ");
		String gender = scan.nextLine();
		
		switch (gender) {
			case "M", "m": System.out.print("Good Morning!"); break;
			case "A", "a": System.out.print("Good Afternoon!"); break;
			case "N", "n": System.out.print("Good Evening!"); break;
			default: System.out.print("Wrong value!!!");
		}
		
		scan.close();

	}

}
