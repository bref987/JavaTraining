package by.epam.javatraining.slutski.firstmaintask.task05.controller;

import by.epam.javatraining.slutski.firstmaintask.task05.model.logic.SimpleSearchLogic;

/**
 *
 * @author slutski
 */
public class SimpleSearchController {
    public static void main(String[] args) {
        int[] array = new int[] {0, 19, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        SimpleSearchLogic.makeBinarySearch(array, 9);
    }
}
