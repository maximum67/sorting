package com.company;

import java.util.Arrays;

import static com.company.Swapping.swap;


public class QuickSorting {

    public static void quickSorting(int[] array){

        mainMetod(array, 0, array.length-1);

    }

     private static void mainMetod(int[] arr, int leftIndex, int rightIndex){


        if (leftIndex<rightIndex){
            int divider = partition(arr,leftIndex,rightIndex);
            mainMetod(arr,leftIndex,divider-1);
            mainMetod(arr,divider,rightIndex);

        }
     }

     private static int partition(int[] arr, int from, int to) {

        int leftIndex = from;
        int rightIndex = to;
        int divider = arr[from+(to-from)/2];
        while (leftIndex<=rightIndex) {
            while (arr[leftIndex] < divider) {
                leftIndex++;
            }
            while (arr[rightIndex] > divider) {
                rightIndex--;
            }
            if(leftIndex<=rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
         return leftIndex;
     }


}
