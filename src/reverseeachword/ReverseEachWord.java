package reverseeachword;

public class ReverseEachWord {
	public static String reverseEachWord(String input) {
		String reverseSting="";
		String[] words = input.split("\\s+");
		
		for (int i = 0; i < words.length; i++) {
			String revWord="";
			for (int j = words[i].length()-1; j >=0 ; j--) {
				revWord +=words[i].charAt(j);
			}
			
			reverseSting +=revWord +" ";
		}
		
		System.out.println(words.length);
		return reverseSting;
	}
	
	public static void main(String[] args) {
		String revStr = reverseEachWord("Java       Concept Of The Day");
		System.out.println("revStr: "+ revStr);
	}

}
