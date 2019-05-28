public class MeanValue {
	public static void main(String[] args){
	int x = 987654;
	
	double arithmeticMean = MeanValueLogic.calcArithmeticMean(x);
	double geometricMean = MeanValueLogic.calcGeometricMean(x);
	
	System.out.printf("\n Arithmetic mean : %.3f", arithmeticMean);
	System.out.printf("\n Geometric mean : %.3f", geometricMean);
	}
}
