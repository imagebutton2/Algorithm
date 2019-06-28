package com.lanqiao.study;

import java.util.Scanner;
//去掉字符串中的连续k个0
public class Main9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.next();
            int n = scanner.nextInt();
            String res = getString(str, n);
            System.out.println(res);
        }
    }

    private static String getString(String str, int n) {
        int count = 0;
        char[] ch = str.toCharArray();
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char temp = str.charAt(i);
            if (temp == '0') {
                count++;
            } else {
                for (int j = 0; j < count % n; j++) {
                    sb.append('0');
                }
                sb.append(temp);
                count = 0;
            }
        }
        if (count > 0) {
            for (int j = 0; j < count % n; j++) {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
