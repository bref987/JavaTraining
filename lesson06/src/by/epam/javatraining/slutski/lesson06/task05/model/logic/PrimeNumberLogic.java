/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.slutski.lesson06.task05.model.logic;

/**
 *
 * @author slutski
 */
public class PrimeNumberLogic {
    public static boolean isPrime(int number) {
        if (number > 0) {
            int decider = 0; 
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                     decider += 1;
                }
            }
            return decider == 0; 
        } else {
           return false; 
        }  
    }
}
