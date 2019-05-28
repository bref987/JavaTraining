public class SidesEquality {
	public static void main(String[] args){
		double x = 10.0;
		double y = 10.1;
		double z = 10.0;
		
		boolean equality = SidesEqualityLogic.verifySidesEquality(x, y, z);
		boolean inequality = SidesEqualityLogic.veritySidesInequality(x, y, z);
		
		System.out.printf("Sides are equal: %b", equality);
		System.out.printf("\nSides are inequal: %b", inequality);
	}
}
