package missingnumberinarray;

public class MissingNumberInArray {

	public static int sumofNNumbers(int n) {
		return (n * (n + 1)) / 2;
	}

	public static int findMissingNumer(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sumofNNumbers(n) - sum;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findMissingNumer(new int[] {1, 4, 5, 3, 7, 8, 6}, 8));
	}

}
