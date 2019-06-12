package by.epam.javatraining.slutski.firstmaintask.task08.model.logic;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author slutski
 */
public class MatrixMinMaxLogic {

    public static Logger logger = Logger.getRootLogger();

    public static int[] isMinMax(int[][] array) {
        int length = array.length;
        int min = array[0][0];
        int max = array[0][0];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                min = min < array[i][j] ? min : array[i][j];
                max = max > array[i][j] ? max : array[i][j];
            }
        }
        int[] minMax = new int[]{min, max};
        logger.info("min and max elements are  " + Arrays.toString(minMax));
        return minMax;
    }


    /*  public static double isMin(double[][] array) {
        int length = array.length;
        double min = array[0][0];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                min = min < array[i][j] ? min : array[i][j];
            }
        }
        logger.info("min element is  " + min);
        return min;
    }

    public static double isMax(double[][] array) {
        int length = array.length;
        double max = array[0][0];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = max > array[i][j] ? max : array[i][j];
            }
        }
        logger.info("min element is  " + max);
        return max;
    }*/
}
