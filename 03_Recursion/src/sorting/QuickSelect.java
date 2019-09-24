/*
 * QuickSelect.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * Class that finds the median of an array without sorting it.
 */

package sorting;

public class QuickSelect {

	// Partitions an array in two halves, one with the elements <= pivot
	// and the other with elements >= pivot.
	private static int partition(int[] arr, int lo, int hi)
	{
		int left = lo;
		int right = hi;
		int pivot = arr[hi];

		do {
			while ((left < right) && (arr[left] <= pivot)) 
				left++;
			while ((right > left) && (arr[right] >= pivot))
				right--;
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		} while (left < right);

		arr[hi] = arr[left];
		arr[left] = pivot;
		return left;
	}

	// Finds the median of the array (The array length must be odd)
	public static int quickselect(int[] array){
		return quickselect(array, 0, array.length-1);
	}

	private static int quickselect(int[] data, int first, int last){

		int pivotIdx = partition(data, first, last); // partition about pivot
		int median = (data.length) / 2;

		if(pivotIdx == median)
			return data[median];

		else if (pivotIdx > median)
			return quickselect(data, first, pivotIdx - 1);

		else 
			return quickselect(data, pivotIdx+1, last);


	}

}