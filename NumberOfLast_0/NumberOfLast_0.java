package com.java.bit;

import java.util.Scanner;
//末尾0的个数

/**
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 */
public class NumberOfLast_0 {
    public static int getZero(int num){
        return num==0?0:num/5+getZero(num/5);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(getZero(n));
        }
    }
}
