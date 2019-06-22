package com.Leetcode;

import java.awt.font.NumericShaper;
import java.util.*;

/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 * 在真实的面试中遇到过这道题？
 */
public class Solution46 {
    public static void main(String[] args) {

        Solution46 solution46 = new Solution46();
        int[] arr = {1, 1, 3};

        List<List<Integer>> permute = solution46.permute(arr);

        System.out.println(permute);

    }

    public List<List<Integer>> permute(int[] nums) {
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
