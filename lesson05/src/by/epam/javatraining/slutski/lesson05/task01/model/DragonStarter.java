package by.epam.javatraining.slutski.lesson05.task01.model;

import by.epam.javatraining.slutski.lesson05.task01.model.logic.DragonHeadsAndEyes;
import by.epam.javatraining.slutski.lesson05.task01.viewer.Printer;

/**
 *
 * @author slutski
 */
public class DragonStarter {
        public static void main(String[] args){
        int heads = DragonHeadsAndEyes.calcHeads(50);
        int eyes  = DragonHeadsAndEyes.calcEyes(50);
        Printer.print(heads);
        Printer.print(eyes);
    }
}
