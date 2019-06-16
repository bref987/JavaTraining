package by.epam.javatraining.slutski.firstmaintask.task02.model.logic;

import org.apache.log4j.Logger;

/**
 * Arithmetic and Geometric means search methods 
 * @author slutski
 * @version 1.0
 */
public class ArithGeomMeanLogic {

    public static Logger logger = Logger.getRootLogger();

    public static double calcArithMean(double[] array) {
        int length = array.length;
        double sum = 0;
        double am;

        for (int i = 0; i < length; i++) {
            sum += array[i];
        }

        am = sum / length;
        logger.debug("arithmetic mean is " + am);
        return am;
    }

    public static double calcGeomMean(double[] array) {
        int length = array.length;
        double mult = 1;
        double gm;

        for (int i = 0; i < length; i++) {
            if (array[i] < 0) {
                logger.debug("error: geometric mean can not be specified "
                        + "for negative values");
                return -1;
            }
            mult *= array[i];
        }

        gm = Math.pow(mult, 1.0 / length);
        logger.debug("geometric mean is " + gm);
        return gm;
    }
}
