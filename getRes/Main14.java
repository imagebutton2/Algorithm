package com.lanqiao.study;

import java.util.HashMap;
import java.util.Map;
//无重复长度的最长子段
public class  Main14{
    public static void main(String[] args) {
//        int afgaaa = lengthOfLongestSubstring("aapsgvaaaaaa");
//        System.out.println(afgaaa);
        String s = "abcdefghljk";
        System.out.println(s.substring(0, 0));

        Map map = new HashMap();
    }

    public static int lengthOfLongestSubstring(String s) {
        //使用双指针
        int i = 0, j = i + 1;
        int length = s.length();
        int max = 1;
        while (i < length && j < length) {
            if (nonre(i, j, s)) {
                j++;
                max = Math.max(j - i, max);
            } else {
                i++;
                j = i + 1;
            }
        }
        return max;
    }

    private static boolean nonre(int i, int j, String s) {
        for (int k = i; k < j; k++) {
            if (s.charAt(k) == s.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
