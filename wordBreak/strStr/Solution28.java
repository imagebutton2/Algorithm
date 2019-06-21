package com.Leetcode;

public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0) {
            return 0;
        }
//        KMP的实现步骤；
        /**
         *1.根据给出的字符串求得到其中的前缀数组
         */
        int[] prefix = getPrefix(needle);
//        将数组向后移动一位
        int[] move_prefix = movePrefix(prefix);
//        i = hay 's index ,j = needle 's index
        int i = 0, j = 0, m = haystack.length(), n = needle.length();
        while (i < m) {
            if (j == n - 1 && haystack.charAt(i) == needle.charAt(j)) {
                return i - j;
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = move_prefix[j];
                if (j == -1) {
                    i++;
                    j++;
                }
            }
        }
        return -1;
    }

    private int[] movePrefix(int[] prefix) {
        int[] res = new int[prefix.length + 1];
        for (int i = 0; i < res.length; i++) {
            res[i + 1] = prefix[i];
        }
        res[0] = -1;
        return res;
    }

    /**
     * 求最长公共前后缀
     * 使用动态规划的方式
     * 每次查看字符的时候都从上次的公共前后缀得到当前的数字
     *
     * @param needle
     * @return
     */
    private int[] getPrefix(String needle) {
        int n = needle.length() + 1;
        int[] prefix = new int[n];
        prefix[0] = 0;
//        设置比较长度为0
        int len = 0;
        int i = 1;
        while (i < n) {
//            如果匹配成功，就将len++，也就是匹配的长度字符串加一
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                prefix[i] = len;
                i++;
            } else {
//                没有匹配上的就将prefix的坐标向左边移动一位
                if (len > 0)
                    len = prefix[len - 1];
                else
//               此时len = 0
                    prefix[i] = len;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int i = solution28.strStr("hello", "ll");
        System.out.println("i = " + i);


    }
}
