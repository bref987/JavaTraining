package by.epam.javatraining.slutski.firstmaintask.task04.model.logic;

import org.apache.log4j.Logger;

/**
 * Local min and max vector (array) values
 * @author slutski
 * @version 1.0
 */
public class LocalMinMaxLogic {

    public static Logger logger = Logger.getRootLogger();

    public static double isLocalMin(double[] array) {
        int length = array.length;
        double localMin = -1;

        for (int i = 1; i < length - 1; i++) {
            if (array[i - 1] > array[i] && array[i] < array[i + 1]) {
                localMin = array[i];
                break;
            }
        }
        logger.debug("local min : " + localMin);
        return localMin;
    }

    public static double isLocalMax(double[] array) {
        int length = array.length;
        double localMax = -1;

        for (int i = 1; i < length - 1; i++) {
            if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
                localMax = array[i];
                break;
            }
        }
        logger.debug("local min : " + localMax);
        return localMax;
    }
}
