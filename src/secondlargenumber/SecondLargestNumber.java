package secondlargenumber;

public class SecondLargestNumber {
	public static int secondLargestNumber(int[] input) {
		int firstLargeNumber = -1, secondLargeNumber = -1;
		if (input[0] > input[1]) {
			firstLargeNumber = input[0];
			secondLargeNumber = input[1];
		} else {
			firstLargeNumber = input[1];
			secondLargeNumber = input[0];
		}

		for (int i = 0; i < input.length; i++) {
			if (input[i] > firstLargeNumber) {
				secondLargeNumber = firstLargeNumber;
				firstLargeNumber = input[i];
			} else if (input[i] < firstLargeNumber
					&& input[i] > secondLargeNumber) {
				secondLargeNumber = input[i];
			}
		}

		return secondLargeNumber;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(secondLargestNumber(new int[] { 45, 51, 28, 75, 49,
				42 }));

		System.out.println(secondLargestNumber(new int[] { 985, 521, 975, 831,
				479, 861 }));

		System.out.println(secondLargestNumber(new int[] { 9459, 9575, 5692,
				1305, 1942, 9012 }));
	}

}
