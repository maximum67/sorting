package com.company;

import static com.company.Swapping.swap;

public class InsertionSorting {

    public static void insertionSorting(int[] array){

        int index;
        for (int i = 1; i < array.length; i++) {
            index = i;
            for (int j = i; j > 0; j--) {
                if(array[index]<array[j-1]){
                    swap(array, index, j-1);
                    index = j-1;
                }else{
                    break;
                }
            }
        }
    }
}
