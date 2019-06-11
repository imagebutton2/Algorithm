package com.java.bit;

import java.math.BigInteger;
import java.util.Scanner;

public class LongIntadd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            BigInteger sum = new BigInteger(a);
            BigInteger sum1 = new BigInteger(b);
            BigInteger res = sum.add(sum1);
            System.out.println(res);
        }
    }
}
