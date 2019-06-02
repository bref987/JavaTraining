package by.epam.javatraining.slutski.lesson06.task04.model.logic;

/**
 *
 * @author slutski
 */
public class EvenOddLogic {
    public static boolean verifyEven(int number) {
        number = number > 0 ? number : -number;
        int decider = 0;
        int ref;
                
        while (number > 0) {          
            ref = number % 10;  
            if (ref % 2 == 1) {
                decider = 1;
            } 
            number /= 10;           
        }
        return decider == 0;
    }
    public static boolean verifyOdd(int number) {
        number = number > 0 ? number : -number;
        int decider = 0;
        int ref;
                
        while (number > 0) {          
            ref = number % 10;  
            if (ref % 2 == 0) {
                decider = 1;
            } 
            number /= 10;           
        }
        return decider == 0;
    }
}
