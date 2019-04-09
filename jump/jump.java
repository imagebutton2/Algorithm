package com.My.leetcode.My;
//给定一个非负整数数组，你最初位于数组的第一个位置。
//数组中的每个元素代表你在该位置可以跳跃的最大长度。
//你的目标是使用最少的跳跃次数到达数组的最后一个位置。
//示例:
//输入: [2,3,1,1,4]
//输出: 2
//解释: 跳到最后一个位置的最小跳跃数是 2。
//     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
public class jump {
    public int jump(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int current_max_index=nums[0];//当前可达到的最远位置
        int pre_max_masx_index=nums[0]+0;//可达到的最远位置
        int jum_min=1;
        for (int i=1;i<nums.length;i++){
            if(i>current_max_index){//如无法再向前移动了，才进行跳跃
                                    //即更新当前可到达的最远位置
                jum_min++;
                current_max_index=pre_max_masx_index;
            }
            if(pre_max_masx_index<nums[i]+i){
                pre_max_masx_index=nums[i]+i;
            }
        }
        return jum_min;
    }
}
