package com.jhosefmarks.basic.lesson013;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int x = 10;
		int y = 3;
		
		System.out.println("x = " + x + ", y = " + y);
		System.out.println();

		System.out.println("Addition: " + (x + y));
		System.out.println("Subtraction: " + (x - y));
		System.out.println("Multiplication: " + (x * y));
		System.out.println("Division: " + (x / y));
		System.out.println("Modulus: " + (x % y));
		
		x = 10;
		// return the value and then increment
		System.out.println("Increment (after): " + (x++));
		
		x = 10;
		// increment the value and then return
		System.out.println("Increment (before): " + (++x));
		
		// x = x + 1;
		// x += 1;
		// x++;
		// ++x;
		
		x = 10;
		// return the value and then decrement
		System.out.println("Decrement (after): " + (x--));
		
		x = 10;
		// return the value and then decrement
		System.out.println("Decrement (before): " + (--x));
		
		// x = x - 1;
		// x -= 1;
		// x--;
		// --x;
		
		String language = "Java";
		String level = "Basic";
		
		System.out.println(language + " " + level);

	}

}
