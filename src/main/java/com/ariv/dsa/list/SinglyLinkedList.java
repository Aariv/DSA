package com.ariv.dsa.list;

/**
 * Basic Operations on the Singly Linked List
 */
public class SinglyLinkedList {
	/** Head points to the first node of the list */
	private ListNode head;
	/** tail points to the last node of the list */
	private ListNode tail;
	/** size points to the total number nodes of the list */
	private int size;

	/**
	 * Internal class for the ListNode
	 */
	private class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
		}
	}

	public void addFirst(int ele) {
		ListNode newNode = new ListNode(ele);
		if(head == null) {
			head = head.next;
		} else {
			head.next = newNode;
		}
	}
	
	public void addLast(int ele) {
		ListNode newNode = new ListNode(ele);
		if(head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
	}
	
	public int peekFirst() {
		if(head == null)
			throw new IllegalArgumentException();
		
		return head.val;
	}
	
	public int peekLast() {
		if(tail == null)
			throw new IllegalArgumentException();
		
		return tail.val;
	}
	
	public int deleteFirst() {
		if(head == null)
			throw new IllegalArgumentException();
		
		ListNode temp = head;
		head = head.next;
		return temp.val;
	}
	
	public int deleteLast() {
		if(head == null)
			throw new IllegalArgumentException();
		
		ListNode temp = head;
		ListNode prev = null;
		while(temp != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		return temp.val;
	}
	
	/**
	 * 
	 * @param ele
	 */
	public void add(int ele) {
		// 1. Create a new node
		ListNode newNode = new ListNode(ele);
		// 2. Check if the node has already in the list
		if (head == null || tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode; // Don't forget to set the tail pointer
		}
		// Increment the size
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
	 * Delete the node for the given index.
	 * @param index
	 * @return
	 */
	public int delete(int index) {
		// 1. Check the index
		checkIndex(index);
		int data = -1;
		// 2. remove first node
		if (index == 0) {
			head = head.next;
		} else {
			// 3. Traverse the list till the index
			ListNode temp = head;
			ListNode prev = null;
			int i = 0;
			while (i < index) {
				prev = temp;
				temp = temp.next;
				i++;
			}
			prev.next = temp.next;
			data = temp.val;
			temp.next = null;
		}
		size--;
		return data;
	}
	
	public int size() {
		return size;
	}

	private void checkIndex(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
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
