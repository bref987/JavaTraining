package by.epam.javatraining.slutski.lesson06.task02.controller;

import by.epam.javatraining.slutski.lesson06.task02.view.Printer;
import by.epam.javatraining.slutski.lesson06.task02.model.logic.SequenceOrderLogic;

/**
 *
 * @author slutski
 */
public class SequenceOrderController {
    public static void main(String [] args) {
        int number = 987654;
        boolean asc = SequenceOrderLogic.verifyAscendence(number);
        boolean des = SequenceOrderLogic.verifyDescendence(number);
        
        Printer.print(asc);
        Printer.print(des);
    }
}
