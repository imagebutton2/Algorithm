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
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int size;
        List<Integer> temp;
        int i, j, k;
        temp = new ArrayList<Integer>();
        result.add(temp);
        for(i = 0; i < nums.length; i++) {
            size = result.size();
            for(j = 0; j<size; j++) {
                temp = new ArrayList<Integer>();
                if(result.get(j) == null) {
                    temp.add(nums[i]);
                }else {
                    for(k = 0; k<result.get(j).size(); k++) {
                        temp.add(result.get(j).get(k));
                    }
                    temp.add(nums[i]);
                }
                result.add(temp);
            }
        }
        return result;

    }


}
