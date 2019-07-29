package com.OJ.Day19_07_28;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0 || array == null) {
            return 0;
        }
        if(array.length==1){
            return (array[0]>0?array[0]:0);
        }
        int dp[] = new int[array.length + 1];
        dp[0] = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i <= array.length; i++) {
           if(dp[i-1]>0){
               dp[i]=dp[i-1]+array[i-1];
           }else {
               dp[i]=array[i-1];
           }
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}
