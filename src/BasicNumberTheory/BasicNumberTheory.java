package BasicNumberTheory;

public class BasicNumberTheory {

	static int gcd1(int a, int b) {
		if (a == 0 || b == 0)
			return a + b; // base case
		return gcd1(b, a % b);
	}

	static int gcd(int a, int b) {
		while (a != 0 && b != 0) // until either one of them is 0
		{
			int c = b;
			b = a % b;
			a = c;
		}
		return a + b; // either one is 0, so return the non-zero value
	}

	int gcdLcm(int a, int b) {
		// Euclidean algorithm
		int t;
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	int lcm(int a, int b) {
		return (a * b / gcdLcm(a, b));
	}

	private static int gcd(int number1, int... otherNumbers) {
		int result = number1;
		for (int number : otherNumbers)
			result = gcd(result, number);
		return result;
	}

	private static int gcdMutiple(int a, int b, int c, int d, int e) {
		return gcd(gcd(a, b), gcd(gcd(c, d), e));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
