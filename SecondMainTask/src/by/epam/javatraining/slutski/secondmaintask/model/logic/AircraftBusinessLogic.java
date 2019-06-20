package by.epam.javatraining.slutski.secondmaintask.model.logic;

import org.apache.log4j.Logger;
import by.epam.javatraining.slutski.secondmaintask.controller.AircraftBaseClass;
import static by.epam.javatraining.slutski.secondmaintask.model.sorting.MergeSortLogic.mergeSort;
import java.util.Arrays;

/**
 * AircraftBusinessLogic
 *
 * @author slutski
 * @version 1.0 19/06/2019
 */
public class AircraftBusinessLogic {

    public static Logger logger = Logger.getRootLogger();

    public static AircraftBaseClass[] met(AircraftBaseClass... args) {
        return args;
    }

    public static int isMinDistance(AircraftBaseClass... args) {
        int min = args[0].maxDistance();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            min = min < args[i].maxDistance() ? min : args[i].maxDistance();
        }
        for (int i = 0; i < length; i++) {
            if (args[i].maxDistance() == min) {
                logger.debug(args[i].getModel() + " has a min potential distance " + min);
            }
        }
        return min;
    }

    public static int isMaxDistance(AircraftBaseClass... args) {
        int max = args[0].maxDistance();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            max = max > args[i].maxDistance() ? max : args[i].maxDistance();
        }
        for (int i = 0; i < length; i++) {
            if (args[i].maxDistance() == max) {
                logger.debug(args[i].getModel() + " has a max potential distance " + max);
            }
        }
        return max;
    }

    public static int isMinFuelCapacity(AircraftBaseClass... args) {
        int min = args[0].getFuelCapacity();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            min = min < args[i].getFuelCapacity() ? min : args[i].getFuelCapacity();
        }
        for (int i = 0; i < length; i++) {
            if (args[i].getFuelCapacity() == min) {
                logger.debug(args[i].getModel() + " has a min fuel capacity : " + min);
            }
        }
        return min;
    }

    public static int isMaxFuelCapacity(AircraftBaseClass... args) {
        int max = args[0].getFuelCapacity();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            max = max > args[i].getFuelCapacity() ? max : args[i].getFuelCapacity();
        }
        for (int i = 0; i < length; i++) {
            if (args[i].getFuelCapacity() == max) {
                logger.debug(args[i].getModel() + " has a max fuel capacity : " + max);
            }
        }
        return max;
    }
    
    public static int totalFuelConsumption(AircraftBaseClass... args) {
        int total = 0;
        int length = args.length;
        for (int i = 0; i < length; i++) {
            total += args[i].getFuelConsumption();
        }
        logger.debug("total fuel consumption per hour is " + total);
        return total;
    }
    
    public static int[] sortBySpeed(AircraftBaseClass... args){
        
        int length = args.length;
        int[] speedSorted = new int[length];
        for (int i = 0; i < length; i++) {
            speedSorted[i] = args[i].getSpeed();
        }
        logger.debug(Arrays.toString(speedSorted));
        return mergeSort(speedSorted);  
    }
    
}
