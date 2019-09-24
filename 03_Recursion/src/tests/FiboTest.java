/*
 * FiboTest.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * Test application for Recursive and Iterative versions of Fibonacci.
 */
package tests;

import java.util.Scanner;
import algorithms.Recursion;
import algorithms.Iteration;

public class FiboTest {

	// Serves as the entry point of the application
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter a non negative integer: ");
		int num = kb.nextInt();

		if (num < 0){
			System.err.println("Fatal error: negative integer");
			System.exit(1);  // Exits with error status code
		}

		// Test of Iterative Fibonacci
		System.out.println("Fibonacci Iterative version: "  + Iteration.fibo(num));

		System.out.println();

		// Test of Recursive Fibonacci
		System.out.println("Fibonacci Recursive version: " + Recursion.fibo(num));

		System.out.println();



		kb.close();

		System.out.println("End of test");
		System.exit(0);
	}
}
