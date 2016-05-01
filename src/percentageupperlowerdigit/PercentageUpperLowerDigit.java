package percentageupperlowerdigit;

import java.text.DecimalFormat;

public class PercentageUpperLowerDigit {

	public static void characterPercentage(String input) {
		int totalChars = input.length();
		int upperCount = 0, lowerCount = 0, digitCount = 0, otherCount=0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)){
				upperCount++;
			}
			else if(Character.isLowerCase(ch)){
				lowerCount++;
			}
			else if (Character.isDigit(ch)){
				digitCount++;
			}else {
				otherCount++;
			}
		}
		
		double upperPercentage = (upperCount*100.0) / totalChars;
		double lowerPercentage = (lowerCount*100.0) / totalChars;
		double digitPercentage = (digitCount*100.0) / totalChars;
		double otherPercentage = (otherCount*100.0) / totalChars;
		DecimalFormat  format = new DecimalFormat("##.##");
		System.out.println("upperPercentage: "+ format.format(upperPercentage) +" lowerPercentage: "+ format.format(lowerPercentage) +" digitPercentage "+format.format(digitPercentage) +" otherPercentage: "+ format.format(otherPercentage));

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");       

	}

}
