package by.epam.javatraining.slutski.firstmaintask.task01.controller;

import by.epam.javatraining.slutski.firstmaintask.task01.model.logic.VectorMinMaxLogic;

/**
 *
 * @author slutski
 */
public class VectorMinMaxController {

    public static void main(String[] args) {
        double[] array = new double[]{1256, 1, -94568, 4, 5};
        VectorMinMaxLogic.isMin(array);
        VectorMinMaxLogic.isMax(array);
    }
}
