package com.gjz.nowcoder;

public class Solution2 {
    //二维数组的查找 右上角

    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int row = array.length - 1;
        int col = array[0].length - 1;
        int r = 0;
        int c = col;
        while (r <= row && c >= 0) {
            if (target == array[r][c]) {
                return true;
            } else if (target > array[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}
