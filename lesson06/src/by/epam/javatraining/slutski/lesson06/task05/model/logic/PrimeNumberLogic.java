package by.epam.javatraining.slutski.lesson06.task05.model.logic;

/**
 *
 * @author slutski
 */
public class PrimeNumberLogic {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        
        double t = Math.sqrt(number);
        for (int i = 2; i < t; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
