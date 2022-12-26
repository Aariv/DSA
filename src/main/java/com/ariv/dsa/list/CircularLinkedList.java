package com.ariv.dsa.list;

// TODO: Circular linked list implementation
public class CircularLinkedList {

	private ListNode last;
	private int size;

	private class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
		}
	}
	
	public void add(int ele) {
		ListNode newNode = new ListNode(ele);
		if(last == null) {
			last = newNode;
		} else {
			last.next = newNode;
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public int get(int index) {
		return -1;
	}
	
	public int delete(int index) {
		return -1;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
