package com.ariv.dsa.queue;
import java.util.NoSuchElementException;

public class ArrayDeque<E> {
    private E[] elements;
    private int head, tail;

    public ArrayDeque() {
        elements = (E[]) new Object[16];
    }

    public void addFirst(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        head = (head - 1 + elements.length) % elements.length;
        elements[head] = e;
        if (head == tail) {
            resize();
        }
    }

    public void addLast(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        elements[tail] = e;
        tail = (tail + 1) % elements.length;
        if (head == tail) {
            resize();
        }
    }

    public E removeFirst() {
        if (head == tail) {
            throw new NoSuchElementException();
        }
        E result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        return result;
    }

    public E removeLast() {
        if (head == tail) {
            throw new NoSuchElementException();
        }
        tail = (tail - 1 + elements.length) % elements.length;
        E result = elements[tail];
        elements[tail] = null;
        return result;
    }

    private void resize() {
        // code to resize the array when the deque becomes full
    }
}
