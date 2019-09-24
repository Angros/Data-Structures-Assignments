/*
 * InsertionSorterTest.java
 * Angel Rosario
 * Test application for the InsertionSorter<E> class.
 */

package tests;

import sorting.InsertionSorter;

public class InsertionSorterTest {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		String[] array = { "cat", "dog", "tree", "house", "boat", "woman", "man" };
				
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		InsertionSorter<String> insertion = new InsertionSorter<>();
		insertion.sort(array);
		
		System.out.println("After sorting...");
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		System.out.println("End of test.");
		System.exit(0);
	}

}
