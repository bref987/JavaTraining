package by.epam.javatraining.slutski.firstmaintask.task07.model.logic;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 * Sorting algorithms : bubble sort, insertion sort, selection sort
 *
 * @author slutski version 1.1
 */
public class SimpleSortingAlgorithmsLogic {

    public static Logger logger = Logger.getRootLogger();

    public static void bubbleSort(int[] array) {
        boolean sorted = true;
        int temp;
        while (sorted) {
            sorted = false;
            int length = array.length;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = true;
                }
            }
            length -= 1;
        }
        logger.debug(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        logger.debug(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        logger.debug(Arrays.toString(array));
    }
}
