package com.java.myAlgorithm;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 *
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 */

public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer>list1=new HashSet<>();
        ArrayList <Integer>list2=new ArrayList<>();

        for(int i:nums1){
            list1.add(i);
        }
        for (int i:nums2){
            if(list1.contains(i)){
                list2.add(i);
                list1.remove(i);
            }
        }
        int res[]=new int[list2.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list2.get(i);
        }
        return res;
    }
}
