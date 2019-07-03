package com.java.bit;

import java.util.Scanner;
//守形数是这样一种整数，它的平方的低位部分等于它本身。
// 比如25的平方是625，低位部分是25，因此25是一个守形数。 编一个程序，判断N是否为守形数。
// 输出"Yes!”表示N是守形数。
//   输出"No!”表示N不是守形数。
public class Conservative_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String s=in.next();
            int a=Integer.parseInt(s);
            String b=a*a+"";
            b=b.substring(b.length()-s.length(),b.length());
            if(s.equals(b)){
                System.out.println("Yes!");
            }
            else {
                System.out.println("No!");
            }
        }
    }
}
