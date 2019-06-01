package by.epam.javatraining.slutski.lesson05.task03.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class MoodSensorLogicTest {
    
    public MoodSensorLogicTest() {
    }

    @Test
    public void testDefineMoodZero() {
        int num = 0;
        String expResult = "┌( ͝° ͜ʖ͡°)=ε/̵͇̿̿/’̿’̿ ̿";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodOne() {
        int num = 1;
        String expResult = "(◕‿◕)♡";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodTwo() {
        int num = 2;
        String expResult = "(◕‿◕)";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodThree() {
        int num = 3;
        String expResult = "(⁀ᗢ⁀)";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodFour() {
        int num = 4;
        String expResult = "(ง°ل͜°)ง";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodFive() {
        int num = 5;
        String expResult = "(๑˃ᴗ˂)ﻭ";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodSix() {
        int num = 6;
        String expResult = "(*^‿^*)	";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodSeven() {
        int num = 7;
        String expResult = "(¬‿¬ )";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodEight() {
        int num = 8;
        String expResult = "(´･ᴗ･ ` )";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodNine() {
        int num = 9;
        String expResult = "o( ❛ᴗ❛ )o";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodTen() {
        int num = 10;
        String expResult = "━╤デ╦︻(▀̿̿Ĺ̯̿̿▀̿ ̿)";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodEleven() {
        int num = 11;
        String expResult = "ʕ◉ᴥ◉ʔ";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
    @Test
    public void testDefineMoodOther() {
        int num = 101;
        String expResult = "Human can not feel this range of emotins";
        String result = MoodSensorLogic.defineMood(num);
        assertEquals(expResult, result);
    }
}
