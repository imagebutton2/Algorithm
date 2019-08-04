package com.gjz.Sort;

import java.util.Arrays;

public class Selection {
    public static void selectSort(int arr[]) {
        if (arr.length <= 1 || arr == null) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            if (max != i) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{4, 9, 8, 3, 4, 5, 6, 2, 1};
        int arr1[] = new int[]{4, 9, 8, 3, 4, 5, 6, 2, 1};
       selectSort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
