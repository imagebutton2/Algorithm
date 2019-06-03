package com.java.bit;
//尼科彻斯定理

import java.util.Scanner;
/**
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * 例如：
 * 1^3=1
 * 2^3=3+5
 * 3^3=7+9+11
 * 4^3=13+15+17+19
 */
public class GetSequeOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int i=n-1;
            StringBuilder sb=new StringBuilder();
            if(n==1){
                System.out.println(1);
            }else {
                int k=n*n-i;
                for(int j=0;j<n;j++){
                    sb.append(k);
                    if(j<n-1){
                        sb.append("+");
                    }
                    k+=2;
                }
                System.out.println(sb.toString());
            }
        }
    }
}
