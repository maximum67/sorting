package com.company;

import static com.company.Swapping.swap;

public class SelectionSorting {

    public static void selectionSorting(int[] arr) {

        int indexMin;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[indexMin] > arr[j]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                swap(arr, indexMin, i);
            }

        }

    }
}
