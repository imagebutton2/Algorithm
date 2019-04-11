package com.My.leetcode.My;
//如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为摆动序列。
// 第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。
//例如， [1,7,4,9,2,5] 是一个摆动序列，因为差值 (6,-3,5,-7,3) 是正负交替出现的。
// 相反, [1,4,7,2,5] 和 [1,7,4,5,5] 不是摆动序列，第一个序列是因为它的前两个差值都是正数，
// 第二个序列是因为它的最后一个差值为零。
//给定一个整数序列，返回作为摆动序列的最长子序列的长度。
// 通过从原始序列中删除一些（也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。

//三个状态begin、up、down //0 ;1; -1;


public class wiggleMaxLength {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int flag = 0;
        int max_length = 1;

        for (int i = 1; i < nums.length; i++) {
            switch (flag) {
                case 0: {
                    if (nums[i - 1] > nums[i]) {
                        flag = -1;
                        max_length++;

                    } else if(nums[i-1]<nums[i]){
                        flag = 1;
                        max_length++;
                    }
                    break;
                }
                case 1: {
                    if(nums[i-1]>nums[i]){
                        flag=-1;
                        max_length++;
                    }

                    break;
                }
                case -1: {
                    if(nums[i-1]<nums[i]){
                        flag=1;
                        max_length++;
                    }

                    break;
                }
            }
        }
        return max_length;

    }
}
