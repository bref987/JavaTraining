package by.epam.javatraining.slutski.lesson06.task01.model.logic;

import by.epam.javatraining.slutski.lesson06.task01.view.Printer;
import java.util.Random;
/**
 *
 * @author slutski
 */
public class HeadOrTailLogic {
    public static void spinCoin() {
        int head = 0;
        int tail = 0;
        int spinNumber = 1000;
        for (int i = 0; i < spinNumber; i++) {
            int spin = new Random().nextInt(2);
            if (spin == 0) {
                head += 1;
            } else {
                tail += 1;
            }
        }
        Printer.print(head, tail);
    }
}
