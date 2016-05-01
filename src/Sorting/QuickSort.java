package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static int partition(int list[], int low, int high) {
		int left = low + 1;
		int right = high;
		int privot = list[low];
		while (true) {
			while (privot > list[left]) {
				left++;
			}
			while (privot < list[right]) {
				right--;
			}

			if (left >= right) {
				break;
			}
			int temp = list[left];
			list[left] = list[right];
			list[right] = temp;
			left++;
			right--;
		}

		// swap the privot
		list[low] = list[left - 1];
		list[left - 1] = privot;

		return left - 1;
	}

	public static void quickSort(int[] arr, int left, int right) {

		if (right - left <= 0) {
			return;
		}
		int index = partition(arr, left, right);
		quickSort(arr, left, index - 1);
		quickSort(arr, index + 1, right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 23, 4, 12, 45, 90};
		System.out.println("Original Array:"+ Arrays.toString(array));
		
		System.out.println("Sorted Array");
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	

	}

}
