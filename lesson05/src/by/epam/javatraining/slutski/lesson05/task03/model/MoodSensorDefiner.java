package by.epam.javatraining.slutski.lesson05.task03.model;

import  java.util.Random; 
import by.epam.javatraining.slutski.lesson05.task03.viewer.Printer;
import by.epam.javatraining.slutski.lesson05.task03.model.logic.MoodSensorLogic;

/**
 *
 * @author slutski
 */
public class MoodSensorDefiner {
    public static void main(String[] args) {
    int rn = new Random().nextInt(12);  
    String show = MoodSensorLogic.defineMood(rn);
    Printer.print(show);
    }
}
