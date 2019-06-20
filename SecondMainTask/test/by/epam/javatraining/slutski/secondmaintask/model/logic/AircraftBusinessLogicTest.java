package by.epam.javatraining.slutski.secondmaintask.model.logic;

import by.epam.javatraining.slutski.secondmaintask.controller.AircraftBaseClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class AircraftBusinessLogicTest {
    
    public AircraftBusinessLogicTest() {
    }

    @Test
    public void testMet() {
        System.out.println("met");
        AircraftBaseClass[] args = null;
        AircraftBaseClass[] expResult = null;
        AircraftBaseClass[] result = AircraftBusinessLogic.met(args);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsMinDistance() {
        System.out.println("isMinDistance");
        AircraftBaseClass[] args = null;
        int expResult = 0;
        int result = AircraftBusinessLogic.isMinDistance(args);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsMaxDistance() {
        System.out.println("isMaxDistance");
        AircraftBaseClass[] args = null;
        int expResult = 0;
        int result = AircraftBusinessLogic.isMaxDistance(args);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsMinFuelCapacity() {
        System.out.println("isMinFuelCapacity");
        AircraftBaseClass[] args = null;
        int expResult = 0;
        int result = AircraftBusinessLogic.isMinFuelCapacity(args);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsMaxFuelCapacity() {
        System.out.println("isMaxFuelCapacity");
        AircraftBaseClass[] args = null;
        int expResult = 0;
        int result = AircraftBusinessLogic.isMaxFuelCapacity(args);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTotalFuelConsumption() {
        System.out.println("totalFuelConsumption");
        AircraftBaseClass[] args = null;
        int expResult = 0;
        int result = AircraftBusinessLogic.totalFuelConsumption(args);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSortBySpeed() {
        System.out.println("sortBySpeed");
        AircraftBaseClass[] args = null;
        int[] expResult = null;
        int[] result = AircraftBusinessLogic.sortBySpeed(args);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
