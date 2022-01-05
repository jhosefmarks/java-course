package com.jhosefmarks.basic.lesson013.labs013;

import java.util.Scanner;

public class Exercise014 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("File size (MB): ");
		
		double fileSize = scan.nextDouble();
		System.out.print("Link (Mbps): ");
		double mbps = scan.nextDouble();
		
		double downloadTime = fileSize / mbps / 60;
		
		System.out.println("Time: " + downloadTime);
		
		scan.close();
		
	}

}
