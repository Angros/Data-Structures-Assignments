/*
 * BubbleSorter.java
 * By Angel Rosario
 * 841-12-7893 ... SICI 4036 - LJ1
 * 3/marzo/2014
 * Class that represents a bubble sorter for arrays and shows the amount of movements and exchanges.
 */
package sorting;

public class BubbleSorter<E extends Comparable<E>> implements Sortable<E> {

	@Override
	public void sort(E[] data) {
		
		System.out.println("Array being displayed by Bubble Sort:");
		System.out.println();
		
		for(int curr = 1; curr < data.length-1; curr++){
			
			//counters for moving and exchanging elements in an array
			int movement = 0; 
			int change = 0; 
			
			//Display the look of the arrays while they are being sorted
			System.out.print("Sorted array " + curr + ": ");
			for(E array : data)
				System.out.print(array + " "); 
			System.out.println("\n");
			
			for(int idx = 0; idx < data.length-1; idx++){
				if(data[idx].compareTo(data[idx+1]) > 0){
					E temp = data[idx];
					movement++;
					data[idx] = data[idx+1];
					movement++;
					data[idx + 1] = temp;
					movement++;
					change++;
				}
			}
				System.out.println("\t The external cycle did "
						+ movement + " movements and " + change + " changes.");
				System.out.println();				
		}
	}

}
