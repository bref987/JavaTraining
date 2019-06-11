/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.slutski.lesson06.task01.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class HeadOrTailLogicTest {

    public HeadOrTailLogicTest() {
    }

    @Test
    public void testSpinCoinHeadZero() {
        int spinNumber = 0;
        int expResult = 0;
        int result = HeadOrTailLogic.spinCoinHead(spinNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testSpinCoinHeadBool() {
        int spinNumber = 10;
        boolean expResult = true;
        int result = HeadOrTailLogic.spinCoinHead(spinNumber);
        assertEquals(expResult, result < spinNumber);
    }

    @Test
    public void testSpinCoinHeadTailBool() {
        int spinNumber = 10;
        boolean expResult = true;
        int result = HeadOrTailLogic.spinCoinHead(spinNumber);
        int tail = spinNumber - result;
        assertEquals(expResult, tail < spinNumber);
    }

}
