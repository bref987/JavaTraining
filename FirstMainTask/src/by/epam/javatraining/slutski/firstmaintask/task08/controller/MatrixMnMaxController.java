package by.epam.javatraining.slutski.firstmaintask.task08.controller;

import by.epam.javatraining.slutski.firstmaintask.task08.model.logic.MatrixMinMaxLogic;

/**
 *
 * @author slutski
 */
public class MatrixMnMaxController {

    public static void main(String[] args) {
        int[][] array = {
            {56, 2, 3}, {4, 5, 6}, {7, 8, 9},
            {10, 11, 12}, {13, 14, 15}, {16, 17, 18},
            {19, 20, 21}, {22, 23, 24}, {255, 26, 27, 1, -8}
        };
        
        MatrixMinMaxLogic.isMinMax(array);
    }
}
