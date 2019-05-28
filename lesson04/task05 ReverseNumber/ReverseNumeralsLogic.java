public class ReverseNumeralsLogic {
	public static int makeReverse(int number) {
		
		int num1 = number % 10 * 1000_000;
		number /= 10;
		int num2 = number % 10 * 100_000;
		number /= 10;
		int num3 = number % 10 * 10_000;
		number /= 10;
		int num4 = number % 10 * 1000;
		number /= 10;
		int num5 = number % 10 * 100;
		number /= 10;
		int num6 = number % 10 * 10;
		number /= 10;
		int num7 = number % 10;
		//number /= 10;

		return  num1 + num2 + num3 + num4 + num5 + num6 + num7;
	}
}
