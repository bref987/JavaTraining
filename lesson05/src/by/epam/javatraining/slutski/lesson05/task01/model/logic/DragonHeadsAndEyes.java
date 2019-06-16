package by.epam.javatraining.slutski.lesson05.task01.model.logic;

/**
 *
 * @author slutski
 */
public class DragonHeadsAndEyes {

    public static int calcHeads(int years) {
        if (years >= 0) {
            int youngAge = 199;
            int youngHeadsGrow = 3;
            int initialHeadsNumber = youngHeadsGrow;
            int youngHeadsNumber = initialHeadsNumber + youngAge * youngHeadsGrow;

            int adultAge = 299;
            int adultHeadsGrow = 2;
            int adultHeadsNumber = youngHeadsNumber
                    + (adultAge - youngAge) * adultHeadsGrow;

            int oldHeadsGrow = 1;

            if (years <= youngAge) {
                return initialHeadsNumber + years * youngHeadsGrow;
            } else if (years <= adultAge) {
                return youngHeadsNumber + (years - youngAge) * adultHeadsGrow;
            } else {
                return adultHeadsNumber + (years - adultAge) * oldHeadsGrow;
            }
        } else {
            return 0;
        }
    }
}
