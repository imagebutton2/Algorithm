package com.OJ.Day19_07_28;

public class RectCover {
    public int RectCover(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        int temp = 0;
        for (int i = 3; i <= target; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
