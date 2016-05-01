package trigonometricfunctions;

public class TrigonometricFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double angle = 90;
		double angleRadians = Math.toRadians(angle);
		
		double sineOfNumber = Math.sin(angleRadians);
		double cosineOfNumber = Math.cos(angleRadians);
		double tangenOfNumber = Math.tan(angleRadians);

		double secOfNumber = (1 / sineOfNumber);
		double cosecOfNumber = (1 / cosineOfNumber);
		double cotOfNumber = (1 / tangenOfNumber);

		
		System.out.println("sin("+angle+") = "+sineOfNumber);
        System.out.println("cos("+angle+") = "+cosineOfNumber);
        System.out.println("tan("+angle+") = "+tangenOfNumber);
 
        System.out.println("--------------------------------");
 
        System.out.println("sec("+angle+") = "+secOfNumber);
        System.out.println("cosec("+angle+") = "+cosecOfNumber);
        System.out.println("cot("+angle+") = "+cotOfNumber);
	}

}
