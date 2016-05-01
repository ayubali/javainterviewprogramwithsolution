package palindrome;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		str = str.replace(".", "");

		char[] copyStr = str.toLowerCase().replace("\\S+ \\. ", "").toCharArray();
		int i = 0, j = copyStr.length - 1;
		while (i <= j) {
			if (copyStr[i] != copyStr[j]) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Noel sees Leon."));
	}
}
