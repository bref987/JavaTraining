package by.epam.javatraining.slutski.firstmaintask.task07.model.logic;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author slutski
 */
public class SortingAlgorithmsLogic {

    public static Logger logger = Logger.getRootLogger();

    public static double[] bubbleSort(double[] array) {
        boolean sorted = false;
        double temp;
        while (!sorted) {
            sorted = true;
            int length = array.length;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        logger.info(Arrays.toString(array));
        return array;
    }

    public static double[] insertionSort(double[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            double current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        logger.info(Arrays.toString(array));
        return array;
    }

    public static double[] selectionSort(double[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            double min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            double temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        logger.info(Arrays.toString(array));
        return array;
    }
}
