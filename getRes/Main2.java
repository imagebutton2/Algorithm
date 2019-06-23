package com.lanqiao;

import java.util.Scanner;
/**
 * 给定一个长度为N的序列A1到AN，现在要对序列进行M次操作，
 * 每次操作对序列的前若干项进行升序或降序排列，求经过这M次操作后得到的序列。
 * 1 2 4 3
 * 1 3
 * 0 2
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
/*        while (reader.hasNextInt()) {
            //数的多少
            int N = reader.nextInt();
            int[] arr = new int[N];
            //多少次排序
            int M = reader.nextInt();
            int[][] p = new int[M][2];
            for (int i = 0; i < N; i++) {
                arr[i] = reader.nextInt();
            }
            for (int i = 0; i < M; i++) {
                p[i][0] = reader.nextInt();
                p[i][1] = reader.nextInt();
            }
        }*/
        int[] arr = {1 ,2, 4 ,3};
        int[][] p ={
                {1,3},
                {0,2}
        };
        int [] res = getRes(arr,p);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");

        }
    }

    private static int[] getRes(int[] arr, int[][] p) {
        for (int i = 0; i < p.length; i++) {
            if (p[i][0] == 1) {
                //降序
                int index = p[i][1];
                desort(index, arr);
            } else {
                //升序
                int index = p[i][1];
                insort(index, arr);
            }
        }
        return arr;
    }

    private static void insort(int index, int[] arr) {
        for (int i = 0; i < index - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < index - 1 - i; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    private static void desort(int index, int[] arr) {
        for (int i = 0; i < index - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < index - 1 - i; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
