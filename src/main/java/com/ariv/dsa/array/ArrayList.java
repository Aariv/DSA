package com.ariv.dsa.array;

/**
 * ArrayList is the linear data structure that has elements in sequence.
 */
public class ArrayList {

	/** Default capacity will be used when invoking the constructor */
	private static final int DEFAULT_CAPACITY = 5;
	/** Internal array */
	private int[] arr;
	/** Size of the array */
	private int size;

	public ArrayList() {
		this.arr = new int[DEFAULT_CAPACITY];
		this.size = 0;
	}

	/**
	 * This will the new element into the array.
	 * 
	 * @param ele
	 */
	public void add(int ele) {
		arr[size++] = ele;
	}

	/**
	 * This will get the element based on the index.
	 * 
	 * @param index
	 * @return
	 */
	public int get(int index) {
		checkIndex(index);
		return arr[index];
	}
	
	/**
	 * Delete the element for the given index.
	 * 
	 * @param index
	 * @return the element of the given position
	 */
	public int delete(int index) {
		checkIndex(index);
		int data = arr[index];
		for(int i = index; i < size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		return data;
	}

	private void checkIndex(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * @return the total number of elements in the array.
	 */
	public int size() {
		return size;
	}

	/**
	 * Array Traversal
	 */
	@Override
	public String toString() {
		// 1. When array is empty
		if (arr == null || size == 0) {
			return "[]";
		}
		// 2. If there are elements, then capture it in the StringBuilder.
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size - 1; i++) {
			sb.append(arr[i]);
			sb.append(", ");
		}
		sb.append(arr[arr.length - 1]);
		sb.append("]");
		return sb.toString();
	}

}
