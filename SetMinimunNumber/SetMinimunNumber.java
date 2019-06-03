package com.java.bit;


import java.util.ArrayList;
import java.util.Scanner;
//组个最小数 (20)
/**
 * 给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小（注意0不能做首位）。例如：
 * 给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
 */
public class SetMinimunNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(sc.nextInt());
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) != 0) {
                    sb.append(i);
                    list.set(i, list.get(i) - 1);
                    break;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != 0) {
                    for (int j = 0; j < list.get(i); j++) {
                        sb.append(i);
                    }
                }
            }
            System.out.println(sb.toString());
        }

    }
}
