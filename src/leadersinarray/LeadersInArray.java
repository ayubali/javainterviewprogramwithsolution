package leadersinarray;

public class LeadersInArray {

	public static void findTheLeaders(int[] inputArray) {
		int max = inputArray[inputArray.length - 1];

		System.out.println("Leaders: ");
		System.out.print(max + " ");
		for (int i = inputArray.length - 2; i >= 0; i--) {
			if (inputArray[i] > max) {
				System.out.print(inputArray[i] + " ");
				max = inputArray[i];
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
		 
	     findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});

	}

}
