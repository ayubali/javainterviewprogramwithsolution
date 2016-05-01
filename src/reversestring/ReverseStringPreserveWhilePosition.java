package reversestring;

public class ReverseStringPreserveWhilePosition {

	public static String reverseString(String input) {

		char[] strArray = input.toCharArray();
		char[] retStr = new char[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == ' ') {
				retStr[i] = ' ';
			}
		}

		int j = strArray.length - 1;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != ' ') {
				if (retStr[j] == ' ') {
					j--;
				}
				retStr[j] = strArray[i];
				j--;
			}
		}

		return String.valueOf(retStr);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverseString("I Am Not String"));
		System.out.println(reverseString("JAVA JSP ANDROID"));

	}

}
