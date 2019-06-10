package by.epam.javatraining.slutski.firstmaintask.task07.model.logic;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author slutski
 */
public class SortingAlgorithmsLogic {

    public static Logger logger = Logger.getRootLogger();

    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
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

    public static int[] insertionSort(int[] array) {
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
        logger.info(Arrays.toString(array));
        return array;
    }

    public static int[] selectionSort(int[] array) {
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
        logger.info(Arrays.toString(array));
        return array;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
        //logger.info(Arrays.toString(array));
        return array;
    }

    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i = 0;
        int j = 0;

        for (int k = 0; k < result.length; k++) {
            if (j >= right.length || (i < left.length && left[i] <= right[j])) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
        }
    }

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static int[] quickSort(int[] array, int begin, int end) {
        if (end > begin) {
            int pivot = partition(array, begin, end);
            quickSort(array, begin, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
        //logger.info(Arrays.toString(array));
        return array;
    }
}
