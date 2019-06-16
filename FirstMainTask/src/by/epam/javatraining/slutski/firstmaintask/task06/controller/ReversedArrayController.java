package by.epam.javatraining.slutski.firstmaintask.task06.controller;

import by.epam.javatraining.slutski.firstmaintask.task06.model.logic.ReversedArrayLogic;

/**
 *
 * @author slutski
 */
public class ReversedArrayController {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ReversedArrayLogic.reverseArray(array);
    }
}
