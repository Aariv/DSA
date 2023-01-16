package com.ariv.dsa.search.sort;

public class MergeSort extends Sort {

	@Override
	public void search(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            sort(arr, low, middle);
            sort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }

    private static void merge(int[] arr, int low, int middle, int high) {
        int n1 = middle - low + 1;
        int n2 = high - middle;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[middle + 1 + j];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}
