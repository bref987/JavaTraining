package by.epam.javatraining.slutski.lesson05.task01.model.logic;
/**
 *
 * @author slutski
 */
public class DragonHeadsAndEyes {
    public static int calcHeads(int years) { 
        if (years >= 0) {
            int youngAge           = 199;
            int youngHeadsGrow     = 3;
            int initialHeadsNumber = youngHeadsGrow;
            int youngHeadsNumber   = initialHeadsNumber + youngAge * youngHeadsGrow;
        
            int adultAge           = 299;
            int adultHeadsGrow     = 2;
            int adultHeadsNumber   = youngHeadsNumber 
                                   + (adultAge - youngAge) * adultHeadsGrow;
        
            int oldHeadsGrow       = 1;
        
            if (years <= youngAge) {
                return initialHeadsNumber + years * youngHeadsGrow;
            } else if (years <= adultAge) {
                return youngHeadsNumber + (years - youngAge) * adultHeadsGrow;
            } else {
                return adultHeadsNumber + (years - adultAge) * oldHeadsGrow;
            }
        } else {return 0;}
    }
     
    public static int calcEyes(int years) {
        if (years >= 0) {
            // suppose that there are 2 eyes on 1 dragon head
            int youngAge          = 199;
            int youngEyesGrow     = 6;
            int initialEyesNumber = youngEyesGrow;
            int youngEyesNumber   = initialEyesNumber + youngAge * youngEyesGrow;

            int adultAge          = 299;
            int adultEyesGrow     = 4;
            int adultEyesNumber   = youngEyesNumber 
                                  + (adultAge - youngAge) * adultEyesGrow;

            int oldEyesGrow       = 2;

            if (years <= youngAge) {
                return initialEyesNumber + years * youngEyesGrow;
            } else if (years <= adultAge) {
                return youngEyesNumber + (years - youngAge) * adultEyesGrow;
            } else {
                return adultEyesNumber + (years - adultAge) * oldEyesGrow;
            }
        } else {return 0;}           
    }
}
