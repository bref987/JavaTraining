package by.epam.javatraining.slutski.firstmaintask.task01.model.logic;

import org.apache.log4j.Logger;

/**
 * Min and Max vector (array) values searching  
 * @author slutski
 * @version 1.0
 */
public class VectorMinMaxLogic {

    public static Logger logger = Logger.getRootLogger();

    public static double isMin(double[] array) {
        int length = array.length;
        double min = array[0];

        for (int i = 1; i < length; i++) {
            min = min < array[i] ? min : array[i];
        }
        logger.debug("min element is  " + min);
        return min;
    }

    public static double isMax(double[] array) {
        int length = array.length;
        double max = array[0];

        for (int i = 1; i < length; i++) {
            max = max > array[i] ? max : array[i];
        }
        logger.debug("max element is " + max);
        return max;
    }
}
