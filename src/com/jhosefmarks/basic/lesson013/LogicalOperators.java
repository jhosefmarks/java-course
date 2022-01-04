package com.jhosefmarks.basic.lesson013;

public class LogicalOperators {

	public static void main(String[] args) {

		boolean truly = true;
		boolean falsy = false;
		
		System.out.println("truly = " + truly + ", falsy = " + falsy);
		System.out.println();

		System.out.println("Short-circuit");
		System.out.println("And (truly && falsy): " + (truly && falsy));
		System.out.println("Or (truly || falsy): " + (truly || falsy));
		System.out.println();
		
		System.out.println("Xor (truly ^ falsy): " + (truly ^ falsy));
		System.out.println("Xor (falsy ^ truly): " + (falsy ^ truly));
		System.out.println("Not (!truly): " + (!truly));
		System.out.println("Not (!falsy): " + (!falsy));
		System.out.println();

		// Set debug to analyze the difference between && and & (the same to || and |)
		boolean result;
		result = falsy && // first condition is checked, if "false",
				truly; // the second condition is not checked
		System.out.println("falsy && truly (checked one time): " + result);
		result = falsy & // first condition is checked, even if it is "false",
				truly; // check second condition too
		System.out.println("falsy & truly (checked twice): " + result);
		
	}

}
