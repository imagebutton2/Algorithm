package My.leetcode.My;

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

import java.util.*;

public class subsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result=new HashSet<>();
        result.add(new ArrayList<>());
        generate(0,nums,new ArrayList<>(),result);
        return new ArrayList<>(result);
    }

    private void generate(int i, int[] nums, List<Integer> item,HashSet<List<Integer>> result) {
        if(i>=nums.length) {

            return;
        }
        item.add(nums[i]);
        if(!result.contains(item)){
            result.add(new ArrayList<>(item));
        }
        generate(i+1,nums,item,result);
        item.remove(item.size()-1);
        generate(i+1,nums,item,result);
    }


    public static void main(String[] args) {
        int []nums = new int[]{1,2,2};
        subsetsWithDup subsetsWithDup=new subsetsWithDup();
        List<List<Integer>>list= subsetsWithDup.subsetsWithDup(nums);
        Iterator<List<Integer>> listIterator=list.iterator();
        while (listIterator.hasNext()){
            List<Integer> list1=listIterator.next();
            System.out.print("[");
            for(Integer i:list1){
                System.out.print(i+"、");
            }
            System.out.print("]");
            System.out.println();
        }

    }
}
