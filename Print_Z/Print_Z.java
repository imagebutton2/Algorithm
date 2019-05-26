package com.lanqiao.study;

import org.junit.Before;
import org.junit.Test;

//打印z形状矩阵
public class Print_Z {
    int[][] arr;

    @Before
    public void init() {
        arr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
    }

    //1 2
    public void printArr() {
        int row = 0, cel = 0;
        int rn = arr.length, cn = arr[0].length;
        //只能向右走为true，只能向左走为false，初始是从左向右
        boolean lor = true;
        while (row < rn && cel < cn) {
            //只能向右边走
            if (lor) {
                System.out.print(arr[row][cel] + "\t");
                if (row == 0 && cel < cn) {
                    cel++;
                    //改变方向
                    lor = !lor;
                    continue;
                } else if (row == cn - 1 && cel < cn) {
                    cel++;
                    continue;
                } else if (cel == cn - 1&& row < rn) {
                    row ++;
                    lor = !lor;
                } else {
                    row--;
                    cel++;
                    continue;
                }

            } else {
                //只能向左边走
                System.out.print(arr[row][cel] + "\t");
                if (cel == 0 && row < rn) {
                    row++;
                    //靠到左边的边界上了
                    lor = !lor;
                    continue;
                } else if (row == rn - 1 && cel < cn) {
                    cel++;
                    lor = !lor;
                    continue;
                } else {
                    row++;
                    cel--;
                }

            }

        }

    }

    @Test
    public void test() {
        printArr();
    }
}
