/*
 * BinarySearcher.java
 * By Angel Rosario
 * 841-12-7893 ... SICI 4036 - LJ1
 * 3/marzo/2014
 * Class that represents a binary searcher for arrays and the values examined.
 */

package searching;

public class BinarySearcher<E extends Comparable<E>> implements Searchable<E> { //para culaquier E que sea comparable.

	
	private E[] data;
	

	public BinarySearcher(E[] data) {
		this.data = data;	
	}


	@Override
	public int search(E value) {
		 int first = 0, last = data.length - 1;
		 
		 
		 
		 while (first <= last) {
			 int middle = (first + last) / 2;
			 if (value.compareTo(data[middle]) < 0)
			 	last = middle - 1;
		 else if (value.compareTo(data[middle]) > 0)
			    first = middle + 1;
	     else
	          return middle; //found at middle
			 
			 System.out.println();
			 System.out.println("Valor examinado: " + middle);
			 System.out.println();
		 }
		 return -1;		//NOT FOUND
		 
		 
		 
		 
	}

	
}
