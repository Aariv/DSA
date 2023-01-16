package com.ariv.dsa.stack;

public class LinkedListStack {

	private class Node {
		int data;
		Node next;
	}

	private Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = top;
		top = newNode;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return Integer.MIN_VALUE;
		}
		int data = top.data;
		top = top.next;
		return data;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return Integer.MIN_VALUE;
		}
		return top.data;
	}
}
