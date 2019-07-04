package com.java.bit;

import java.util.Scanner;
//数字和为sum的方法数
//给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
//当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。
public class numer_sum_sum {

    public static long bag(int []weight,int n,int sum){
        long dp[]=new long[sum+1];
        dp[0]=1;
        int i,j;
        for(i=0;i<n;i++){
            for(j=sum;j>=weight[i];j--){
                dp[j]=dp[j-weight[i]]+dp[j];
            }
        }
        return dp[sum];
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=s.nextInt();
        int i,j;
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(bag(arr,n,sum));
    }
}
