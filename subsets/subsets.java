package My.leetcode.My;



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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        generate(0,nums,new ArrayList<>(),result);
        return result;
    }

    private void generate(int i, int[] nums, List<Integer> item, List<List<Integer>> result) {
    if(i>=nums.length) {
        result.add(new ArrayList<>(item));
        return;
    }
    item.add(nums[i]);
    generate(i+1,nums,item,result);
    item.remove(item.size()-1);
    generate(i+1,nums,item,result);
    }

    public static void main(String[] args) {
        int []nums = new int[]{1,2,3};
        subsets subsets=new subsets();
        List<List<Integer>>list= subsets.subsets(nums);
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
