package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Pay per hour    : $ ");
		double pay = scan.nextDouble();
		
		System.out.print("Hour per month  : ");
		double hours = scan.nextDouble();
		
		double grossSalary = hours * pay;
		double syndicateDiscount = grossSalary * 0.05;
		double INSSDiscount = grossSalary * 0.08;
		double IRPFDiscount = grossSalary * 0.11;
		double netSalary = grossSalary - syndicateDiscount - INSSDiscount - IRPFDiscount;
		
		System.out.println("----------------------------");
		System.out.println("+ Gross salary  : $ " + grossSalary);
		System.out.println("- IRPF (11%)    : $ " + IRPFDiscount);
		System.out.println("- INSS (8%)     : $ " + INSSDiscount);
		System.out.println("- Syndicate (5%): $ " + syndicateDiscount);
		System.out.println("----------------------------");
		System.out.println("= Net salary    : $ " + netSalary);
		
		scan.close();

	}

}
