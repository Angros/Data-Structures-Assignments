/*
 * QuickSelect.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * Test application for the QuickSelect class.
 */
package tests;

import java.util.Arrays;

import sorting.QuickSelect;

public class QuickSelectTest {

	// Serves as the entry point for the application.
	public static void main(String[] args) {
		int[] arr = {5, 3, 9, 7, 2, 1, 8, 6, 4};

		System.out.println("This is arr: " + Arrays.toString(arr));
		System.out.println();

		System.out.println("The median of the array is: " + QuickSelect.quickselect(arr) );
		System.out.println();

		System.out.println("End of test.");
		System.exit(0);
	}


}
