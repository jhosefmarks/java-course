package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the price of product #1: ");
		double price1 = scan.nextDouble();

		System.out.print("Enter the price of product #2: ");
		double price2 = scan.nextDouble();
		
		System.out.print("Enter the price of product #3: ");
		double price3 = scan.nextDouble();
		
		double smallerPrice = price1;
		String smallerProduct = "Product #1";
		
		if (price2 < smallerPrice) {
			smallerPrice = price2;
			smallerProduct = "Product #2";
		} 

		if (price3 < smallerPrice) {
			smallerPrice = price3;
			smallerProduct = "Product #3";
		}
		
		System.out.print("The " + smallerProduct + " has the better price ($" + smallerPrice + ").");
		
		scan.close();

	}

}
