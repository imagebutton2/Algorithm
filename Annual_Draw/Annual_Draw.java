package com.java.bit;

import java.util.Scanner;
//年会抽奖
//今年公司年会的奖品特别给力，但获奖的规矩却很奇葩：
//1. 首先，所有人员都将一张写有自己名字的字条放入抽奖箱中；
//2. 待所有字条加入完毕，每人从箱中取一个字条；
//3. 如果抽到的字条上写的就是自己的名字，那么“恭喜你，中奖了！”
//现在告诉你参加晚会的人数，请你计算有多少概率会出现无人获奖？

public class Annual_Draw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n=in.nextInt();
            float result=(fun(n)/factorial(n))*100;
            System.out.println(String.format("%.2f", result)+"%");
        }
    }
    public  static float fun(int n){

        if(n==1){
            //n=1的时候返回0
            return 0;
        }
        else if(n==2){
            //n=2的时候返回1
            return 1;
        }else {
            return (n - 1) * (fun(n - 1) + fun(n - 2));
        }
    }


    public static float factorial(int num) {
        float result = 1;
        if(num==0){
            return 1;
        }else if (num > 0) {
            result = num * factorial(num - 1);
        }
        return result;
    }
}
