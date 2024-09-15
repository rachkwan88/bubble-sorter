package com.example;

public class Sorter {
    public int[] bubble_sort(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - i; j++) {
                if (j + 1 < array1.length) {
                    if (array1[j] > array1[j + 1]) {
                        int temp = array1[j];
                        array1[j] = array1[j + 1];
                        array1[j + 1] = temp;
                    }
                }
            }
        }
        return array1;
    }
}