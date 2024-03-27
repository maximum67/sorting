package com.company;

import java.util.Arrays;

import static com.company.BubbleSorting.bubbleSorting;
import static com.company.InsertionSorting.insertionSorting;
import static com.company.QuickSorting.quickSorting;
import static com.company.SelectionSorting.selectionSorting;

public class Main {

    public static void main(String[] args) {

        int capacity = 100000;
        int [] array = new int[capacity];
        int[] arr1 = new int[capacity];
        int[] arr2 = new int[capacity];
        int[] arr3 = new int[capacity];
        int[] arr4 = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            arr1[i]=arr2[i]=arr3[i]=arr4[i]=array[i]=(int) (Math.random()*100);
        }

//        System.out.println(Arrays.toString(arr4));

        System.out.println("Пузырьковая сортировка");
        measureTime(()-> bubbleSorting(arr1));
        System.out.println("\n");

        System.out.println("Сортировка выбором");
        measureTime(()-> selectionSorting(arr2));
        System.out.println("\n");

        System.out.println("Сортировка вставкой");
        measureTime(()->  insertionSorting(arr3));
        System.out.println("\n");

        System.out.println("Быстрая сортировка");
        measureTime(()->  quickSorting(arr4));
        System.out.println("\n");

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//            System.out.print(" ");
//        }

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));
//        System.out.println(Arrays.toString(array));

    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения " + (endTime - startTime) + " мсек");

    }

}