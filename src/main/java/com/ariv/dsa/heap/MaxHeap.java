package com.ariv.dsa.heap;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        fixUp(size);
        size++;
    }

    public int delete() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        fixDown(0);
        return max;
    }

    private void fixUp(int index) {
        int parent = (index - 1) / 2;
        while (parent >= 0 && heap[parent] < heap[index]) {
            int temp = heap[parent];
            heap[parent] = heap[index];
            heap[index] = temp;
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void fixDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            fixDown(largest);
        }
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}