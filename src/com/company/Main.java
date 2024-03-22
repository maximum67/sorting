package com.company;

import java.util.Arrays;

import static com.company.BubbleSorting.bubbleSorting;

public class Main {

    public static void main(String[] args) {

        int [] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.random()*1000);
        }

//        System.out.println(Arrays.toString(array));

        long startTime = System.currentTimeMillis();
        bubbleSorting(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Time work bubbleSorting " + (endTime - startTime) + " ms");



    }
}
