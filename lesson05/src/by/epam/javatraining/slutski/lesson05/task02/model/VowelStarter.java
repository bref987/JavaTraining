package by.epam.javatraining.slutski.lesson05.task02.model;

import by.epam.javatraining.slutski.lesson05.task02.viewer.Printer;
import by.epam.javatraining.slutski.lesson05.task02.model.logic.VowelChecker;

/**
 *
 * @author slutski
 */
public class VowelStarter {
    public static void main(String[] args) {
        boolean vowels = VowelChecker.findVowel('i');
        Printer.print(vowels);
    }
}
