package fibonacci;

public class Fibonacii {

	public static int fibo(int n) {
		if (n == 0) {
			return 0;
		} else {
			int x1 = 0, x2 = 1;
			for (int i = 2; i < n; i++) {
				int x3 = x1 + x2;
				x1 = x2;
				x2 = x3;
			}
			return x2;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fibo(6));

	}

}
