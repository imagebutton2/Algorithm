package com.java.bit;

import java.util.Scanner;
//Fibonacci数列

/**
 * Fibonacci数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 * 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 */
public class Fibonacci_nums {

    //F数
    public static void main(String[] args) {
        int f[] = new int[1000];
        f[0] = 0;
        f[1] = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dis = n - f[1];
        if (dis < 0) {
            dis = -dis;
        }
        int i = 2;
        while (true) {
            f[i] = f[i - 1] + f[i - 2];
            int temp = n - f[i];
            if (temp < 0) {
                temp = -temp;
            }
            if (temp > dis) {
                System.out.println(dis);
                return;
            }
            dis = temp;
            i++;
        }
    }
}
