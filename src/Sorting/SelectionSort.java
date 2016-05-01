package Sorting;

import java.util.Arrays;

public class SelectionSort {
	/*
	 * https://www.youtube.com/watch?v=f8hXR_Hvybo
	 */
	public static int[] selectionSort(int[] arr) {
		int minIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(selectionSort(new int[] { 45, 84,
				101, 62, 12, 45 })));

	}

}
