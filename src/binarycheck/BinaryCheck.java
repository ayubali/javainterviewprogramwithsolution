package binarycheck;

public class BinaryCheck {

	public static boolean isBinary(int number) {
		while (number != 0) {
			int temp = number % 10;
			if (temp > 1) {
				return false;
			}
			number = number / 10;
		}
		return true;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isBinary(1450));
		System.out.println(isBinary(1000101010));

	}

}
