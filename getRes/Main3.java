package com.lanqiao;

import java.util.Scanner;

/**
 * 给定一个1到N的排列A1到AN，每次可以将排列的第一个数移到排列的末尾，假设经过若干次移动后得到排列B1到BN，那么|B1-1|+|B2-2|+|B3-3|+...+|BN-N|的最小值是多少？
 * 样例解释
 * 经过两次移动后得到排列{1 5 2 4 3}，此时|B1-1|+|B2-2|+|B3-3|+|B4-4|+|B5-5|取得最小值。
 * 5
 * 4 3 1 5 2
 * 样例输出
 * 6
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            int n = reader.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = reader.nextInt();
            }
            int res = getRes(arr);
            System.out.println(res);
        }
    }

    private static int getRes(int[] arr) {
        int res = 0;
        Math.abs(-2);
        int i = 0;
        int j = 0;


        return res;
    }
}
