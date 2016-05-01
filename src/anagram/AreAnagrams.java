package anagram;

public class AreAnagrams {

	public static boolean areAnagrams(String a, String b) {
		String copyS1 = a.replace("\\s", "");
		String copyS2 = b.replace("\\s", "");
		boolean status = true;

		if (copyS1.length() != copyS2.length()) {
			status = false;
		} else {

			for (int i = 0; i < copyS1.length(); i++) {
				char ch = copyS1.charAt(i);
				int index = copyS2.indexOf(ch);
				if (index == -1) {
					status = false;
					break;
				} else {
					copyS2 = copyS2.substring(0, index)
							+ copyS2.substring(index + 1);
				}
			}

		}
		if (copyS2.length() == 0 && status == true) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(areAnagrams("momdad", "dadmom"));
	}

}
