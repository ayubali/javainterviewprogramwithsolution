package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(bubbleSort(new int[] { 45, 84, 101,
				62, 12, 45 })));

	}

}
