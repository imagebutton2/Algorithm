package com.java.myAlgorithm;

import java.util.Scanner;
//最小公倍数
/**
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 */
public class least_common_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                int t = a;
                a = b;
                b = t;
            }

            int x = a;
            int y = b;
            int p = 0;
            if(x%y==0)
                System.out.println(x);
            else {
                int m=x%y;
                while (m!=0){
                    x=y;
                    y=m;
                    m=x%y;
                }
                p=y;
            }
            System.out.println((a*b)/p);
        }
    }
}