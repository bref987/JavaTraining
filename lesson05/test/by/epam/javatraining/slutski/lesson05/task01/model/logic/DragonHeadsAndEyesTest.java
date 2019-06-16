package by.epam.javatraining.slutski.lesson05.task01.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class DragonHeadsAndEyesTest {

    public DragonHeadsAndEyesTest() {
    }

    @Test
    public void testCalcHeadsNegativAge() {
        int years = -20;
        int expResult = 0;
        int result = DragonHeadsAndEyes.calcHeads(years);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcHeadsYoung() {
        int years = 0;
        int expResult = 3;
        int result = DragonHeadsAndEyes.calcHeads(years);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcHeadsAdult() {
        int years = 200;
        int expResult = 602;
        int result = DragonHeadsAndEyes.calcHeads(years);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcHeadsOld() {
        int years = 300;
        int expResult = 801;
        int result = DragonHeadsAndEyes.calcHeads(years);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcEyesNegativAge() {
        int years = -20;
        int eyesNumber = 2;
        int expResult = 0;
        int result = DragonHeadsAndEyes.calcHeads(years) * eyesNumber;
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcEyesYoung() {
        int years = 0;
        int eyesNumber = 2;
        int expResult = 6;
        int result = DragonHeadsAndEyes.calcHeads(years) * eyesNumber;
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcEyesAdult() {
        int years = 200;
        int eyesNumber = 2;
        int expResult = 1204;
        int result = DragonHeadsAndEyes.calcHeads(years) * eyesNumber;
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcEyesOld() {
        int years = 300;
        int eyesNumber = 2;
        int expResult = 1602;
        int result = DragonHeadsAndEyes.calcHeads(years) * eyesNumber;
        assertEquals(expResult, result);
    }
}
