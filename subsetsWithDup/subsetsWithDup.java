package My.leetcode.My;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
//
//说明：解集不能包含重复的子集。
//
//示例:
//
//输入: [1,2,2]
//输出:
//[
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//]
public class subsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        List<Integer> levelList = new ArrayList<>();
        result.add(new ArrayList<>(levelList));
        subsetsWithDupDFS(result, levelList, 0, nums);
        return result;


    }
    private void subsetsWithDupDFS(List<List<Integer>> result, List<Integer> levelList, int depth, int[] nums) {
        for (int i = depth; i < nums.length; i++) {
            if (i > depth && nums[i - 1] == nums[i]) {
                continue;
            }
            levelList.add(nums[i]);
            result.add(new ArrayList<>(levelList));
            subsetsWithDupDFS(result, levelList, i + 1, nums);
            levelList.remove(levelList.size() - 1);
        }
    }
}
