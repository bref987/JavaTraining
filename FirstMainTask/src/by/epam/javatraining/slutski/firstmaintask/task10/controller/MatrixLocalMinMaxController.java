package by.epam.javatraining.slutski.firstmaintask.task10.controller;

import by.epam.javatraining.slutski.firstmaintask.task10.model.logic.MatrixLocalMinMaxLogic;

/**
 *
 * @author slutski
 */
public class MatrixLocalMinMaxController {

    public static void main(String[] args) {
        int[][] array = {
            {56, 55, 53}, {4, 5, 6}, {7, 8, 9},
            {10, 11, 12}, {13, 184, 15}, {16, 17, 18},
            {19, 20, 21}, {22, 20, 24}, {255, 27, 27, 1, -8}
        };
        MatrixLocalMinMaxLogic.isLocalMin(array);
        MatrixLocalMinMaxLogic.isLocalMax(array);
    }
}
