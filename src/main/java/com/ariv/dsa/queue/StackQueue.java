package com.ariv.dsa.queue;

import java.util.Stack;

public class StackQueue {

	private Stack<Integer> inputStack;
	private Stack<Integer> outputStack;

	public StackQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

	public void add(int value) {
		inputStack.push(value);
	}

	public int remove() {
		if (outputStack.isEmpty()) {
			while (!inputStack.isEmpty()) {
				outputStack.push(inputStack.pop());
			}
		}
		return outputStack.pop();
	}

	public int peek() {
		if (outputStack.isEmpty()) {
			while (!inputStack.isEmpty()) {
				outputStack.push(inputStack.pop());
			}
		}
		return outputStack.peek();
	}

	public boolean isEmpty() {
		return inputStack.isEmpty() && outputStack.isEmpty();
	}
}
