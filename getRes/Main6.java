package com.lanqiao;

import java.util.Scanner;
//无人机
/**
 * 4 6
 * GRRGGGGGGRFFFFRGGFFGRRFF
 */
public class  Main6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int i = 0, j = 0;
        boolean flag = true;
        char[][] arr = new char[m][n];
        System.out.println("m = " + m + ",n= " + n);
        int z = 0;
        int length = str.length();
        if (m < 0 || n < 0) {
            System.out.println("Incorrect mesh size");
            return;
        }
        if (length != m * n) {
            System.out.println("Data mismatch");
            return;
        }
        while (z < length) {
            char temp = str.charAt(z);
            if (temp != 'R' && temp != 'G' && temp != 'F') {
                System.out.println("Invalid cell type");
                return;
            }
            //只可以向右边移动
            if (flag) {
                if (j < n) {
                    arr[i][j++] = temp;
                    z++;
                    continue;
                } else {
                    flag = !flag;
                    i++;
                    //多家一次
                    j--;
                    continue;
                }
            }
            //只可以向左边移动
            if (!flag) {
                if (j >= 0) {
                    arr[i][j--] = temp;
                    z++;
                    continue;
                } else {
                    flag = !flag;
                    i++;
                    //多减一次
                    j++;
                    continue;
                }
            }

        }
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(arr[k][l] + "\t");
            }
            System.out.println();
        }
    }
}
