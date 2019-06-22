package com.Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,1,2]
 * 输出:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 */
public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        res = getRes(res, nums, 0);
        List list = new ArrayList(res);
         return list;
    }
    private Set<List<Integer>> getRes(Set<List<Integer>> res, int[] nums, int k) {
        if (k == nums.length) {
            List t = new ArrayList();
            for (int i = 0; i < nums.length; i++) {
                t.add(nums[i]);
            }
            res.add(t);
        }
        for (int i = k; i < nums.length; i++) {
            swap(nums, k, i);
            getRes(res, nums, k + 1);
            swap(nums, k, i);
        }
        return res;
    }

    private void swap(int[] nums, int k, int i) {
        int tmp = nums[k];
        nums[k] = nums[i];
        nums[i] = tmp;
    }
}
