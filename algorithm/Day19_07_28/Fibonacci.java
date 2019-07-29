package com.OJ.Day19_07_28;

public class Fibonacci {
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
       // int dp[] = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        dp[2] = 1;
        int before =1;
        int next=1;
        int f=0;
        for (int i = 3; i <= n; i++) {
            f=before+next;
            before=next;
            next=f;
//            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return f;

    }
}
