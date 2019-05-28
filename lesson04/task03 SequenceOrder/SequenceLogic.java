public class SequenceLogic {
	
	public static boolean ascendingSequence(int number) {
		int numeral4 = number % 10;
		number /= 10;
		int numeral3 = number % 10;
		number /= 10;
		int numeral2 = number % 10;
		number /= 10;
		int numeral1 = number % 10;
		//number /= 10;
				
		return numeral1 < numeral2 && numeral2 < numeral3 && numeral3 < numeral4;
	}
	public static boolean descendingSequence(int number) {
		int numeral4 = number % 10;
		number /= 10;
		int numeral3 = number % 10;
		number /= 10;
		int numeral2 = number % 10;
		number /= 10;
		int numeral1 = number % 10;
		//number /= 10; 
		
		return numeral1 > numeral2 && numeral2 > numeral3 && numeral3 > numeral4;
	}
}
