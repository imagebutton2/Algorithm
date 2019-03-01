public class TwoSum{
public static void main(String[] args) {
	Solution sol=new Solution();
	int data[]=new int[]{2,7,11,15};
	int result[]=sol.twoSum(data,9);
	for(int i=0;i<result.length;i++){
	System.out.println(result[i]);
	}
	}
}

class Solution {
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");
	}
}