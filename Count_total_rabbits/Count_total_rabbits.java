package com.java.bit;

import java.util.Scanner;
//有一只兔子，从出生后第3个月起每个月都生一只兔子，
// 小兔子长到第三个月后每个月又生一只兔子，
// 假如兔子都不死，问每个月的兔子总数为多少？
//斐波那契数列
public class Count_total_rabbits {
    public static int getTotalCount(int monthCount)
    {
        int month1=1;
        int month2=0;
        int month3=0;
        while (--monthCount>0){
            month3+=month2;
            month2=month1;
            month1=month3;
        }
        return month1+month2+month3;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(getTotalCount(n));
        }
    }
}
