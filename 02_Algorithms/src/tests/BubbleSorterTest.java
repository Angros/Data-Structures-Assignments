/*
 * BubbleSorterTest.java
 * By Angel Rosario
 * 841-12-7893 ... SICI 4036 - LJ1
 * 3/marzo/2014
 * Test application for the BubbleSorter<E> class.
 */

package tests;

import sorting.BubbleSorter;

public class BubbleSorterTest {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		String[] array = { "cat", "dog", "tree", "house", "boat", "woman", "man" };
				
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		BubbleSorter<String> bubble = new BubbleSorter<>();
		bubble.sort(array);
		
		System.out.println("After sorting...");
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		System.out.println("End of test.");
		System.exit(0);
	}

}