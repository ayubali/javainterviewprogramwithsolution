package commonelement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElement {

	public static Set<String> findCommenElements(String[] s1, String[] s2) {
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j]) {
					set.add(s1[i]);
				}
			}
		}
		return set;
	}
	
	public static Set<String> findCommenElementsRetains(String[] s1, String[] s2) {
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(s1));
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(s2));


		set1.retainAll(set2);
		return set1;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};	 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        HashSet<String> set = (HashSet<String>) findCommenElementsRetains(s1, s2);
        
        System.out.println(set);
 

	}

}
