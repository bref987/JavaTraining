package by.epam.javatraining.slutski.firstmaintask.task02.model.logic;

import org.apache.log4j.Logger;

/**
 *
 * @author slutski
 */
public class ArithGeomMeanLogic {

    public static Logger logger = Logger.getRootLogger();

    public static double calcAm(double[] array) {
        int length = array.length;
        double sum = 0;
        double am;

        for (int i = 0; i < length; i++) {
            sum += array[i];
        }

        am = sum / length;
        logger.info("arithmetic mean is " + am);
        return am;
    }

    public static double calcGm(double[] array) {
        int length = array.length;
        double mult = 1;
        double gm;

        for (int i = 0; i < length; i++) {
            mult *= array[i];
        }

        gm = Math.pow(mult, 1.0 / length);
        logger.info("geometric mean is " + gm);
        return gm;
    }
}
