package com.lanqiao;

import java.security.Key;
import java.util.*;

/**
 * 题目：编写一个程序来查找数组中的两个数字使得他们的和等于给定值。
 * 例如：给定数组：[2, 4, 3, 5, 7, 8, 9]，给定值：7
 * 输出：2和5，4和3。
 */
public class Main4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 7;
        getRes(arr, target);
    }

    private static void getRes(int[] arr, int target) {
        List<Integer> list = new ArrayList<>(arr.length);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(target - arr[i]) && !map.containsKey(target - arr[i])) {
                map.put(arr[i], target - arr[i]);
            }
        }
        for (int key : map.keySet()) {
            System.out.println(key + "和" + map.get(key));
        }
    }

}
