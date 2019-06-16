/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.slutski.lesson06.task04.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class EvenOddLogicTest {

    public EvenOddLogicTest() {
    }

    @Test
    public void testVerifyEven() {
        int number = 2468;
        boolean expResult = true;
        boolean result = EvenOddLogic.verifyEven(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testVerifyEvenOdd() {
        int number = 13579;
        boolean expResult = false;
        boolean result = EvenOddLogic.verifyEven(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testVerifyEvenNegative() {
        int number = -2468;
        boolean expResult = true;
        boolean result = EvenOddLogic.verifyEven(number);
        assertEquals(expResult, result);
    }

    @Test
    public void testVerifyZero() {
        int number = 0;
        boolean expResult = true;
        boolean result = EvenOddLogic.verifyEven(number);
        assertEquals(expResult, result);
    }

}
