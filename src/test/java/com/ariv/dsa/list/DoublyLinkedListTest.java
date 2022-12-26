package com.ariv.dsa.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoublyLinkedListTest {

	private DoublyLinkedList dll; 
	
	@Test
	public void testToString() {
		dll = new DoublyLinkedList();
		dll.add(10);dll.add(20);dll.add(30);dll.add(40);
		assertEquals("[10, 20, 30, 40]", dll.toString());
	}
	
	@Test
	public void testGetElement() {
		dll = new DoublyLinkedList();
		dll.add(10);dll.add(20);dll.add(30);dll.add(40);
		assertEquals(20, dll.get(1));
		assertEquals(30, dll.get(2));
		assertEquals(40, dll.get(3));
	}
	
	@Test(expected = Exception.class)
	public void testGetElementExpectedException() {
		dll = new DoublyLinkedList();
		dll.add(10);dll.add(20);dll.add(30);dll.add(40);
		assertEquals(20, dll.get(4));
	}
	
	@Test
	public void testDeleteElement() {
		dll = new DoublyLinkedList();
		dll.add(10);dll.add(20);dll.add(30);dll.add(40);
		assertEquals(20, dll.delete(1));
		assertEquals(40, dll.delete(2));
	}
}
