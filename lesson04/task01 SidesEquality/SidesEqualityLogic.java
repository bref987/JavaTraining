class SidesEqualityLogic {
	// x, y, z - Triangle sides
	
	public static boolean verifySidesEquality(double x, double y, double z) {
		return x == y && y == z;
	}
	public static boolean veritySidesInequality(double x, double y, double z) {
		return x != y || x != z || z != y;
	}
}
