package by.epam.javatraining.slutski.firstmaintask.task08.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class MatrixMinMaxLogicTest {

    public MatrixMinMaxLogicTest() {
    }

    @Test
    public void testIsMinMax() {
        int[][] array = {
            {56, 2, 3}, {4, 5, 6}, {7, 8, 9},
            {10, 11, 12}, {13, 14, 15}, {16, 17, 18},
            {19, 20, 21}, {22, 23, 24}, {25, 26, 27, 1, 8}
        };
        int[] expResult = {1, 56};
        int[] result = MatrixMinMaxLogic.isMinMax(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testIsMinMaxOneAr() {
        int[][] array = {{0}};
        int[] expResult = {0, 0};
        int[] result = MatrixMinMaxLogic.isMinMax(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testIsMinMaxSeveralAr() {
        int[][] array = {
            {-56, -2, -3}, {-4, -5, -6}, {-7, -8, -9},
            {10, -11, 12}, {13, 14, 15}, {16, 17, 18},
            {19, 20, 21}, {-22, 23, 24}, {-256, 26, 27, -1, 0}
        };
        int[] expResult = {-256, 27};
        int[] result = MatrixMinMaxLogic.isMinMax(array);
        assertArrayEquals(expResult, result);
    }
}
