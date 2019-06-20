package com.Leetcode;

import java.util.HashMap;

/**
 * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 * <p>
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1, 2, 2, 3, 1]
 * 输出: 2
 * 解释:
 * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
 * 连续子数组里面拥有相同度的有如下所示:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * 最短连续子数组[2, 2]的长度为2，所以返回2.
 * 示例 2:
 * <p>
 * 输入: [1,2,2,3,1,4,2]
 * 输出: 6
 */
public class Solution697 {
    public int findShortestSubArray(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, int[]> loacl = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                int[] temp = new int[2];
                temp[0] = i;
                temp[1] = i;
                loacl.put(nums[i], temp);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
                int [] temp = loacl.get(nums[i]);
                temp[1] = i;
                loacl.put(nums[i],temp);
            }


        }
        return 0;
    }
}
