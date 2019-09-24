/*
 * ArrayBag.java
 * Angel Rosario
 * 841-12-8946
 * 6/abril/2014
 * Class that represents a bag implemented using an array.
 */
package datastructures;

import java.util.Random;

public class ArrayBag<E> implements Bag<E> {

	// Static fields for a bag's default initial capacity and growth factor
	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private static final int GROWTH_FACTOR = 2;
	
	// Fields for the data and the number of elements in this bag
	private E[] data;
	private int count; 

	// Creates a new bag with the specified initial capacity.
	@SuppressWarnings("unchecked")
	public ArrayBag(int initCapacity){
		if (initCapacity < 0)
			throw new InvalidCapacityException();
		data = (E[])new Object[initCapacity];
	}

	// Creates a new bag with the default initial capacity.
	public ArrayBag(){
		this(DEFAULT_INITIAL_CAPACITY);
	}

	// Adds a new element to this bag.
	@Override
	public void add(E elem) {
		ensureCapacity();
		// System.out.println("capacity = " + data.length);
		data[count++] = elem;
	}
	
	// Ensures that the capacity of this bag allows for addition of an element.
	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if(count == data.length){
			E[] temp = (E[]) new Object[count * GROWTH_FACTOR];
		    for(int curr = 0; curr < count; curr++) 
		    	temp[curr] = data[curr]; 
		    data = temp;
		}
	}
	

	// Removes the specified element from this bag.
	@Override
	public void remove(E elem) {
		int curr = positionOf(elem);
		
		if (curr == -1)
			throw new ElementNotFoundException();
		
		data[curr] = data[--count];
		data[count] = null;

	}

	@Override
	public boolean contains(E elem) {
		// TODO Auto-generated method stub
		return positionOf(elem) != -1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		data = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
		count = 0;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public String toString() {
		String str = "[";
		if (! isEmpty() )
			str += data[0];
			for (int curr = 1; curr < count; curr++)
				str += ", " + data[curr];
		return str + "]";
	}

	private int positionOf(E elem){
		for (int curr = 0; curr < count; curr++)
			if (elem.equals(data[curr]))
				return curr;
		return -1; // not found
	}
	
	// Removes a random element from the array
	@Override
	public E remove() {
		if (isEmpty())
			throw new ElementNotFoundException();
		
		Random rand = new Random();
		int idx  = rand.nextInt(count); // random element from 0 to count
		
		E elem = data[idx];
		
		data[idx] = data[--count];
		data[count] = null;
		
		return elem;
	}
	
	// Returns an array with the elements of the bag
	@SuppressWarnings("unchecked")
	@Override
	public E[] toArray() {
		
		E[] array = (E[]) new Object[count];
		
		for(int curr = 0; curr < count; curr++)
			array[curr] = data[curr];
		
		return array;
	}

}
