package com.ariv.dsa.stack;

import java.util.LinkedList;
import java.util.Queue;

public class AQueueStack {

	private Queue<Integer> queue;

	public AQueueStack() {
        queue = new LinkedList<>();
    }

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void push(int data) {
		int size = queue.size();
		queue.add(data);
		for (int i = 0; i < size; i++) {
			int temp = queue.remove();
			queue.add(temp);
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return Integer.MIN_VALUE;
		}
		return queue.remove();
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return Integer.MIN_VALUE;
		}
		return queue.peek();
	}
}
