
package by.epam.javatraining.slutski.lesson05.task02.model.logic;

/**
 *
 * @author slutski
 */
public class VowelChecker {
    public static boolean findVowel(char ch) {
        char[] vowels = {'a', 'o', 'e', 'i', 'u'};
        boolean finder = false;
        
        for (int i = 0; i < vowels.length; i++) {
            if (Character.toLowerCase(vowels[i]) == ch) {
                finder = true; 
            }
        }
        return finder;
    }  
}
