package by.epam.javatraining.slutski.firstmaintask.task02.controller;

import by.epam.javatraining.slutski.firstmaintask.task02.model.logic.ArithGeomMeanLogic;

/**
 *
 * @author slutski
 */
public class ArithGeomMeanController {

    public static void main(String[] args) {
        double[] array = new double[]{2, 2, 2, 2, 2};
        ArithGeomMeanLogic.calcAm(array);
        ArithGeomMeanLogic.calcGm(array);
    }
}
