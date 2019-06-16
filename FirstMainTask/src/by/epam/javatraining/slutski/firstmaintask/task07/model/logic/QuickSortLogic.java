package by.epam.javatraining.slutski.firstmaintask.task07.model.logic;

/**
 * Quick sort algorithm 
 * @author slutski
 * @version 1.1
 */
public class QuickSortLogic {

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static int[] quickSort(int[] array, int begin, int end) {
        if (end > begin) {
            int pivot = partition(array, begin, end);
            quickSort(array, begin, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
        return array;
    }
}
