package com.gjz.dynamic;
//1 1 2 3 5 8 13 21

import java.util.HashMap;

/**
 * 斐波那契数列的三个思路：
 * 1.递归
 * 2.备忘录
 * 3.动态规划
 * @author gjz
 */
public class FibonacciSequence {
    //备忘录算法

    private static HashMap<Integer, Integer> map = new HashMap<>();

    /**
     *
     * @param n 当前number
     * @return
     */
    public static int getNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int value = getNumber(n - 2) + getNumber(n - 1);
            map.put(n, value);
            return value;
        }

    }

    /**
     *
     * @param m 当前number
     * @return
     */
    //动态规划
    public static int getFib(int m) {
        if (m == 1 || m == 2) {
            return 1;
        }

        int before = 1;
        int last = 1;
        int answer = 1;
        for (int i = 3; i <= m; i++) {
            answer = before + last;
            before = last;
            last = answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(getNumber(n));
        System.out.println(getFib(12));
    }
}
