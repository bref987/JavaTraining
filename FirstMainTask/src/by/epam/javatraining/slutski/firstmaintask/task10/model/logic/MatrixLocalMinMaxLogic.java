package by.epam.javatraining.slutski.firstmaintask.task10.model.logic;

import static by.epam.javatraining.slutski.firstmaintask.task04.model.logic.LocalMinMaxLogic.logger;

/**
 *
 * @author slutski
 */
public class MatrixLocalMinMaxLogic {

    public static int isLocalMin(int[][] array) {
        int length = array.length;
        int localMin = -1;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j - 1] > array[i][j]
                        && array[i][j] < array[i][j + 1]) {
                    localMin = array[i][j];
                    break;
                }
            }
        }
        logger.info("local min : " + localMin);
        return localMin;
    }

    public static int isLocalMax(int[][] array) {
        int length = array.length;
        int localMax = -1;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j - 1] < array[i][j]
                        && array[i][j] > array[i][j + 1]) {
                    localMax = array[i][j];
                    break;
                }
            }
        }
        logger.info("local max : " + localMax);
        return localMax;
    }
}
