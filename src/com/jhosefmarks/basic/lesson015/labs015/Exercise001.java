package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
//https://www.youtube.com/watch?v=-BpAWP6T6a8&list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r&index=21&ab_channel=LoianeGroner

public class Exercise001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int numberA = scan.nextInt();
		
		System.out.print("Another number: ");
		int numberB = scan.nextInt();
		
		if (numberA > numberB) {
			System.out.print("Number " + numberA + " greater than " + numberB + ".");	
		} else if (numberB > numberA) {
			System.out.print("Number " + numberB + " greater than " + numberA + ".");	
		} else {
			System.out.print("Number " + numberA + " is equal to " + numberB + ".");
		}
		
		scan.close();

	}

}
