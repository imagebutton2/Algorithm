package com.lanqiao.study;
//判断数字的回文串
public class  Main13{
    public static void main(String[] args) {

        isReverse();
    }
//判断四位数是否是回文串
    //ijji
    private static void isReverse() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i * 1000 + j * 100 + j * 10 + i);
            }

        }
    }

}
