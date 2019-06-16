package by.epam.javatraining.slutski.lesson06.task05.controller;

import by.epam.javatraining.slutski.lesson06.task05.model.logic.PrimeNumberLogic;
import by.epam.javatraining.slutski.lesson06.task05.view.Printer;

/**
 *
 * @author slutski
 */
public class PrimeNumberController {
    public static void main(String[] args) {
        boolean prime = PrimeNumberLogic.isPrime(1);
        
        Printer.print(prime); 
    }
}
