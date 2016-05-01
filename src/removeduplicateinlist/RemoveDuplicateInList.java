package removeduplicateinlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateInList {

	public static List<String> removeDuplicate(List<String> input) {

		HashSet<String> set = new HashSet<String>(input);

		return new ArrayList<String>(set);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("J2EE");
		listWithDuplicateElements.add("JSP");
		listWithDuplicateElements.add("SERVLETS");
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("STRUTS");
		listWithDuplicateElements.add("JSP");
		// Printing listWithDuplicateElements
		System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(listWithDuplicateElements);
		List<String> listwithoutDuplicate = removeDuplicate(listWithDuplicateElements);
		System.out.println("ArrayList Without Duplicate Elements :\n"
				+ listwithoutDuplicate);

	}

}
