package com.gjz;

import java.math.BigDecimal;
import java.util.Scanner;

//进制转换
public class Hex_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String s = input.nextLine();
            String trans = s.substring(2);
            char a[] = trans.toCharArray();
            int leng = trans.length();
            BigDecimal result = new BigDecimal(0);
            BigDecimal b16 = new BigDecimal(16);
            for (char p : a) {
                leng--;
                if (p >= 'A') {
                    BigDecimal temp = new BigDecimal(p).subtract(new BigDecimal(55));
                    BigDecimal t = temp.multiply(b16.pow(leng));
                    result = result.add(t);
                } else {
                    BigDecimal temp = new BigDecimal(p).subtract(new BigDecimal(48));
                    BigDecimal t = temp.multiply(b16.pow(leng));
                    result = result.add(t);
                }
            }
            System.out.println(result);
        }
    }
}
