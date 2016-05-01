package subarraywhosesumisnumber;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {

	public static void findsubarray(int[] inputArray, int inputNumber) {

		int sum = inputArray[0];
		int start = 0;
		for (int i = 1; i < inputArray.length; i++) {
			sum += inputArray[i];
			while (sum > inputNumber && start < i) {
				sum = sum - inputArray[start];
				start++;
			}
			if (sum == inputNumber) {
				System.out.println("Continuous sub array of "
						+ Arrays.toString(inputArray) + " whose sum is "
						+ inputNumber + " is ");
				for (int j = start; j <= i; j++) {
					System.out.print(inputArray[j]+" ");
				}
				System.out.println();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findsubarray(new int[]{42, 15, 12, 8, 6, 32}, 26);
		 
		findsubarray(new int[]{12, 5, 31, 13, 21, 8}, 49);
 
		findsubarray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);

	}

}
