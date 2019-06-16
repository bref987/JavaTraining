package by.epam.javatraining.slutski.firstmaintask.task03.model.logic;

import org.apache.log4j.Logger;

/**
 * verify array order species : ascendence or descendence never mind 
 * @author slutski
 * @version 1.0
 */
public class OrderSpeciesLogic {

    public static Logger logger = Logger.getRootLogger();

    public static boolean isOrdered(double[] array) {
        int length = array.length;
        boolean orderAsc = true;
        boolean orderDesc = true;

        for (int i = 0; i < length - 1 && (orderAsc == true
                                                   || orderDesc == true); i++) {
            if (array[i] > array[i + 1]) {
                orderAsc = false;
            } else if (array[i] < array[i + 1]) {
                orderDesc = false;
            } else {
                orderDesc = false;
                orderAsc = false;
            }
        }
        logger.info("ascending order : " + orderAsc);
        logger.info("descending order : " + orderDesc);
        logger.info("array is ordered : " + (orderAsc || orderDesc));
        return orderAsc || orderDesc;
    }
}
