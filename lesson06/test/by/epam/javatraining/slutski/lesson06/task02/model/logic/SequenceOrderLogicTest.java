package by.epam.javatraining.slutski.lesson06.task02.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class SequenceOrderLogicTest {
    
    public SequenceOrderLogicTest() {
    }

    @Test
    public void testVerifyAscendence() {
        System.out.println("verifyAscendence");
        int number = 1234;
        boolean expResult = true;
        boolean result = SequenceOrderLogic.verifyAscendence(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerifyAscendenceDescend() {
        System.out.println("verifyAscendence");
        int number = 4321;
        boolean expResult = false;
        boolean result = SequenceOrderLogic.verifyAscendence(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerifyAscendenceNegative() {
        System.out.println("verifyAscendence");
        int number = -1234;
        boolean expResult = true;
        boolean result = SequenceOrderLogic.verifyAscendence(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testVerifyDescendence() {
        System.out.println("verifyDescendence");
        int number = 4321;
        boolean expResult = true;
        boolean result = SequenceOrderLogic.verifyDescendence(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerifyDescendenceAscend() {
        System.out.println("verifyDescendence");
        int number = 1234;
        boolean expResult = false;
        boolean result = SequenceOrderLogic.verifyDescendence(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testVerifyDescendenceNegative() {
        System.out.println("verifyDescendence");
        int number = -4321;
        boolean expResult = true;
        boolean result = SequenceOrderLogic.verifyDescendence(number);
        assertEquals(expResult, result);
    }
}
