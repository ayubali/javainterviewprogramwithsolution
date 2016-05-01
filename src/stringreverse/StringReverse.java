package stringreverse;

public class StringReverse {

	public static String StringBufferRev(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}

	public static String iterativeMethodRev(String str) {

		char[] input = str.toCharArray();
		String rev = "";
		for (int i = input.length - 1; i >= 0; i--) {
			rev += input[i];
		}
		return rev;
	}

	public static String recursiveMethod(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		} else {
			return recursiveMethod(str.substring(1)) + str.charAt(0);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(StringBufferRev("this is ayub"));
		System.out.println(iterativeMethodRev("this is ayub"));
		System.out.println(recursiveMethod("this is ayub"));
	}

}
