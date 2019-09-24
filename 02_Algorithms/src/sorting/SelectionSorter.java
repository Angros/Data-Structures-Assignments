/*
 * SelectionSorter.java
 * By Angel Rosario
 * 841-12-7893 ... SICI 4036 - LJ1
 * 3/marzo/2014
 * Class that represents a selection sorter for arrays and shows the amount of movements and exchanges.
 */

package sorting;

public class SelectionSorter<E extends Comparable<E>> implements Sortable<E> {

	// Sorts the given array in ascending order.
	@Override
	public void sort(E[] data) {

		System.out.println("Array being displayed by Selection Sort:");
		System.out.println();
		
		for (int current = 0; current < data.length - 1; current++) {
			int indexOfMin = current;
			
			//counters for moving and exchanging elements in an array
			int movement = 0; 
			int change = 0; 
			
			//Display the look of the arrays while they are being sorted
			System.out.print("Sorted array " + current + ": ");
			for(E array : data)
				System.out.print(array + " "); 
			System.out.println("\n");


			for (int scan = current + 1; scan < data.length; scan++)
				if (data[scan].compareTo(data[indexOfMin]) < 0)
					indexOfMin = scan;

			if (current != indexOfMin) {
				E tempElem = data[current];
				movement++;
				data[current] = data[indexOfMin];
				movement++;
				data[indexOfMin] = tempElem;
				movement++;
				change++;
			}
			
			System.out.println("\t The external cycle did "
					+ movement + " movements and " + change + " changes.");
			System.out.println();

		}


	}

}
