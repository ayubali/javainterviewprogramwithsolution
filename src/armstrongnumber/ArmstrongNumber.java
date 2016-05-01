package armstrongnumber;

public class ArmstrongNumber {

	public static boolean isArmstrongNumber(int number) {
		boolean isArmstrongNumber = false;
		int digitCount = String.valueOf(number).length();
		int copyNumber = number;
		int digitSum = 0;
		while (copyNumber != 0) {
			int lastDigit = copyNumber % 10;
			int prod = 1;
			for (int i = 0; i < digitCount; i++) {
				prod = prod * lastDigit;

			}
			digitSum += prod;
			copyNumber = copyNumber / 10;
		}
		System.out.println("digitSum: " + digitSum);
		if (digitSum == number) {
			isArmstrongNumber= true;
		}

		return isArmstrongNumber;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(isArmstrongNumber(153));
	}

}
