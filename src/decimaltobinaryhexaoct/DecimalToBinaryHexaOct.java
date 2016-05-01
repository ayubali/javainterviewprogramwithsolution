package decimaltobinaryhexaoct;

public class DecimalToBinaryHexaOct {
	private static char hexaDecimals[] = { '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public static String convertToBinary(int number) {
		String binary = "";
		int rem = 0;
		while (number != 0) {
			rem = number % 2;
			binary = rem + binary;
			number = number / 2;
		}

		return binary;
	}

	public static String convertToOct(int number) {
		String oct = "";
		int rem = 0;
		while (number != 0) {
			rem = number % 8;
			oct = rem + oct;
			number = number / 8;
		}
		return oct;
	}

	public static String convertToHex(int number) {
		String hex = "";
		int rem = 0;
		while (number != 0) {
			rem = number % 16;
			hex = hexaDecimals[rem] + hex;
			number = number / 16;
		}
		return hex;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("convertToBinary: " + convertToBinary(15));
		System.out.println("convertToBinary: " + convertToHex(2000));

	}

}
