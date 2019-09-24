/*
 * Bag.java
 * Angel Rosario
 * 841-12-8946
 * 6/abril/2014
 * Interface that represents a bag.
 */

	package datastructures;

	public interface Bag<E> {
		
		// Adds a new element to this bag.
		void add(E elem);
		
		// Removes the specified element from this bag.
		void remove(E elem);
			
		// Returns true if this bag contains the specified element.
		boolean contains(E elem);
		
		// Removes all elements from this bag.
		void clear();
		
		// Returns true if this bag contains no elements.
		boolean isEmpty();
		
		// Returns the number of elements in this bag.
		int size();

		// Removes a random element from the bag
		E remove();

		// Returns an array with the elements in the bag
		E[] toArray();
	}

