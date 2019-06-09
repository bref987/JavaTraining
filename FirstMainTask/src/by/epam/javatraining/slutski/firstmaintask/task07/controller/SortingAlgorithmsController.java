package by.epam.javatraining.slutski.firstmaintask.task07.controller;

import by.epam.javatraining.slutski.firstmaintask.task07.model.logic.SortingAlgorithmsLogic;

/**
 *
 * @author slutski
 */
public class SortingAlgorithmsController {
    public static void main(String[] args) {
        double[] array = {5, 6, 1, 3, 7, 2, 9};
        SortingAlgorithmsLogic.bubbleSort(array);
        SortingAlgorithmsLogic.insertionSort(array);
        SortingAlgorithmsLogic.selectionSort(array);
    }
}
