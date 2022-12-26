package com.ariv.dsa.array;

// TODO:- THE ADT is under progress.
public class _2DArray {

	private static final int X = 3;
	private static final int Y = 3;
	private int[][] arr;
	private int size;

	public _2DArray() {
		this.arr = new int[X][Y];
		this.size = 0;
	}

	public void add(int x, int y, int val) {
		arr[x][y] = val;
		size++;
	}
	
	@Override
	public String toString() {
		if (arr == null || size == 0) {
			return "[[]]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			StringBuilder sb1 = new StringBuilder();
			sb1.append("[");
			for (int j = 0; j < arr[i].length-1; j++) {
				sb1.append(arr[i][j]);
				sb1.append(", ");
			}
			sb1.append(sb.append(arr[i][arr.length-1]));
			sb1.append("]");
			sb.append(sb1.toString());
		}
		sb.append("]");
		return sb.toString();
	}
}
