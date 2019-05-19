package com.java.myAlgorithm;


import java.util.*;

//给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
//candidates 中的每个数字在每个组合中只能使用一次。
//
//说明：
//
//    所有数字（包括目标数）都是正整数。
//    解集不能包含重复的组合。
//输入: candidates = [10,1,2,7,6,1,5], target = 8,
//所求解集为:
//[
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
//]
public class combinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
         List<Integer> item=new ArrayList<>();

        Set <Integer> set=new HashSet<>();
        Arrays.sort(candidates);
        generate(0,candidates,result,item,set,0,target);
        return result;
    }

    private void generate(int i, int[] candidates, List<List<Integer>> result, List<Integer> item, Set<Integer> set, int sum, int target) {
        if (i > candidates.length || sum > target)
            return;
        sum += candidates[i];
        item.remove(candidates[i]);
        if (target == sum && set.containsAll(item)) {


        }

    }

}
