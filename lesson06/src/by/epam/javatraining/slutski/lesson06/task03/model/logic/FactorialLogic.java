package by.epam.javatraining.slutski.lesson06.task03.model.logic;

/**
 *
 * @author slutski
 */
public class FactorialLogic {
    public static long calcFactorial(long number) {
        
        long fact = number >= 0 ? 1 : -1; 
        for (long i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
