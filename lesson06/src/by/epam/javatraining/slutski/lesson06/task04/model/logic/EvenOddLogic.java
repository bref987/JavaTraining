package by.epam.javatraining.slutski.lesson06.task04.model.logic;

/**
 *
 * @author slutski
 */
public class EvenOddLogic {
    public static boolean verifyEven(int number) {
        number = number > 0 ? number : -number;
        
        while (number > 0) {          
            int ref = number % 10;  
            if (ref % 2 == 1) {
                return false;
            } 
            number /= 10;           
        }
        return true;
    }
}
