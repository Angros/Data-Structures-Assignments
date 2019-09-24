/*
 * ArrayMaxElementTest.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * Test the maxElement method from ArrayRecursion and ArrayIteration.
 */
package tests;

import algorithms.ArrayIteration;
import algorithms.ArrayRecursion;

public class ArrayMaxElementTest {

	public static void main(String[] args){

		// An array of integers
		int[] Array = { 7, 2, 4, 9, 5};

		// Test for recursive version
		System.out.println("ThirdArray: " + 
				ArrayRecursion.toString(Array));
		System.out.println();

		System.out.println("(Recursive) - Maximum element of the array is: " +
				ArrayRecursion.maxElement(Array));
		System.out.println();

		// Test for iterative version.
		/*	System.out.println("ThirdArray: " + 
						ArrayIteration.toString(Array));*/

		System.out.println("(Iteration) - Maximum element of the array is: " +
				ArrayIteration.maxElement(Array));
		System.out.println();


		System.out.println("End of test.");
		System.exit(0);

	}



}
