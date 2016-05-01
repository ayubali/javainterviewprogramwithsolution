package anagram;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramProgram {

	public static boolean isAnagramOne(String s1, String s2) {

		String copyS1 = s1.replace("\\s", "");
		String copyS2 = s2.replace("\\s", "");
		boolean status = true;
		if (copyS1.length() != copyS2.length()) {
			status = false;
		} else {
			char[] s1Array = copyS1.toLowerCase().toCharArray();
			char[] s2Array = copyS2.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status = Arrays.equals(s1Array, s2Array);
		}

		return status;
	}

	public static boolean isAnagramTwo(String s1, String s2) {
		String copyS1 = s1.replace("\\s", "").toLowerCase();
		String copyS2 = s2.replace("\\s", "").toLowerCase();
		boolean status = true;
		if (copyS1.length() != copyS2.length()) {
			status = false;
		} else {
			char[] s1ToArray = copyS1.toCharArray();

			for (char ch : s1ToArray) {
				int index = copyS2.indexOf(ch);
				if (index != -1) {
					copyS2 = copyS2.substring(0, index)
							+ copyS2.substring(index + 1, copyS2.length());
				} else {
					status = false;
					break;
				}
			}
		}
		return status;
	}

	public static boolean isAnagramThree(String s1, String s2) {
		String copyS1 = s1.replace("\\s", "").toLowerCase();
		String copyS2 = s2.replace("\\s", "").toLowerCase();
		boolean status = true;
		if (copyS1.length() != copyS2.length()) {
			status = false;
		} else {
			char[] s1ToArray = copyS1.toCharArray();
			StringBuilder sb = new StringBuilder(copyS2);
			for (char ch : s1ToArray) {
				int index = sb.indexOf("" + ch);
				if (index != -1) {
					sb = sb.deleteCharAt(index);
				} else {
					status = false;
					break;
				}
			}

		}
		return status;
	}

	public static boolean isAnagramFour(String s1, String s2) {
		String copyS1 = s1.replace("\\s", "").toLowerCase();
		String copyS2 = s2.replace("\\s", "").toLowerCase();
		boolean status = true;
		if (copyS1.length() != copyS2.length()) {
			status = false;
		} else {

			HashMap<Character, Integer> map = new HashMap<Character, Integer>();

			for (int i = 0; i < copyS1.length(); i++) {

				char charAsKey = copyS1.charAt(i);
				int charCountValue = 0;
				if (map.containsKey(charAsKey)) {
					charCountValue = map.get(charAsKey);
				}
				map.put(charAsKey, ++charCountValue);

				charAsKey = copyS2.charAt(i);
				charCountValue = 0;
				if (map.containsKey(charAsKey)) {
					charCountValue = map.get(charAsKey);
				}
				map.put(charAsKey, --charCountValue);

			}

			for (int value : map.values()) {
				if (value != 0) {
					status = false;
					break;
				}
			}

		}
		return status;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println(isAnagramOne("Mother In Law", "Hitler Woman"));
		//
		// System.out.println(isAnagramOne("keEp", "peeK"));
		//
		// System.out.println(isAnagramTwo("SiLeNt CAT", "LisTen AcT"));
		//
		// System.out.println(isAnagramThree("Mother In Law", "Hitler Woman"));
		//
		// System.out.println(isAnagramThree("keEp", "peeK"));

		System.out.println(isAnagramFour("SiLeNt CAT", "LisTen AcT"));

		System.out.println(isAnagramFour("Debit Card", "Bad Credit"));

		System.out.println(isAnagramFour("School MASTER", "The ClassROOM"));

		System.out.println(isAnagramFour("DORMITORY", "Dirty Room"));

		System.out.println(isAnagramFour("ASTRONOMERS", "NO MORE STARS"));

		System.out.println(isAnagramFour("Toss", "Shot"));

		System.out.println(isAnagramFour("joy", "enjoy"));
	}

}
