package com.java.bit;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
//大整数的排序
//对N个长度最长可达到1000的数进行排序。
public class Large_Integer_Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            BigInteger[] a = new BigInteger[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextBigInteger();
            }
            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                System.out.println(a[i]);
            }
        }

    }

}
