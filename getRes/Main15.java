package com.lanqiao.study;
//最大子矩阵
public class Main15 {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
                {-1, -2, -3, -4},
                {-5, 6, 7, 8},
                {-9, -10, -11, -12}
        };
        int max = getMax(arr);

    }
//和一维数组的思路差不多21
    //将每一列都遍历
    private static int getMax(int[][] arr) {
        int max = 0;
        //遍历列
        for (int i = 0; i < arr.length; i++) {
            //从每一列向右边加和下边加，向下变加的时候将每一列的和作为一个元素
            int cn = 0;
            int j = 0;
            while(i + cn < arr.length){
                //将i到cn列的数据纵向相加
                int temp [] = new int[arr[0].length];
                cn ++;
            }

        }
        return max;
    }
}
