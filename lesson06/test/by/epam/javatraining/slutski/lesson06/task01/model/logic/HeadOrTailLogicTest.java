package by.epam.javatraining.slutski.lesson06.task01.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class HeadOrTailLogicTest {
    
    public HeadOrTailLogicTest() {
    }

    @Test
    public void testSpinCoin() {
        int spinNumber = 0;
        int[] expResult = {0, 0};
        int[] result = HeadOrTailLogic.spinCoin(spinNumber);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testSpinCoinNegative() {
        int spinNumber = -10;
        int[] expResult = {0, 0};
        int[] result = HeadOrTailLogic.spinCoin(spinNumber);
        assertArrayEquals(expResult, result);
    } 
}
