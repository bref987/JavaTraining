package by.epam.javatraining.slutski.lesson05.task01.model;

import by.epam.javatraining.slutski.lesson05.task01.model.logic.DragonHeadsAndEyes;
import by.epam.javatraining.slutski.lesson05.task01.viewer.Printer;

/**
 *
 * @author slutski
 */
public class DragonStarter {

    public static void main(String[] args) {
        int years = 50;
        int eyesNumber = 3;

        int heads = DragonHeadsAndEyes.calcHeads(years);
        int eyes = DragonHeadsAndEyes.calcHeads(years) * eyesNumber;
        Printer.print(heads);
        Printer.print(eyes);
    }
}
