package by.epam.javatraining.slutski.firstmaintask.task01.controller;

import by.epam.javatraining.slutski.firstmaintask.task01.model.logic.MinMaxLogic;

/**
 *
 * @author slutski
 */
public class MinMaxController {

    public static void main(String[] args) {
        double[] array = new double[]{1256, 1, -94568, 4, 5};
        MinMaxLogic.isMin(array);
        MinMaxLogic.isMax(array);
    }
}
