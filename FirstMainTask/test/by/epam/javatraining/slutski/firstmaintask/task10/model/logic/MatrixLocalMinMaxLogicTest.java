package by.epam.javatraining.slutski.firstmaintask.task10.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class MatrixLocalMinMaxLogicTest {

    public MatrixLocalMinMaxLogicTest() {
    }

    @Test
    public void testIsLocalMin() {
        int[][] array = {
            {56, 55, 53}, {4, 5, 6}, {7, 8, 9},
            {10, 11, 12}, {13, 184, 15}, {16, 17, 18},
            {19, 20, 21}, {22, 20, 24}, {255, 27, 27, 1, -8}};
        int expResult = 20;
        int result = MatrixLocalMinMaxLogic.isLocalMin(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsLocalMax() {
        int[][] array = {
            {56, 55, 53}, {4, 5, 6}, {7, 8, 9},
            {10, 11, 12}, {13, 184, 15}, {16, 17, 18},
            {19, 20, 21}, {22, 20, 24}, {255, 27, 27, 1, -8}};
        int expResult = 184;
        int result = MatrixLocalMinMaxLogic.isLocalMax(array);
        assertEquals(expResult, result);
    }
    
    @Test (expected = NullPointerException.class)
    public void testIsLocalMaxNull() {
        int[][] array = null;
        int expResult = -1;
        int result = MatrixLocalMinMaxLogic.isLocalMax(array);
        assertEquals(expResult, result);
    }
    
    @Test (expected = NullPointerException.class)
    public void testIsLocalMinNull() {
        int[][] array = null;
        int expResult = -1;
        int result = MatrixLocalMinMaxLogic.isLocalMax(array);
        assertEquals(expResult, result);
    }
   
}
