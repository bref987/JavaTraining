package by.epam.javatraining.slutski.firstmaintask.task01.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class VectorMinMaxLogicTest {

    public VectorMinMaxLogicTest() {
    }

    @Test
    public void testIsMin() {
        double[] array = {1, 2, 3, 4, 5};
        double expResult = 1.0;
        double result = VectorMinMaxLogic.isMin(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsMax() {
        double[] array = {1, 2, 3, 4, 5};
        double expResult = 5.0;
        double result = VectorMinMaxLogic.isMax(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsMinNegat() {
        double[] array = {-1, -2, -3, -4, -5};
        double expResult = -5.0;
        double result = VectorMinMaxLogic.isMin(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsMaxNegat() {
        double[] array = {-1, -2, -3, -4, -5};
        double expResult = -1.0;
        double result = VectorMinMaxLogic.isMax(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsMinZero() {
        double[] array = {0};
        double expResult = 0.0;
        double result = VectorMinMaxLogic.isMin(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsMaxZero() {
        double[] array = {0};
        double expResult = 0.0;
        double result = VectorMinMaxLogic.isMax(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testIsMaxNull() {
        double[] array = null;
        double expResult = 0.0;
        double result = VectorMinMaxLogic.isMax(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testIsMinNull() {
        double[] array = null;
        double expResult = 0.0;
        double result = VectorMinMaxLogic.isMin(array);
        assertEquals(expResult, result, 0.0);
    }
}
