package com.gjz.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        if (arr.length <= 1 || arr == null) {
            return;
        }
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                if (!flag) {
                    break;
                }
            }
        }
    }

    void code(int[] arr) {
        if (arr.length <= 1) {
            return;
        } else {
            for (int i = 0; i < arr.length; i++) {
                boolean flag = false;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        flag = true;
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;

                    }
                }
                if (!flag) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 9, 8, 3, 4, 5, 6, 2, 1};
        int arr1[] = new int[]{4, 9, 8, 3, 4, 5, 6, 2, 1};
        bubbleSort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
