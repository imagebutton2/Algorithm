package com.java.bit;

//另类加法

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class UnusualAdd {
    public int addAB(int A, int B) {
        int a = A^B;
        int b = A&B;//获取进位位
        int c = b<<1;
        if(b!=0) {
            int end = addAB(a, c);
            a=end;
        }
        return a;
    }

    public static void main(String[] args) {
        UnusualAdd add=new UnusualAdd();
        System.out.println(add.addAB(1,2));
    }
}
