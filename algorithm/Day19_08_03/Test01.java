package com.OJ.Day19_08_03;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            int b[] = new int[n + 1];
            b[0] = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                b[i] = a[i];
            }
            int q = sc.nextInt();
            int x[] = new int[q];
            for (int i = 0; i < q; i++) {
                x[i] = sc.nextInt();
            }
            Arrays.sort(b);
            for (int i = 0; i < q; i++) {
                double p = querry(x[i], a, b, n);
                System.out.printf("%f\n", p);
            }
        }
    }

    private static double querry(int x, int[] a, int b[], int n) {
        int f = a[x];
        int m = 0;
        int i = 1;
        for (; i <= n; i++) {
            if (b[i] <= f) {
                m++;
            }
        }
        double p = (m - 1)/1.00 / n * 100;
        return p;
    }

}
