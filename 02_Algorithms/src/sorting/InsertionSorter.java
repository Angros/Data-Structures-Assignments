/*
 * InsertionSorter.java
 * By Angel Rosario
 * 841-12-7893 ... SICI 4036 - LJ1
 * 3/marzo/2014
 * Class that represents a insertion sorter for arrays and shows the amount of movements and exchanges.
 */
package sorting;

public class InsertionSorter <E extends Comparable<E>> implements Sortable<E> {

	@Override
	public void sort(E[] data) {

		System.out.println("Array being displayed by Insertion Sort.");
		System.out.println();

		for(int scan = 1; scan < data.length; scan++){
			E temp = data[scan];
			int current = scan;	

			int movement = 0;// Moving elements in an array.
			int change = 0;// Exchanges in an array.

			//Display the look of the arrays while they are being sorted
			System.out.print("Sorted array " + (current-1) + ": ");
			for(E array : data)
				System.out.print(array + " "); 
			System.out.println("\n");

			while(current > 0 && data[current - 1].compareTo(temp) >0) {
				data[current] = data[current - 1];
				current--;
				movement++;
				change++;
			}//end while

			data[current] = temp;		

			System.out.println("\t The external cycle did "
					+ movement + " movements and " + change + " changes.");
			System.out.println();

		}//end for
	}
}
