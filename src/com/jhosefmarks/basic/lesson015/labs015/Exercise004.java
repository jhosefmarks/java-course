package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String letter = scan.nextLine();
		
		switch (letter) {
			case "A", "E", "I", "O", "U", "a", "e", "i", "o", "u": 
				System.out.print("The letter " + letter + " is a vowel"); break;
			default: 
				System.out.print("The letter " + letter + " is a consonant.");
		}
		
		scan.close();

	}

}
