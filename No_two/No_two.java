package com.java.myAlgorithm;

import java.util.Scanner;
//不要二

/**

 *
 * 二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
 * 对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
 * ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
 * 小易想知道最多可以放多少块蛋糕在网格盒子里。
 */
public class No_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int count = 0;
            if(w%4==0||h%4==0)
                count=w*h/2;
            else if(w%2==0&&h%2==0){
                count=(w*h/4+1)*2;
            }else {
                count=w*h/2+1;
            }
            System.out.println(count);
        }
    }
}