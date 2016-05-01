package findnumber;

public class FindNumberLessThanGivenNumberWithoutDigit {

	public static int getLessThanN(int number, int digit) {

		char ch = String.valueOf(digit).charAt(0);

		for (int i = number; i > 0; i--) {

			if (String.valueOf(i).indexOf(ch) == -1) {
				return i;
			}

		}

		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getLessThanN(123, 2));

		System.out.println(getLessThanN(4582, 5));

		System.out.println(getLessThanN(98512, 5));

		System.out.println(getLessThanN(548624, 8));
	}

}
