public class SequenceOrder {
	public static void main(String[] args){
	int x = 9876;
	
	boolean ascendence = SequenceLogic.ascendingSequence(x);
	boolean descendence = SequenceLogic.descendingSequence(x);
	
	System.out.printf("Number sequence order is ascending : %b", ascendence);
	System.out.printf("\nNumber sequence order is descending : %b", descendence);
	}
}
