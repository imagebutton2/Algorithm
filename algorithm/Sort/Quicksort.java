package com.gjz.Sort;

import java.util.Arrays;

public class Quicksort {
    public static void quickSort1(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int p = partition1(arr, i, j);
        quickSort1(arr, i, p - 1);
        quickSort1(arr, p + 1, j);
    }

    private static int partition1(int[] arr, int i, int j) {
        int randomIndex = (int) (Math.random() * (j - i + 1) + i);
        swap(arr,i,randomIndex);
        int standard = arr[i];
        int left = i;
        for (int right = i + 1; right <= j; right++) {
            if (arr[right] < standard) {
                int temp = arr[left];
                swap(arr, left + 1, right);
                left++;
            }

        }
        swap(arr, i, left);
        return left;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {
        int arr[] = new int[]{4, 9, 8, 3, 4, 5, 6, 2, 1};
        int arr1[] = new int[]{4, 9, 8, 3, 4, 5, 6, 2, 1};
        quickSort1(arr, 0, arr.length - 1);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }


}
