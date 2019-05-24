package com.java.myAlgorithm;

import java.util.Arrays;
import java.util.Scanner;
//输入n个整数，输出出现次数大于等于数组长度一半的数。
public class Number_than_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String []nums=str.split(" ");
            int []num=new int[nums.length];
            int i=0;
            for(String j:nums){
                num[i++]=Integer.parseInt(j);
            }
            Arrays.sort(num);
            System.out.println(num[num.length/2-1]);
        }
    }
}
