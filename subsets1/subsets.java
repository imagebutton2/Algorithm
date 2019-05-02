package My.leetcode.My;

import java.util.ArrayList;
import java.util.List;

//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
//
//说明：解集不能包含重复的子集。
//
//示例:
//
//输入: nums = [1,2,3]
//输出:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//]
public class subsets {
   public List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(nums.length == 0){
            return result;
        }

        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }
    public void dfs(int[] s, int index, List<Integer> path, List<List<Integer>> result){
        result.add(new ArrayList<Integer>(path));

        for(int i = index; i < s.length; i++){
            path.add(s[i]);
            System.out.println(path);
            dfs(s, i+1, path, result);
            path.remove(path.size()-1);
        }
    }

}
