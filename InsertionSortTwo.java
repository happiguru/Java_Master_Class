package com.java24hours;

import java.util.Arrays;

class InsertionSortTwo {
    void insertionSortTwo(int array[]) {
        int array_size = array.length;

        for (int step = 1; step < array_size; step++ ) {
            int compare_key = array[step];
            int position = step -1;

            while (position >= 0 && compare_key < array[position]) {
                array[position + 1] = array[position];
                --position;
            }
            array[position + 1] = compare_key;
        }
    }

    public static  void  main(String[] args){
        int[] data = {9, 5, 1, 4, 3 };
        InsertionSortTwo is = new InsertionSortTwo();
        is.insertionSortTwo(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
