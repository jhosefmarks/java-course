package com.jhosefmarks.basic.lesson015.labs015;

import java.util.Scanner;

public class Exercise012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Pay per hour    : $ ");
		double pay = scan.nextDouble();
		
		System.out.print("Hour per month  : ");
		double hours = scan.nextDouble();
		
		double grossSalary = hours * pay;
		double syndicateDiscount = grossSalary * 0.03;
		double INSSDiscount = grossSalary * 0.10;
		double FGTSDiscount = grossSalary * 0.11;
		
		int IRPFPercentual = 0;
	
		if (grossSalary > 900 && grossSalary <= 1500) {
			IRPFPercentual = 5;
		} else if (grossSalary > 1500 && grossSalary <= 2500) {
			IRPFPercentual = 10;
		} else if (grossSalary > 2500) {
			IRPFPercentual = 20;
		}
		
		double IRPFDiscount = grossSalary * (IRPFPercentual / 100.0);
		double discounts = syndicateDiscount + INSSDiscount + IRPFDiscount;
		double netSalary = grossSalary - discounts;
		
		System.out.println("--------------------------------------");
		System.out.println("+ Gross salary (" + pay + " x " + hours + "): $ " + grossSalary);
		System.out.println("- IRPF (" + IRPFPercentual + "%)                 : $ " + IRPFDiscount);
		System.out.println("- INSS (10%)                : $ " + INSSDiscount);
		System.out.println("- Syndicate (3%)            : $ " + syndicateDiscount);
		System.out.println("--------------------------------------");
		System.out.println("* FGTS (11%)                : $ " + FGTSDiscount);		
		System.out.println("= Discount total            : $ " + discounts);
		System.out.println("--------------------------------------");
		System.out.println("= Net salary                : $ " + netSalary);
		
		scan.close();

	}

}
