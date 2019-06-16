package by.epam.javatraining.slutski.lesson06.task03.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class FactorialLogicTest {

    public FactorialLogicTest() {
    }

    @Test
    public void testCalcFactorialFive() {
        long number = 5L;
        long expResult = 120L;
        long result = FactorialLogic.calcFactorial(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcFactorialEight() {
        long number = 8L;
        long expResult = 40320L;
        long result = FactorialLogic.calcFactorial(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcFactorialTen() {
        long number = 10L;
        long expResult = 3628800L;
        long result = FactorialLogic.calcFactorial(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcFactorialNegative() {
        long number = -10;
        long expResult = -1;
        long result = FactorialLogic.calcFactorial(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcFactorialZero() {
        long number = 0;
        long expResult = 1;
        long result = FactorialLogic.calcFactorial(number);
        assertEquals(expResult, result);
    }

}
