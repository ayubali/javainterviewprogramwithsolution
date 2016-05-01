package equalityofarrays;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	public static boolean equalityOfTwoArrayIterative(int[] arr1, int[] arr2) {
		boolean equal = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					equal = false;
				}
			}
		} else {
			equal = false;
		}
		return equal;
	}

	public static boolean ArraysEquals1(String[] arr1, String[] arr2) {
		return Arrays.equals(arr1, arr2);
	}

	public static boolean ArraysEquals2(String[] arr1, String[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	public static boolean ArraysDeepEquals1(String[][] arr1, String[][] arr2) {
		return Arrays.deepEquals(arr1, arr2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};		 
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
		System.out.println(ArraysEquals2(s1,s2));
		
		
		String[][] s11 = { { "java", "swings", "j2ee" },
				{ "struts", "jsp", "hibernate" } };
		String[][] s22= { { "java", "swings", "j2ee" },
				{ "struts", "jsp", "hibernate" } };
		// System.out.println(equalityOfTwoArrayIterative(new int[] { 2, 5, 1,
		// 7,
		// 4 }, new int[] { 2, 5, 1, 7, 4 }));
		System.out.println(ArraysDeepEquals1(s11, s22));

	}

}
