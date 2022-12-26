package com.ariv.dsa.tree.bt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {

	BinaryTree bt = new BinaryTree();
	
	@Test
	public void testAddElements() {
		bt.add(10);bt.add(9);bt.add(8);bt.add(15);
		assertEquals(4, bt.size());
	}
}
