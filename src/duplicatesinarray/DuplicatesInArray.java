package duplicatesinarray;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void findDuplicateBourForce(String[] strArray) {

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j] && i != j) {
					System.out.println("duplicate element is : " + strArray[i]);
				}
			}
		}
	}

	public static void findDuplicateSet(String[] strArray) {
		Set<String> set = new HashSet<String>();
		for (String string : strArray) {
			if(!set.add(string)){
				System.out.println("duplicate element is : " + string);
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findDuplicateSet(new String[] { "abc", "def", "mno", "xyz",
				"pqr", "xyz" });

	}

}
