package com.ariv.dsa.stack;

public class ArrayStack {

	private int top;
	private int[] stack;

	public ArrayStack(int size) {
		top = -1;
		stack = new int[size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == stack.length - 1;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack overflow");
			return;
		}
		stack[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return Integer.MIN_VALUE;
		}
		return stack[top--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		return stack[top];
	}
}
