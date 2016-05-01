package separatezerosfromnonzeros;

import java.util.Arrays;

public class SeparateZerosFromNonZeros {

	public static int[] moveZerosToEnd(int[] inputArray) {
		int k = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[k++] = inputArray[i];
			}
		}

		while (k < inputArray.length) {
			inputArray[k++] = 0;
		}
		return inputArray;

	}

	public static int[] moveZerosToFirst(int[] inputArray) {
		int k = inputArray.length - 1;
		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (inputArray[i] != 0) {
				inputArray[k--] = inputArray[i];
			}
		}

		while (k >= 0) {
			inputArray[k--] = 0;
		}
		return inputArray;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = moveZerosToEnd(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		System.out.println("input: " + input.length);

		System.out.println(Arrays.toString(input));
		
		input = moveZerosToFirst(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		System.out.println("input: " + input.length);

		System.out.println(Arrays.toString(input));
		//
		// moveZerosToEnd(new int[] { 1, -5, 0, 0, 8, 0, 1 });
		//
		// moveZerosToEnd(new int[] { 0, 1, 0, 1, -5, 0, 4 });

	}

}
