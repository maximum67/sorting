package com.company;

import static com.company.Swapping.swap;

public class BubbleSorting {

    public static void bubbleSorting(int[] array) {

        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    flag = false;
                }
            }
        }

    }
}
