package Sorting;

import java.util.Arrays;

public class MargeSort {

	public static void marge(int[] numbers, int left, int mid, int right) {
		int[] helper = new int[numbers.length];
		for (int i = left; i <= right; i++) {
			helper[i] = numbers[i];
		}
		int i = left, j = mid + 1;
		int k = left;

		while (i <= mid && j <= right) {
			if (helper[i] < helper[j]) {
				numbers[k++] = helper[i++];
			} else {
				numbers[k++] = helper[j++];
			}
		}
		while (i <= mid) {
			numbers[k++] = helper[i++];
		}
		while (j <= right) {
			numbers[k++] = helper[j++];
		}
	}

	public static void margeSort(int[] numbers, int left, int right) {
		if (right - left <= 0) {
			return;
		}
		int mid = (right + left) / 2;
		margeSort(numbers, left, mid);
		margeSort(numbers, mid + 1, right);
		marge(numbers, left, mid, right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 23, 45, 12, 45, 90, 15, 27, 41, 83, 16, 5, 45, 66, 7,
				46, 17 };
		System.out.println("Original Array:" + Arrays.toString(array));

		System.out.println();
		margeSort(array, 0, array.length - 1);

		System.out.println("Sorted Array:" + Arrays.toString(array));

	}

}
