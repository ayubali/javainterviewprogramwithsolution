package countcharoccurance;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {
	public static Map<Character, Integer> countCharacterOccureance(String input) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] strArray = input.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			if (map.containsKey(strArray[i])) {
				map.put(strArray[i], map.get(strArray[i]) + 1);
			} else {
				map.put(strArray[i], 1);
			}
		}
		return map;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Character, Integer> map = (HashMap<Character, Integer>) countCharacterOccureance("Java J2EE Java JSP J2EE");
		System.out.println("map: "+ map);

	}

}
