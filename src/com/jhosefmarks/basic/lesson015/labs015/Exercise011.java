package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Salary: $ ");
		double salary = scan.nextDouble();
		
		int percentage = 0;
		
		if (salary <= 280) {
			percentage = 20;
		} else if (salary > 280 && salary <= 700) {
			percentage = 15;
		} else if (salary > 700 && salary <= 1500) {
			percentage = 10;
		} else {
			percentage = 5;
		}
		
		double increase = salary * (percentage / 100.0);
		double newSalary = salary + increase;
		
		System.out.println("---------------------");
		System.out.println("Percentage: " + percentage + "%");
		System.out.println("Increase  : $ " + increase);
		System.out.println("New salary: $ " + newSalary);
		
		scan.close();

	}

}
