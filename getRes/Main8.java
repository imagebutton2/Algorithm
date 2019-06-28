package com.lanqiao.study;


import java.util.*;
//求元素的子集
public class Main8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // 1 2 3 12 13 23 123
//        Set<Set<Integer>> res = getRes(arr, 3, 3 - 1);
        //List<List<Integer>> r = new ArrayList<>((Collection<? extends ArrayList<Integer>>) res);
        List<List<Integer>> subsets = subsets(arr);
        System.out.println(subsets);
    }

    public List<List<Integer>> getRes(int[] arr, int n) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = (int) Math.pow(2, n) - 1; i > 0; i--) {
            List<Integer> s = new ArrayList<>();
            for (int j = n - 1; j >= 0; j--) {
                if (((i >> j) & 1) == 1) {
                    s.add(arr[j]);
                }

            }
            res.add(s);
        }

        return res;
    }

    //递归
    private static Set<Set<Integer>> getRes(int[] arr, int n, int cur) {
        Set<Set<Integer>> newSet = new HashSet<>();
        //判断中止条件
        if (cur == 0) {
            Set<Integer> nil = new HashSet<>();
            //空和第一个元素
            Set<Integer> first = new HashSet<>();
            newSet.add(nil);
            newSet.add(first);
            return newSet;
        }
        Set<Set<Integer>> oldSet = getRes(arr, n, cur - 1);
        //对于每一个子集选择加还是不加
        for (Set<Integer> set : oldSet) {
            //不加当前元素
            newSet.add(set);
            //加当前元素
            HashSet<Integer> clone = (HashSet<Integer>) ((HashSet) set).clone();
            clone.add(arr[cur]);
            newSet.add(clone);
        }
        return newSet;
    }

    //    使用非递归的的代码
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();// 最后输出的结果
        int n = nums.length;
        if (n == 0)
            return ret;
        ret.add(new ArrayList<Integer>());// 初始化 初始化为空，代表空集
        for (int i : nums) {
            List<Integer> tmp;//放第二层的list
            List<List<Integer>> ttmp = new ArrayList<>();//，第一层list，放之前的list加上新的之后的list
            for (List<Integer> j : ret) {
                tmp = new ArrayList<>(j);
                tmp.add(i);
                ttmp.add(tmp);
            }
            ret.addAll(ttmp);//将新的生成的所有添加到ret中
        }
        return ret;
    }
}
