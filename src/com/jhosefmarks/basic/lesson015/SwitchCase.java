package com.jhosefmarks.basic.lesson015;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the day of weerk (1 - 7): ");
		int day = scan.nextInt();
		
		/*if (day == 1) {
			System.out.print("Sunday");
		} else if (day == 2) {
			System.out.print("Monday");
		} else if (day == 3) {
			System.out.print("Tuesday");
		} else if (day == 4) {
			System.out.print("Wednesday");
		} else if (day == 5) {
			System.out.print("Thursday");
		} else if (day == 6) {
			System.out.print("Friday");
		} else if (day == 7) {
			System.out.print("Saturday");
		} else {
			System.out.print("Wrong day!!!");
		}*/
		
		switch (day) {
			case 1: System.out.print("Sunday"); break;
			case 2: System.out.print("Monday"); break;
			case 3: System.out.print("Tuesday"); break;
			case 4: System.out.print("Wednesday"); break;
			case 5: System.out.print("Thursday"); break;
			case 6: System.out.print("Friday"); break;
			case 7: System.out.print("Saturday"); break;
			default: System.out.print("Wrong day!!!");
		}
		
		switch (day) {
			case 1, 7:
				System.out.println(" (Weekend)"); break;
			case 2, 3, 4, 5, 6:
				System.out.println(" (day of the week)"); break;
		}
		
		scan.close();

	}

}
