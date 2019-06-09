/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.slutski.firstmaintask.task04.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class LocalMinMaxLogicTest {

    public LocalMinMaxLogicTest() {
    }

    @Test
    public void testIsLocalMinZero() {
        double[] array = {0};
        double expResult = -1.0;
        double result = LocalMinMaxLogic.isLocalMin(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMaxZero() {
        double[] array = {0};
        double expResult = -1.0;
        double result = LocalMinMaxLogic.isLocalMax(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMinLenghtOfTwo() {
        double[] array = {1, 2};
        double expResult = -1.0;
        double result = LocalMinMaxLogic.isLocalMin(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMaxLengthOfTwo() {
        double[] array = {1, 2};
        double expResult = -1.0;
        double result = LocalMinMaxLogic.isLocalMax(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMinEqual() {
        double[] array = {2, 2, 2};
        double expResult = -1.0;
        double result = LocalMinMaxLogic.isLocalMin(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMaxEqual() {
        double[] array = {2, 2, 2};
        double expResult = -1.0;
        double result = LocalMinMaxLogic.isLocalMax(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMinSeveralMin() {
        double[] array = {10, 2, 8, 1, 0};
        double expResult = 2.0;
        double result = LocalMinMaxLogic.isLocalMin(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMaxSeveralMax() {
        double[] array = {10, 12, 8, 14, 0};
        double expResult = 12.0;
        double result = LocalMinMaxLogic.isLocalMax(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMin() {
        double[] array = {10, 2, 2, 8, 0};
        double expResult = -1.0;
        double result = LocalMinMaxLogic.isLocalMin(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIsLocalMax() {
        double[] array = {10, 12, 12, 14, 16};
        double expResult = -1.0;
        double result = LocalMinMaxLogic.isLocalMax(array);
        assertEquals(expResult, result, 0.0);
    }
}
