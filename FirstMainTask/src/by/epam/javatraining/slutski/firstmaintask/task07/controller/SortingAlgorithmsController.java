package by.epam.javatraining.slutski.firstmaintask.task07.controller;

import by.epam.javatraining.slutski.firstmaintask.task07.model.logic.SortingAlgorithmsLogic;
import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 *
 * @author slutski
 */
public class SortingAlgorithmsController {
    public static Logger logger = Logger.getRootLogger();
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 1, 3, 8, 7, 2, 9};
        
        SortingAlgorithmsLogic.bubbleSort(array);
        SortingAlgorithmsLogic.insertionSort(array);
        SortingAlgorithmsLogic.selectionSort(array);
        
        int[] arrayMergeSort = SortingAlgorithmsLogic.mergeSort(array);
        logger.info(Arrays.toString(arrayMergeSort));
        
        int[] arrayQuickSort = SortingAlgorithmsLogic.quickSort(array, 0, array.length-1);
        logger.info(Arrays.toString(arrayQuickSort));
    }
}
