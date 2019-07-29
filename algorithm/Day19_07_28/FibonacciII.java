package com.OJ.Day19_07_28;

public class FibonacciII {
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        int temp = 0;
        for(int i=3; i<=n; i++){
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
