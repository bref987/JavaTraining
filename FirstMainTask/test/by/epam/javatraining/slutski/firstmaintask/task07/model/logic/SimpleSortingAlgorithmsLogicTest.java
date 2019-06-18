/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.slutski.firstmaintask.task07.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slutski
 */
public class SimpleSortingAlgorithmsLogicTest {

    public SimpleSortingAlgorithmsLogicTest() {
    }

    @Test
    public void testBubbleSort() {
        int[] array = {5, 4, 6, 1, 3, 8, 7, 2, 9};
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SimpleSortingAlgorithmsLogic.bubbleSort(array);
        int[] result = expResult;
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testInsertionSort() {
        int[] array = {5, 4, 6, 1, 3, 8, 7, 2, 9};
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SimpleSortingAlgorithmsLogic.insertionSort(array);
        int[] result = expResult;
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSelectionSort() {
        int[] array = {5, 4, 6, 1, 3, 8, 7, 2, 9};
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SimpleSortingAlgorithmsLogic.selectionSort(array);
        int[] result = expResult;
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testMergeSort() {
        int[] array = {5, 4, 6, 1, 3, 8, 7, 2, 9};
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = MergeSortLogic.mergeSort(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testQuickSort() {
        int[] array = {5, 4, 6, 1, 3, 8, 7, 2, 9};
        int begin = 0;
        int end = array.length - 1;
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = QuickSortLogic.quickSort(array, begin, end);
        assertArrayEquals(expResult, result);
    }
}
