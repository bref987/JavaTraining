public class RingAreaLogic {
	// x - radius1, y - radius2, x > y
	public static double calcRingArea(double x, double y) {
		// S = Pi * R^2, delta S = S1 - S2 = Pi * (R1^2 - R2^2)
		return Math.PI * (x * x - y * y);     
	}
}
