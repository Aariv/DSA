package com.ariv.dsa.list;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int size;

	private class ListNode {
		private int val;
		private ListNode next;
		private ListNode prev;

		public ListNode(int val) {
			this.val = val;
		}
	}

	/**
	 * Add a new element in the list
	 * 
	 * @param ele
	 */
	public void add(int ele) {
		// 1. Create a new node
		ListNode newNode = new ListNode(ele);
		// 2. If there are nodes mark the newNode as first node
		if (head == null) {
			head = tail = newNode;
		}
		// 3. Otherwise append the node
		else {
			tail.next = newNode;
			// Doubly Linked List
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	/**
	 * 
	 * @param index
	 * @return
	 */
	public int get(int index) {
		// 1. Check the index
		checkIndex(index);
		int data = -1;
		// 2. Traverse the list till the index
		ListNode temp = head;
		int i = 0;
		while (i < index) {
			temp = temp.next;
			i++;
		}
		data = temp.val;
		return data;
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public int delete(int index) {
		// 1. Check the index
		checkIndex(index);
		int data = -1;
		// 2. The position to delete first node
		if(index == 0) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			data = temp.val;
		}
		// 3. The position to delete the last node
		else if(index == size - 1) {
			ListNode temp = tail;
			tail = tail.prev;
			temp.prev = null;
			data = temp.val;
		}
		// 3. Traverse the list till the index
		else {
			ListNode temp = head;
			ListNode prev = null;
			int i = 0;
			while (i < index) {
				prev = temp;
				temp = temp.next;
				i++;
			}
			data = temp.val;
			// Make the pointer, the deleted node will be taken care by GC
			prev.next = temp.next;
			temp.next.prev = prev;
		}
		size--;
		return data;
	}

	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	/**
	 * Display all the nodes in the list.
	 */
	@Override
	public String toString() {
		if (head == null) {
			return "[]";
		}
		ListNode temp = head;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while (temp != null) {
			sb.append(temp.val);
			sb.append(", ");
			temp = temp.next;
		}
		sb.replace(sb.length()-2, sb.length(), "]");
		return sb.toString();
	}
}
