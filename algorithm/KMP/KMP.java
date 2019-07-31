package com.gjz.kmp;

import java.util.Arrays;

public class KMP {
    public int[] prefixTable(char[] pattern, int n) {
        //从第一个字符开始
        int i = 1;
        int[] prefix = new int[n];
        //初始化
        prefix[0] = 0;
        //prefix 从0开始
        int len = 0;
        while (i < n) {
            if (pattern[len] == pattern[i]) {
                len++;
                prefix[i++] = len;
            } else {
                if (len > 0) {
                    len = prefix[len - 1];
                } else {//len=0
                    prefix[i] = len;
                    i++;
                }
            }

        }
        return prefix;
    }

    public int[] movePrefixTable(char[] pattern, int n) {
        int[] prefix = prefixTable(pattern, n);
        System.out.println(Arrays.toString(prefix));
        int[] move = new int[n];
        System.arraycopy(prefix, 0, move, 1, n - 1);
        move[0] = -1;
        return move;
    }

    public void kmpSearch(String s, char[] pattern) {
        int i = 0;
        int j = 0;
        int[] next = movePrefixTable(pattern, pattern.length);
        while (i < s.length()) {
            if (j == pattern.length - 1 && s.charAt(i) == pattern[j]) {
                System.out.println("found :" + (i - j));
                j = next[j];
            }
            if (s.charAt(i) == pattern[j]) {
                i++;
                j++;
            } else {
                j = next[j];
                if (j == -1) {
                    i++;
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] pattern = "ABABCABAA".toCharArray();
        String s="ABABABCABAAASDASDASD";
//        int[] next = new KMP().movePrefixTable(pattern, pattern.length);
        new KMP().kmpSearch(s,pattern);
    }
}
