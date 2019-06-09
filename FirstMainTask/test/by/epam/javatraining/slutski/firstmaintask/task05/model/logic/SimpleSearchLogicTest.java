package by.epam.javatraining.slutski.firstmaintask.task05.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class SimpleSearchLogicTest {

    public SimpleSearchLogicTest() {
    }

    @Test
    public void testMakeLinearSearch() {
        double[] array = {1, 2, 3, 4.0, 5, 6, 7, 8, 9, 10};
        double elem = 1.0;
        double expResult = 0.0;
        double result = SimpleSearchLogic.makeLinearSearch(array, elem);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMakeLinearSearchNotSorted() {
        double[] array = {1, 2, 89, 4.0, 5, 6, 7, 8, 9, 10};
        double elem = 89.0;
        double expResult = 2.0;
        double result = SimpleSearchLogic.makeLinearSearch(array, elem);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMakeLinearSearchNotSortedEnd() {
        double[] array = {1, 2, 3, 4.0, 5, 6, 7, 8, 99, 10};
        double elem = 99.0;
        double expResult = 8.0;
        double result = SimpleSearchLogic.makeLinearSearch(array, elem);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMakeLinearSearchReversed() {
        double[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        double elem = 7.0;
        double expResult = 3.0;
        double result = SimpleSearchLogic.makeLinearSearch(array, elem);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMakeLinearSearchNotFound() {
        double[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        double elem = 79.0;
        double expResult = -1.0;
        double result = SimpleSearchLogic.makeLinearSearch(array, elem);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMakeBinarySearchFirstElem() {
        double[] array = {0, 1, 2, 3, 4.0, 5, 6, 7, 8, 9, 10};
        double elem = 0.0;
        int expResult = 0;
        int result = SimpleSearchLogic.makeBinarySearch(array, elem);
        assertEquals(expResult, result);
    }

    @Test
    public void testMakeBinarySearchSecondElem() {
        double[] array = {0, 1, 2, 3, 4.0, 5, 6, 7, 8, 9, 10};
        double elem = 1.0;
        int expResult = 1;
        int result = SimpleSearchLogic.makeBinarySearch(array, elem);
        assertEquals(expResult, result);
    }

    @Test
    public void testMakeBinarySearchThirdElem() {
        double[] array = {0, 1, 2, 3, 4.0, 5, 6, 7, 8, 9, 10};
        double elem = 2.0;
        int expResult = 2;
        int result = SimpleSearchLogic.makeBinarySearch(array, elem);
        assertEquals(expResult, result);
    }

    @Test
    public void testMakeBinarySearchFourthElem() {
        double[] array = {0, 1, 2, 3, 4.0, 5, 6, 7, 8, 9, 10};
        double elem = 3.0;
        int expResult = 3;
        int result = SimpleSearchLogic.makeBinarySearch(array, elem);
        assertEquals(expResult, result);
    }

    @Test
    public void testMakeBinaryNotFound() {
        double[] array = {0, 1, 2, 3, 4.0, 5, 6, 7, 8, 9, 10};
        double elem = 33.0;
        int expResult = -1;
        int result = SimpleSearchLogic.makeBinarySearch(array, elem);
        assertEquals(expResult, result);
    }
}
