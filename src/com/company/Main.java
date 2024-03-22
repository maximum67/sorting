package com.company;

import java.util.Arrays;

import static com.company.BubbleSorting.bubbleSorting;
import static com.company.SelectionSorting.selectionSorting;

public class Main {

    public static void main(String[] args) {

        int [] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.random()*100);
        }

//        System.out.println(Arrays.toString(array));

        long startTime = System.currentTimeMillis();
//        bubbleSorting(array);
        selectionSorting(array);
        long endTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
            System.out.println("\n");
        }
        System.out.println("\nTime work bubbleSorting " + (endTime - startTime) + " ms");

    }
}
