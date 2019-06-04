package by.epam.javatraining.slutski.lesson06.task02.model.logic;

/**
 *
 * @author slutski
 */
public class SequenceOrderLogic {
    public static boolean verifyAscendence(int number) {
        number = number > 0 ? number : -number;
        int decider = 0;
        int refFirst = number % 10;
        int refSecond;
        number /= 10;
        

        while (number > 0) {          
            refSecond = number % 10;           
            decider = refFirst <= refSecond ? 1 : 0;
            refFirst = refSecond;
            number /= 10;           
        }
        return decider == 0;
    }
    public static boolean verifyDescendence(int number) {
        number = number > 0 ? number : -number;
        int decider = 0;
        int refFirst = number % 10;
        int refSecond;
        number /= 10;
        
        while (number > 0) {          
            refSecond = number % 10;           
            decider = refFirst >= refSecond ? 1 : 0;
            refFirst = refSecond;
            number /= 10;           
        }
        return decider == 0;
    }
}
