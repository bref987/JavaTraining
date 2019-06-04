package by.epam.javatraining.slutski.lesson06.task01.controller;

import by.epam.javatraining.slutski.lesson06.task01.model.logic.HeadOrTailLogic;
import by.epam.javatraining.slutski.lesson06.task01.view.Printer;

/**
 *
 * @author slutski
 */
public class HeadOrTailSpinner {
    public static void main (String[] args) {
        int spinNumber = 1000;
       
        Printer.print(HeadOrTailLogic.spinCoin(spinNumber));
    }
}
