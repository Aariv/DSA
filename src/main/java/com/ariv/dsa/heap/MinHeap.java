package com.ariv.dsa.heap;

public class MinHeap {
	private int[] heap;
	private int size;

	public MinHeap(int maxSize) {
		heap = new int[maxSize];
		size = 0;
	}

	public void insert(int value) {
		if (size == heap.length) {
			throw new IllegalStateException("Heap is full");
		}

		heap[size] = value;

		// Bubble up the new value
		int current = size;
		int parent = (current - 1) / 2;
		while (current > 0 && heap[current] < heap[parent]) {
			swap(current, parent);
			current = parent;
			parent = (current - 1) / 2;
		}

		size++;
	}

	public int extractMin() {
		if (size == 0) {
			throw new IllegalStateException("Heap is empty");
		}

		int min = heap[0];

		// replace the root with the last value
		heap[0] = heap[size - 1];
		size--;

		// bubble down the new root
		int current = 0;
		int leftChild = 1;
		int rightChild = 2;
		while (leftChild < size) {
			int minChild = leftChild;
			if (rightChild < size && heap[rightChild] < heap[leftChild]) {
				minChild = rightChild;
			}

			if (heap[current] > heap[minChild]) {
				swap(current, minChild);
				current = minChild;
				leftChild = current * 2 + 1;
				rightChild = current * 2 + 2;
			} else {
				break;
			}
		}

		return min;
	}

	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
}
