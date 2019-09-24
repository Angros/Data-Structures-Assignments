/*
 * ArrayIteration.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * Class with iterative static methods for array processing.
 */
package algorithms;

public class ArrayIteration {

	// Prevents instantiation.
	private ArrayIteration() { } 

	// Returns the sum of the elements of an array of doubles.
	public static double sumElements(double[] arr) {
		double sum = 0.0;

		for (double elem : arr)
			sum += elem;

		return sum;
	}

	// Returns the string representation of an array of doubles
	public static String toString(double[] arr) {
		String out = "[";

		if (arr.length > 0) {
			out += arr[0];
			for (int idx = 1; idx < arr.length; idx++)
				out += ", " + arr[idx];
		}

		return out + "]";
	}

	// Returns true if two arrays of doubles are equal to one another
	public static boolean equals(double[] arr1, double[] arr2){
		if (arr1.length != arr2.length)
			return false;
		else{
			for(int idx = 0; idx < arr1.length; idx++)
				if (arr1[idx] != arr2[idx])
					return false;
			return true;
		}
	}

	// Returns the maximum element of the array
	public static int maxElement(int[] array) {
		// TODO Auto-generated method stub
		int maxElem = array[0];

		for (int num = 0; num < array.length; num++){
			if(array[num] > maxElem)
				maxElem = array[num];
		}
		return maxElem;

	}
}

