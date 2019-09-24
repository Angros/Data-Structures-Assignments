/*
 * ArrayRecursion.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * Class with recursive static methods for array processing.
 */
package algorithms;

public class ArrayRecursion {

	// Prevents instantiation.
	private ArrayRecursion() { }

	// Returns the sum of the elements of an array of doubles.
	public static double sumElements(double[] arr){

		return sumElements(arr, arr.length);
	}

	private static double sumElements(double[] arr, int len){
		if (len == 0)
			return 0;
		else
			return sumElements(arr, len - 1) + arr[len - 1];
	}

	// Returns the string representation of an array of doubles
	public static String toString(double[] arr) {
		return "[" + toString(arr, arr.length) + "]";
	}

	private static String toString(double[] arr, int len) {
		if (len == 0)
			return " ";

		else if (len == 1)
			//return Double.toString(arr[0]);
			return String.valueOf(arr[0]);
		else
			return toString(arr, len - 1) + ", " + arr[len - 1];
	}

	//  Returns true if two arrays of doubles are equal to one another.
	public static boolean equals(double[] arr1, double[] arr2){
		if (arr1.length != arr2.length)
			return false;
		else
			return equals(arr1, arr2, arr1.length);
	}

	private static boolean equals(double[] arr1, double arr2[], int len){
		if (len == 0)
			return true;
		else
			return equals(arr1, arr2, len -1) && 
					arr1[len - 1] == arr2[len - 2];
	}



	// Returns the string representation of an array of integers
	public static String toString(int[] arr) {
		return "[" + toString(arr, arr.length) + "]";
	}

	private static String toString(int[] arr, int len) {
		if (len == 0)
			return " ";

		else if (len == 1)
			//return Int.toString(arr[0]);
			return String.valueOf(arr[0]);
		else
			return toString(arr, len - 1) + ", " + arr[len - 1];
	}


	//the array must have one element.
	public static int maxElement(int[] array){
		return maxElement(array, 0, array[0]);

	}
	// Returns the maximum element of the array
	private static int maxElement(int[] array, int len, int max) {
		if(len == array.length-1)
			return max;
		max = maxOfTwo(array[len+1], max);
		return maxElement(array, len+1, max);
	}
	//Max Element of two 
	private static int maxOfTwo(int num1, int num2) {
		return (num1 > num2)? num1 : num2;
	}



}





