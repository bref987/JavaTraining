/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.slutski.lesson06.task05.controller;

import by.epam.javatraining.slutski.lesson06.task05.model.logic.PrimeNumberLogic;
import by.epam.javatraining.slutski.lesson06.task05.view.Printer;

/**
 *
 * @author slutski
 */
public class PrimeNumberController {
    public static void main(String[] args) {
        boolean prime = PrimeNumberLogic.isPrime(13);
        
        Printer.print(prime); 
    }
}
