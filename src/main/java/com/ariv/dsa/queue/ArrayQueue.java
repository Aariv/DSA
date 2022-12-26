package com.ariv.dsa.queue;

public class ArrayQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	public ArrayQueue() {
		this(10);
	}
	
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		front = 0; 
		rear = -1;
		size = 0;
	}
	
	public void enqueue(int val) {
		if(size == capacity)
			throw new IllegalStateException("queue is full");
		rear = (rear + 1) % capacity;
		queue[rear] = val;
		size++;
	}
	
	public int dequeue() {
		if(size == 0)
			throw new IllegalStateException("Queue is empty");
		int item = queue[front];
		front = (front + 1) % capacity;
		size--;
		return item;
	}
	
	public int peek() {
		if(size == 0)
			throw new IllegalStateException("Queue is empty");
		
		return queue[front];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
