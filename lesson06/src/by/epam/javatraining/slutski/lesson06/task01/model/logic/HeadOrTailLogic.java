package by.epam.javatraining.slutski.lesson06.task01.model.logic;

import java.util.Random;
/**
 *
 * @author slutski
 */
public class HeadOrTailLogic {
    private static final int RANDOMRANGE = 2;
    
    public static int[] spinCoin(int spinNumber) {
        int head = 0;
        int tail = 0;
        for (int i = 0; i < spinNumber; i++) {
            int spin = new Random().nextInt(RANDOMRANGE);
            if (spin == 0) {
                head += 1;
            } else {
                tail += 1;
            }
        }
        int[] headAndTail = {head, tail};
        return headAndTail;
    }
}

























