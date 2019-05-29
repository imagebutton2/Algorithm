package com.java.bit;

import java.util.Scanner;
//回文解码

/**
 * 现在有一个字符串，你要对这个字符串进行 n 次操作，每次操作给出两个数字：(p, l) 表示当前字符串中从下标为 p 的字符开始的长度为 l 的一个子串。你要将这个子串左右翻转后插在这个子串原来位置的正后方，求最后得到的字符串是什么。字符串的下标是从 0 开始的，你可以从样例中得到更多信息。
 */
public class Palindrome_decoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int begin = sc.nextInt();
                int end = sc.nextInt();
                s=appendReserve(s,begin,end);
            }
            System.out.println(s);
        }
    }
    public static String appendReserve(String s, int begin, int length) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(sb1.substring(begin, begin + length));
        sb2.reverse();
        sb1.insert(begin + length, sb2);
        return sb1.toString();
    }
}
