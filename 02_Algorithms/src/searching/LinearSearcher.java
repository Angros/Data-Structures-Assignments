/*
 * LinearSearcher.java
 * By Angel Rosario
 * 841-12-7893 ... SICI 4036 - LJ1
 * 3/marzo/2014
 * Class that represents a linear searcher for arrays and the examined values.
 */

package searching;

public class LinearSearcher<E> implements Searchable<E> { // E parameter = solo puede ser tipo referencia por definicion

	private E[] data;

	
	
	public LinearSearcher(E[] data) {
		this.data = data;
		
		
	}

	@Override
	public int search(E value) {

		for (int index = 0; index < data.length; index++){
			
			if (value.equals(data[index]))
				return index;		// found at index
			
			System.out.println("Valor examinado: " + data[index] + "(" + index + ")");
			System.out.println();
		
		}
		
		return -1;					// not found
	}

	
	
}
