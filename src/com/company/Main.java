package com.company;

import java.util.Arrays;

import static com.company.BubbleSorting.bubbleSorting;
import static com.company.InsertionSorting.insertionSorting;
import static com.company.SelectionSorting.selectionSorting;

public class Main {

    public static void main(String[] args) {

        int [] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.random()*1000);
        }

//        System.out.println(Arrays.toString(array));

        long startTime = System.currentTimeMillis();
//        bubbleSorting(array);
//        selectionSorting(array);
        insertionSorting(array);
        long endTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//            System.out.print(" ");
        }
        System.out.println("\n");
        System.out.println("Time work  " + (endTime - startTime) + " ms");

    }
}
