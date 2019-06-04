/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.slutski.lesson06.task05.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class PrimeNumberLogicTest {
    
    public PrimeNumberLogicTest() {
    }

    @Test
    public void testIsPrime() {
        int number = 2;
        boolean expResult = true;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsPrimeAlso() {
        int number = 19;
        boolean expResult = true;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
   @Test
    public void testIsPrimeOneMore() {
        int number = 31;
        boolean expResult = true;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsPrimeMoreAnaMore() {
        int number = 409;
        boolean expResult = true;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsPrimeLastHere() {
        int number = 547;
        boolean expResult = true;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNotPrime() {
        int number = 22;
        boolean expResult = false;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNotPrimeToo() {
        int number = 8;
        boolean expResult = false;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNotPrimeZero() {
        int number = 0;
        boolean expResult = false;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsNotPrimeNegative() {
        int number = -13;
        boolean expResult = false;
        boolean result = PrimeNumberLogic.isPrime(number);
        assertEquals(expResult, result);
    }
    
}
