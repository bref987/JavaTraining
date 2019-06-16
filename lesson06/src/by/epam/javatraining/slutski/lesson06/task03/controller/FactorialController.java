/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.slutski.lesson06.task03.controller;

import by.epam.javatraining.slutski.lesson06.task03.model.logic.FactorialLogic;
import by.epam.javatraining.slutski.lesson06.task03.view.Printer;

/**
 *
 * @author slutski
 */
public class FactorialController {
    public static void main(String[] args) {
        long number = 0;
        long factValue = FactorialLogic.calcFactorial(number);
        
        Printer.print(factValue);
    }
}
