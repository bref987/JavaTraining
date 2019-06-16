package by.epam.javatraining.slutski.firstmaintask.task03.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class OrderSpeciesLogicTest {

    public OrderSpeciesLogicTest() {
    }

    @Test
    public void testIsOrderedAscTrue() {
        double[] array = {1, 2, 3, 4};
        boolean expResult = true;
        boolean result = OrderSpeciesLogic.isOrdered(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOrderedDescTrue() {
        double[] array = {4, 3, 2, 1};
        boolean expResult = true;
        boolean result = OrderSpeciesLogic.isOrdered(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOrderedAscFalse() {
        double[] array = {4, 3, 2, 1};
        boolean expResult = true;
        boolean result = OrderSpeciesLogic.isOrdered(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOrderedDescFalse() {
        double[] array = {1, 2, 3, 4};
        boolean expResult = true;
        boolean result = OrderSpeciesLogic.isOrdered(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOrderedNegative() {
        double[] array = {-1, -2, -3, -4};
        boolean expResult = true;
        boolean result = OrderSpeciesLogic.isOrdered(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOrderedSameAsc() {
        double[] array = {3, 3, 4, 5};
        boolean expResult = false;
        boolean result = OrderSpeciesLogic.isOrdered(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOrderedSameDesc() {
        double[] array = {3, 3, 2, 1};
        boolean expResult = false;
        boolean result = OrderSpeciesLogic.isOrdered(array);
        assertEquals(expResult, result);
    }

}
