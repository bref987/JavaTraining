package by.epam.javatraining.slutski.lesson06.task04.controller;

import by.epam.javatraining.slutski.lesson06.task04.model.logic.EvenOddLogic;
import by.epam.javatraining.slutski.lesson06.task04.view.Printer;

/**
 *
 * @author slutski
 */
public class EvenOddController {
    public static void main(String[] args) {
        int number = 0;
        boolean even = EvenOddLogic.verifyEven(number);
        boolean odd = !EvenOddLogic.verifyEven(number);
        
        Printer.print(even);
        Printer.print(odd);
    }
}
