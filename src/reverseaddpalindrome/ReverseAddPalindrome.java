package reverseaddpalindrome;

public class ReverseAddPalindrome {

	public static int reverse(int number) {
		int rev = 0;
		int rem = 0;
		while (number != 0) {
			rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
		}
		return rev;
	}

	public static boolean isPalindrom(int number) {

		int reverse = reverse(number);
		if (reverse == number) {
			return true;
		} else {
			return false;
		}

	}

	public static void addAndReverse(int number) {
		while (!isPalindrom(number)) {
			int rev = reverse(number);
			int sum = rev + number;
			System.out.println(number + " + " + rev + " = " + sum);
			number = sum;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(reverse(1001));
		addAndReverse(7325);

	}

}
