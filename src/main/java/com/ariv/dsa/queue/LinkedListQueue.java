package com.ariv.dsa.queue;

import com.ariv.dsa.list.SinglyLinkedList;

/**
 * This Queue is implemented based on the linkedlist.
 */
public class LinkedListQueue {

	private SinglyLinkedList queue;

	// Add a new element into the queue.
	public void enqueue(int ele) {
		queue.addLast(ele);
	}
	
	// Delete the first element from the queue. 
	public int dequeue() {
		return queue.deleteFirst();
	}

	// Get the total number of elements from the queue.
	public int size() {
		return queue.size();
	}
}
