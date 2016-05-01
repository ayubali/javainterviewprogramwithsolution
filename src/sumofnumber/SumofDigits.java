package sumofnumber;

public class SumofDigits {
	public static int sumofnumber(int number) {
		int sum = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			sum = sum + lastDigit;
			number = number / 10;
		}
		return sum;
	}

	public static int sumofnumberRecurance(int number) {
		if (number == 0) {
			return 0;
		} else {
			return number % 10 + sumofnumberRecurance(number / 10);
		}

	}

	public static void main(String[] args) {
		System.out.println(sumofnumber(444457));
		System.out.println(sumofnumberRecurance(444457));
	}
}
