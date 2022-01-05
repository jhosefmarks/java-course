package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise005 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Meters: ");
		int meters = scan.nextInt();
		
		int centimeters = meters * 100;
		System.out.println("Centimeters: " + centimeters);
		
		scan.close();

	}

}
