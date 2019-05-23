package com.java.bit;

import java.util.Scanner;
//买苹果

/**
 * 链接：https://www.nowcoder.com/questionTerminal/61cfbb2e62104bc8aa3da5d44d38a6ef
 * 来源：牛客网
 *
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 * 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。
 * 如果不能购买恰好n个苹果，小易将不会购买。
 */
public class Buy_Apple {
  public static int  maxPackages(int num){
        if(num%2!=0)
            return -1;

        int count=0;
        int mul;
        int remains;
      if (num % 8 == 0) {
          count += num / 8;
          return count;
      } else {
          mul=num/8;
          remains=num%8;
          count+=mul;
          num=num%8;
          while (mul>=0){
              if(num%6==0){
                  count+=num/6;
                  return count;
              } else {
                  mul--;
                  count--;
                  num=num+8;
              }

          }
          return -1;
      }




    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(maxPackages(n));

    }
}
