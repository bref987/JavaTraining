package by.epam.javatraining.slutski.firstmaintask.task06.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class ReversedArrayLogicTest {

    public ReversedArrayLogicTest() {
    }

    @Test
    public void testReverseArrayEvenLength() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expResult = {6, 5, 4, 3, 2, 1};
        int[] result = ReversedArrayLogic.reverseArray(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testReverseArrayOddLength() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] expResult = {7, 6, 5, 4, 3, 2, 1};
        int[] result = ReversedArrayLogic.reverseArray(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testReverseArrayLengthTwo() {
        int[] array = {1, 2};
        int[] expResult = {2, 1};
        int[] result = ReversedArrayLogic.reverseArray(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testReverseArrayLengthOne() {
        int[] array = {5};
        int[] expResult = {5};
        int[] result = ReversedArrayLogic.reverseArray(array);
        assertArrayEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testReverseArrayNull() {
        int[] array = null;
        int[] expResult = null;
        int[] result = ReversedArrayLogic.reverseArray(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testReverseArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] expResult = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = ReversedArrayLogic.reverseArray(array);
        assertArrayEquals(expResult, result);
    }
}
