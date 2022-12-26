package com.ariv.dsa.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void testArrayListEmpty() {
		ArrayList list = new ArrayList();
		assertEquals("[]", list.toString());
	}
	
	@Test
	public void testArrayListNotEmpty() {
		ArrayList list = new ArrayList();
		list.add(1);list.add(2);list.add(3);
		list.add(4);list.add(5);
		assertEquals("[1, 2, 3, 4, 5]", list.toString());
	}
	
	@Test
	public void testArrayListGet() {
		ArrayList list = new ArrayList();
		list.add(1);list.add(2);list.add(3);
		list.add(4);list.add(5);
		assertEquals(1, list.get(0));
		assertEquals(2, list.get(1));
		assertEquals(3, list.get(2));
		assertEquals(4, list.get(3));
	}
	
	@Test(expected = Exception.class)
	public void testArrayListGet_ExpectedException() {
		ArrayList list = new ArrayList();
		list.add(1);list.add(2);list.add(3);
		list.add(4);list.add(5);
		assertEquals(5, list.get(5));
	}
	
	@Test(expected = Exception.class)
	public void testArrayListGet_ExpectedExceptionNegative() {
		ArrayList list = new ArrayList();
		list.add(1);list.add(2);list.add(3);
		list.add(4);list.add(5);
		assertEquals(5, list.get(-1));
	}
}
