package com.gjz.Sort;

import java.util.Arrays;

public class Insertion {

    public static void insertSort(int[] arr) {
        if (arr.length <= 1 || arr == null) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0 && (arr[j] > arr[j - 1]); j--) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }

        }


    }


    public static void main(String[] args) {
        int arr[] = new int[]{4, 9, 8, 3, 4, 5, 6, 2, 1};
        int arr1[] = new int[]{4, 9, 8, 3, 4, 5, 6, 2, 1};
        insertSort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }


}
