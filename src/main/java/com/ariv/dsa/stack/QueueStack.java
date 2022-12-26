package com.ariv.dsa.stack;

import com.ariv.dsa.queue.ArrayQueue;

// FIFO - Stack
public class QueueStack {

	private ArrayQueue q1;
	private ArrayQueue q2;
	
	public QueueStack() {
		q1 = new ArrayQueue();
		q2 = new ArrayQueue();
	}
	
	public void push(int item) {
		q1.enqueue(item);
	}
	// PUSH 10, 20, 30
	// POP 
	public int pop() {
		if(q1.isEmpty())
			throw new IllegalStateException("Stack is empty");
		while(q1.size() > 1) {
			q2.enqueue(q1.dequeue());
		}
		int data = q1.dequeue();
		ArrayQueue temp = q1;
		q1 = q2;
		q2 = temp;
		return data;
	}
	
}
