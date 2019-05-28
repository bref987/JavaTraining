public class MeanValueLogic {
	public static double calcArithmeticMean(int number) {
		double numberLength = 6.0;
		
		int numeral6 = number % 10;
		number /= 10;
		int numeral5 = number % 10;
		number /= 10;
		int numeral4 = number % 10;
		number /= 10;
		int numeral3 = number % 10;
		number /= 10;
		int numeral2 = number % 10;
		number /= 10;
		int numeral1 = number % 10;
		//number /= 10;
		
		return (numeral1 + numeral2 + numeral3 + numeral4 + numeral5 + numeral6) / numberLength;
	}
	public static double calcGeometricMean(int number) {
		double numberLength = 6.0;
		
		int numeral6 = number % 10;
		number /= 10;
		int numeral5 = number % 10;
		number /= 10;
		int numeral4 = number % 10;
		number /= 10;
		int numeral3 = number % 10;
		number /= 10;
		int numeral2 = number % 10;
		number /= 10;
		int numeral1 = number % 10;
		//number /= 10;
		
		return Math.pow(numeral1 * numeral2 * numeral3 * numeral4 * numeral5 * numeral6, 1.0 / numberLength);
	}
}
