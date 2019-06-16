package by.epam.javatraining.slutski.firstmaintask.task06.model.logic;

import java.util.Arrays;
import org.apache.log4j.Logger;

/**
 * method to reverse array elements
 * @author slutski
 * @version 1.1
 */
public class ReversedArrayLogic {

    public static Logger logger = Logger.getRootLogger();

    public static int[] reverseArray(int[] array) {
        int length = array.length;
        int temp;
        for (int i = 0; i < length / 2 && length > 1; i++) {
            temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        logger.debug(Arrays.toString(array));
        return array;
    }
}
