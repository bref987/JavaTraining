package by.epam.javatraining.slutski.lesson06.task03.model.logic;

/**
 *
 * @author slutski
 */
public class FactorialLogic {
    public static long calcFactorial(long number) {
        long fact = 1;
        long multNum = 1;
        while (multNum <= number) {
            fact *= multNum;
            multNum++;
        }
        return fact;
    }
}
