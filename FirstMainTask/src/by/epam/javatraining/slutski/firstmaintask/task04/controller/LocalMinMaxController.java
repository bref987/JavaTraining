package by.epam.javatraining.slutski.firstmaintask.task04.controller;

import by.epam.javatraining.slutski.firstmaintask.task04.model.logic.LocalMinMaxLogic;

/**
 *
 * @author slutski
 */
public class LocalMinMaxController {
    public static void main(String[] args) {
        double[] array = new double[]{19, 105, 10, 214.5, 18};
        LocalMinMaxLogic.isLocalMax(array);
        LocalMinMaxLogic.isLocalMin(array);
    }
}
