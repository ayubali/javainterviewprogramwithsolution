package duplicatesharacter;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharCount {

	public static void duplicateCharCount(String input) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Character> keys = charCountMap.keySet();
		System.out.println("duplicate String in:" + input);
		for (Character ch : keys) {
			if (charCountMap.get(ch) > 1) {
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		duplicateCharCount("JavaJ2EE");
		duplicateCharCount("Fresh Fish");
		duplicateCharCount("Better Butter");
	}

}
