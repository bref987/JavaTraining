package by.epam.javatraining.slutski.firstmaintask.task05.model.logic;

import org.apache.log4j.Logger;

/**
 * Simple Search : linear search, binary search
 * @author slutski
 * @version 1.1
 */
public class SimpleSearchLogic {

    public static Logger logger = Logger.getRootLogger();

    public static double makeLinearSearch(double[] array, double elem) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == elem) {
                logger.info("index of the element : " + i);
                return i;
            }
        }
        logger.info("element not found");
        return -1;
    }

    public static int makeBinarySearch(int[] array, int elem) {
        // array must be already sorted to make binarySearch
        MergeSortLogic.mergeSort(array);
        
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] == elem) {
                logger.debug("index of the element : " + middleIndex);
                return middleIndex;
            } else if (array[middleIndex] < elem) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > elem) {
                lastIndex = middleIndex - 1;
            }
        }
        logger.debug("element not found");
        return -1;
    }
}
