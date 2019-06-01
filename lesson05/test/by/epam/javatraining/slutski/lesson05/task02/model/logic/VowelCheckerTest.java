package by.epam.javatraining.slutski.lesson05.task02.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class VowelCheckerTest {
    
    public VowelCheckerTest() {
    }

    @Test
    public void testFindVowela() {
        System.out.println("findVowel");
        char ch = 'a';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelo() {
        System.out.println("findVowel");
        char ch = 'o';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowele() {
        System.out.println("findVowel");
        char ch = 'e';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVoweli() {
        System.out.println("findVowel");
        char ch = 'i';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelu() {
        System.out.println("findVowel");
        char ch = 'u';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelA() {
        System.out.println("findVowel");
        char ch = 'A';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelO() {
        System.out.println("findVowel");
        char ch = 'O';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelE() {
        System.out.println("findVowel");
        char ch = 'E';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelI() {
        System.out.println("findVowel");
        char ch = 'I';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelU() {
        System.out.println("findVowel");
        char ch = 'U';
        boolean expResult = true;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelF() {
        System.out.println("findVowel");
        char ch = 'F';
        boolean expResult = false;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVoweln() {
        System.out.println("findVowel");
        char ch = 'n';
        boolean expResult = false;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
    @Test
    public void testFindVowelk() {
        System.out.println("findVowel");
        char ch = 'k';
        boolean expResult = false;
        boolean result = VowelChecker.findVowel(ch);
        assertEquals(expResult, result);
    }
}
