package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise011 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Integer number #1: ");
		int number1 = scan.nextInt();
		
		System.out.print("Integer number #2: ");
		int number2 = scan.nextInt();
		
		System.out.print("Float numer #3: ");
		double number3 = scan.nextDouble();
		
		double result1 = (number1 * 2) * (number2 / 2);
		System.out.println("Result #1: " + result1);
		
		double result2 = (number1 * 3) + number3;
		System.out.println("Result #2: " + result2);
		
		double result3 = Math.pow(number3, 3);
		System.out.println("Result #3: " + result3);
		
		scan.close();


	}

}
