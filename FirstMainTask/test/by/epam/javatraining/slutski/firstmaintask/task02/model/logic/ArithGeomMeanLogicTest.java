package by.epam.javatraining.slutski.firstmaintask.task02.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class ArithGeomMeanLogicTest {

    public ArithGeomMeanLogicTest() {
    }

    @Test
    public void testCalcAm() {
        double[] array = {2, 2, 2, 2, 2};
        double expResult = 2.0;
        double result = ArithGeomMeanLogic.calcAm(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalcGm() {
        double[] array = {2, 2, 2, 2, 2};
        double expResult = 2.0;
        double result = ArithGeomMeanLogic.calcGm(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalcAmZero() {
        double[] array = {0, 2, 2, 2, 2};
        double expResult = 1.6;
        double result = ArithGeomMeanLogic.calcAm(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalcGmZero() {
        double[] array = {0, 2, 2, 2, 2};
        double expResult = 0.0;
        double result = ArithGeomMeanLogic.calcGm(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalcAmNegat() {
        double[] array = {-2, 2, 2, 2, 2};
        double expResult = 1.2;
        double result = ArithGeomMeanLogic.calcAm(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test(expected = AssertionError.class)
    public void testCalcGmNegat() {
        double[] array = {-2, 2, 2, 2, 2};
        double expResult = 0.0;
        double result = ArithGeomMeanLogic.calcAm(array);
        assertEquals(expResult, result, 0.0);
    }

}
