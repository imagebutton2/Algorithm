package com.java.myAlgorithm;


import java.util.Arrays;
//数组中的第K个最大元素
//在未排序的数组中找到第 k 个最大的元素。
//请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
//采用快速排序 nlogn 时间118ms
public class findKthLargest {
 
    public int findKthLargest(int[] nums, int k) {
        if (nums == null) {
            return Integer.MAX_VALUE;
        }
        if (nums.length < k) {
            return Integer.MAX_VALUE;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums[k - 1];
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int stard = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && stard >= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && stard <= arr[low]) {
                    low++;
                }
                arr[high] = arr[low];
            }
            //把标准数赋给低所在的位置的元素
            arr[low] = stard;
            //处理所有的小的数字
            quickSort(arr, start, low);
            //处理所有的大的数字
            quickSort(arr, low + 1, end);
        }
    }

  
}