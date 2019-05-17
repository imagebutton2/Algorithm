package com.java.myAlgorithm;


import java.util.Arrays;

//数组中的第K个最大元素
//在未排序的数组中找到第 k 个最大的元素。
//请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
//优先队列  11ms
public class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        //开始位置是最后一个非叶子节点，即最后一个节点的父节点
        int start = (nums.length - 1) / 2;
        //调整为大顶堆
        for (int i = start; i >= 0; i--) {
            maxHeap(nums, nums.length, i);
        }
        //先把数组中的第0个和堆中的最后一个数交换位置，再把前面的处理为大顶堆
        for (int i = nums.length - 1; i > 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            maxHeap(nums, i, 0);
        }
        return nums[nums.length - 1 - (k - 1)];
    }

    public static void maxHeap(int[] nums, int size, int index) {

		//左子节点
        int leftNode = 2 * index + 1;
        //右子节点
        int rightNode = 2 * index + 2;
        int max = index;
        //和两个子节点分别对比，找出最大的节点
        if (leftNode < size && nums[leftNode] > nums[max]) {
            max = leftNode;
        }
        if (rightNode < size && nums[rightNode] > nums[max]) {
            max = rightNode;
        }
        //交换位置
        if (max != index) {
            int temp = nums[index];
            nums[index] = nums[max];
            nums[max] = temp;
            //交换位置以后，可能会破坏之前排好的堆，所以，之前的排好的堆需要重新调整
            maxHeap(nums, size, max);
        }


    }

   
}