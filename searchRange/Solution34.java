package com.Leetcode;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 */
public class Solution34 {
    /**
     * 使用二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {

        int left = binarySerch(nums, target);
        int right = binarySerch(nums, target + 1) - 1;
        if (nums[left] != target || left == nums.length) {
            return new int[]{-1, -1};

        } else {
            return new int[]{left, Math.max(left, right)};
        }
    }

    private int binarySerch(int[] nums, int target) {
        int l = 0, h = nums.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] >= target) {
                h = mid;

            } else {
                l = mid;
            }
        }

        return l;
    }
}
