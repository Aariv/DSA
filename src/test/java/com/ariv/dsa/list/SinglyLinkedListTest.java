package com.ariv.dsa.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SinglyLinkedListTest {

	private SinglyLinkedList sll; 
	
	@Test
	public void testToString() {
		sll = new SinglyLinkedList();
		sll.add(10);sll.add(20);sll.add(30);sll.add(40);
		assertEquals("[10, 20, 30, 40]", sll.toString());
	}
	
	@Test
	public void testGetElement() {
		sll = new SinglyLinkedList();
		sll.add(10);sll.add(20);sll.add(30);sll.add(40);
		assertEquals(20, sll.get(1));
		assertEquals(30, sll.get(2));
		assertEquals(40, sll.get(3));
	}
	
	@Test(expected = Exception.class)
	public void testGetElementExpectedException() {
		sll = new SinglyLinkedList();
		sll.add(10);sll.add(20);sll.add(30);sll.add(40);
		assertEquals(20, sll.get(4));
	}
	
	@Test
	public void testDeleteElement() {
		sll = new SinglyLinkedList();
		sll.add(10);sll.add(20);sll.add(30);sll.add(40);
		assertEquals(20, sll.delete(1));
		assertEquals(40, sll.delete(2));
	}
}
