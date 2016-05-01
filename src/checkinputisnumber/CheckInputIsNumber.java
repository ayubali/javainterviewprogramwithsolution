package checkinputisnumber;

public class CheckInputIsNumber {

	public static boolean numberOrNot(String input) {
		try {
			int number = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println(numberOrNot("5555"));

	}

}
