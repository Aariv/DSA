package com.ariv.dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class GeneralTree {
	
	private GTreeNode root;

	private class GTreeNode {
		private int val;
		private List<GTreeNode> list;

		public GTreeNode(int val) {
			this.val = val;
		}
	}
	
	public void buildTree() {
		GTreeNode first = new GTreeNode(10);
		
		List<GTreeNode> firstList = new ArrayList<GeneralTree.GTreeNode>();
		firstList.add(new GTreeNode(20));
		firstList.add(new GTreeNode(30));
		firstList.add(new GTreeNode(40));
		firstList.add(new GTreeNode(50));
		
		first.list = firstList;
	}
	
}
