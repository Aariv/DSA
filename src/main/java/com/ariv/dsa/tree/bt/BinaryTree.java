package com.ariv.dsa.tree.bt;

/**
 * Binary Tree Implementation
 */
public class BinaryTree {

	private TreeNode root;
	private int size;

	private class TreeNode {
		private int val;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	/**
	 * Insert a new node into the tree
	 */
	public void add(int ele) {
		TreeNode newNode = new TreeNode(ele);

		if (root == null) {
			root = newNode;
			size++;
		} else {
			TreeNode curr = root;
			while (true) {
				if (ele < curr.val) {
					if (curr.left == null) {
						curr.left = newNode;
						size++;
						return;
					}
					curr = curr.left;
				} else {
					if (curr.right == null) {
						curr.right = newNode;
						size++;
						return;
					}
					curr = curr.right;
				}
			}
		}
	}

	public int size() {
		return size;
	}

	/**
	 * To search for an element.
	 * 
	 * @param ele
	 * @return
	 */
	public boolean search(int ele) {
		TreeNode curr = root;
		while (curr != null) {
			if (curr.val == ele) {
				return true;
			}
			if (ele < curr.val) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		return false;
	}

	/**
	 * To delete a specific element.
	 * 
	 * @param value
	 */
	public void delete(int value) {
		deleteRecursive(root, value);
		size--;
	}

	public TreeNode deleteRecursive(TreeNode curr, int value) {
		// Find the node to delete
		if (curr == null) {
			return null;
		}
		if (curr.val == value) {
			// Case 1: the node is leaf node
			if (curr.left == null && curr.right == null) {
				return null;
			}
			// Case 2: the node has one child
			if (curr.left == null) {
				return curr.right;
			}
			if (curr.right == null) {
				return curr.left;
			}
			// Case 3: the node has two children
			int smallestValue = findSmallestValue(curr.right);
			curr.val = smallestValue;
			curr.right = deleteRecursive(curr.right, smallestValue);
			return curr;
		}

		if (value < curr.val) {
			curr.left = deleteRecursive(curr.left, value);
			return curr;
		} else {
			curr.right = deleteRecursive(curr.right, value);
			return curr;
		}
	}

	private int findSmallestValue(TreeNode right) {
		return root.left == null ? root.val : findSmallestValue(root.left);
	}

}
