package com.lanqiao;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 小白走楼梯的递归算法
 *
 */
public class 递归Demo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("请输入：");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.println(f(a));

    }

    public static int f(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return f(n - 1) + f(n - 2) + f(n - 3);
    }


    @Test
    public  void  test1(){

    }
}
