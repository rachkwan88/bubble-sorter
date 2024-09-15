package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Sorter sorter = new Sorter();
        int[] sorter1 = sorter.bubble_sort(new int[] { 3, 1, 2 });
        int[] expected = { 1, 2, 3 };
        for (int i = 0; i < expected.length; i++) {
            assertTrue(sorter1[i] == expected[i]);
        }

        int[] sorter2 = sorter.bubble_sort(new int[] { 4, 2, 3, 1 });
        int[] expected2 = { 1, 2, 3, 4 };
        for (int i = 0; i < expected.length; i++) {
            assertTrue(sorter2[i] == expected2[i]);
        }

        int[] sorter3 = sorter.bubble_sort(new int[] { 2, 1, 0, -1 });
        int[] expected3 = { -1, 0, 1, 2 };
        for (int i = 0; i < expected.length; i++) {
            assertTrue(sorter3[i] == expected3[i]);
        }
    }
}
