package piramid;

public class Pyramid {

	/**
	 * http://javaconceptoftheday.com/wp-content/uploads/2015/07/
	 * PyramidOfNumbers.png 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 7 7 7 7 7
	 * 7 7 8 8 8 8 8 8 8 8 9 9 9 9 9 9 9 9 9
	 * 
	 * @param rowCount
	 */
	public static void pyramid1(int rowCount) {
		int number = 1;
		for (int i = rowCount; i > 0; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= number; k++) {
				System.out.print(number + " ");
			}
			number++;
			System.out.println();
		}
	}

	/*
	 * 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 5 6 1 2 3 4 5 6 7 1 2 3 4 5 6 7 8 1
	 * 2 3 4 5 6 7 8 9
	 */
	public static void pyramid2(int rowCount) {
		int number = 1;
		for (int i = rowCount; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= number; k++) {
				System.out.print(k + " ");
			}
			number++;
			System.out.println();
		}
	}

	public static void pyramid3(int rowCount) {
		int starCount = 1;
		for (int i = rowCount; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starCount; k++) {
				System.out.print("* ");
			}
			starCount++;
			System.out.println();
		}

	}

	public static void pyramid4(int rowCount) {
		int number = 1;
		for (int i = rowCount; i > 0; i--) {
			for (int j = 1; j < 2 * i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= number; k++) {
				System.out.print(k + " ");
			}
			for (int p = number - 1; p > 0; p--) {
				System.out.print(p + " ");
			}
			System.out.println();
			number++;
		}
	}

	public static void pyramid5(int rowCount) {

		for (int i = rowCount; i > 0; i--) {

			for (int j = rowCount * 2; j > i * 2; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int k = i - 1; k > 0; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public static void pyramid6(int rowCount) {
		int number = 1;
		for (int i = rowCount; i > 0; i--) {

			for (int j = 1; j <= 2 * i; j++) {
				System.out.print(" ");
			}
			for (int k = 1, p = i; k <= number; k++) {

				System.out.print(p + " ");
				p++;
			}
			for (int m = rowCount-1; m >= i; m--) {
				System.out.print(m + " ");
				
			}
			number++;
			System.out.println();

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// pyramid1(9);
		// System.out.println();
		// pyramid2(9);
		// pyramid3(9);
		// pyramid4(9);
		// pyramid5(9);
		pyramid6(9);

	}

}
