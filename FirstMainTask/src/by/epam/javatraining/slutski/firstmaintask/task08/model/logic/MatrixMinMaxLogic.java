package by.epam.javatraining.slutski.firstmaintask.task08.model.logic;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 * Min and Max matrix values 
 * @author slutski
 * @version 1.1
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
        logger.debug("min and max elements are  " + Arrays.toString(minMax));
        return minMax;
    }
}
