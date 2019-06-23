package com.lanqiao;

import java.util.Scanner;

/**
 * 最近一款吃鸡类型的游戏火爆全球。在组队模式下，
 * 你可以邀请自己的好友组建自己的小队，并选择是否填充（是否同意和非好友游玩），然后加入游戏。
 * 现在有A个单人队伍，B个双人队伍，C个三人队伍，D个四人队伍
 * ，并且全都同意填充，请问最多能组成多少个四人队伍。
 * 队伍不可以将人打散
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            //数据的组数
            int n = reader.nextInt();
            int[][] arr = new int[n][4];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = reader.nextInt();
                }
                reader.nextLine();
            }
            //求值
            int[] res = getRes(arr, n);
            for (int k : res
                    ) {
                System.out.println(+k);
            }

        }
/*        int n = 4;
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {2, 2, 2, 1},
                {0, 2, 0, 1}
        };*/

    }

    private static int[] getRes(int[][] arr, int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = arr[i][3];
            //3 1
            while (arr[i][0] > 0 && arr[i][2] > 0) {
                if (arr[i][2] > 0 && arr[i][0] > 0) {
                    int m = Math.min(arr[i][2], arr[i][0]);
                    temp += m;
                    arr[i][0] -= m;
                    arr[i][2] -= m;
                }
                //2 2
                if (arr[i][1] > 0) {
                    int m1 = arr[i][1] / 2;
                    temp += m1;
                    arr[i][1] -= m1;
                }
                // 2 1 1
                if (arr[i][1] > 0 && arr[i][0] >= 2) {
                    int m3 = arr[i][0] / 2;
                    int m4 = Math.min(arr[i][1], m3);
                    temp += m4;
                    arr[i][1] -= m4;
                    arr[i][0] -= m4 * 2;
                }
                // 1 1 1 1
                if (arr[i][0] >= 4) {
                    int m5 = arr[i][0] / 4;
                    temp += m5;
                    arr[i][0] -= m5;

                }
            }
            res[i] = temp;
        }

        return res;
    }
}
