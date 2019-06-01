package by.epam.javatraining.slutski.lesson05.task03.model.logic;

/**
 *
 * @author slutski
 */
public class MoodSensorLogic {
    public static String defineMood(int num) {
    String mood;    
    switch (num) {
        case 0:  mood = "┌( ͝° ͜ʖ͡°)=ε/̵͇̿̿/’̿’̿ ̿";
                break;
        case 1:  mood = "(◕‿◕)♡";
                break;
        case 2:  mood = "(◕‿◕)";
                break;
        case 3:  mood = "(⁀ᗢ⁀)";
                break;
        case 4:  mood = "(ง°ل͜°)ง";
                break;
        case 5:  mood = "(๑˃ᴗ˂)ﻭ";
                break;
        case 6:  mood = "(*^‿^*)	";
                break;
        case 7:  mood = "(¬‿¬ )";
                break;
        case 8:  mood = "(´･ᴗ･ ` )";
                break;
        case 9: mood = "o( ❛ᴗ❛ )o";
                break;
        case 10: mood = "━╤デ╦︻(▀̿̿Ĺ̯̿̿▀̿ ̿)";
                break;
        case 11: mood = "ʕ◉ᴥ◉ʔ";
                break;
        default: mood = "Human can not feel this range of emotins";
                break;
        }
        return mood;
    }
}
