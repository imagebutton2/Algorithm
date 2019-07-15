package com.gjz.binarysearchnorecursion;

public class BinarySearchNoRecur {

    public static void main(String[] args) {
        //测试
        int[] arr = {1,3, 8, 10, 11, 67, 100};
        int index = binarySearch(arr, 10);
        System.out.println("index=" + index);//
    }

    /**
     * 二分查找的非递归实现
     *
     * @param arr    待查找的数组, arr是升序排序
     * @param target 需要查找的数
     * @return 返回对应下标，-1表示没有找到
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {//mid 对应的数刚好就是目标数
                return mid;
            } else if (arr[mid] > target) {//说明target 在左边
                right = mid - 1;
            } else {
                left = mid + 1;//需要向右边查找
            }
        }

        return -1;
    }
}
