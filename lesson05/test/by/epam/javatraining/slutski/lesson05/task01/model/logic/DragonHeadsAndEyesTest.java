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
        System.out.println("calcHeads");
        int years = -20;
        int expResult = 0;
        int result = DragonHeadsAndEyes.calcHeads(years);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcHeadsYoung() {
        System.out.println("calcHeads");
        int years = 0;
        int expResult = 3;
        int result = DragonHeadsAndEyes.calcHeads(years);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcHeadsAdult() {
        System.out.println("calcHeads");
        int years = 200;
        int expResult = 602;
        int result = DragonHeadsAndEyes.calcHeads(years);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcHeadsOld() {
        System.out.println("calcHeads");
        int years = 300;
        int expResult = 801;
        int result = DragonHeadsAndEyes.calcHeads(years);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcEyesNegativAge() {
        System.out.println("calcEyes");
        int years = -20;
        int expResult = 0;
        int result = DragonHeadsAndEyes.calcEyes(years);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcEyesYoung() {
        System.out.println("calcEyes");
        int years = 0;
        int expResult = 6;
        int result = DragonHeadsAndEyes.calcEyes(years);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcEyesAdult() {
        System.out.println("calcEyes");
        int years = 200;
        int expResult = 1204;
        int result = DragonHeadsAndEyes.calcEyes(years);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcEyesOld() {
        System.out.println("calcEyes");
        int years = 300;
        int expResult = 1602;
        int result = DragonHeadsAndEyes.calcEyes(years);
        assertEquals(expResult, result);
    }
}
