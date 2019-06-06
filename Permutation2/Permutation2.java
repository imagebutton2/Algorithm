package com.java.myDS;

import java.util.ArrayList;

public class Permutation2 {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();
        if (str == null || str.length() == 0) {
            return result;
        }


        char[] chars = str.toCharArray();
        boolean[] used = new boolean[str.length()];
        helper(chars, used, new StringBuffer(), result);
        return result;
    }


    private static void helper(char[] chars, boolean[] used, StringBuffer sub, ArrayList<String> result) {
        if (sub.length() == chars.length) {
            result.add(sub.toString());
            return;
        }
        for (int i = 0; i < used.length; i++) {
            if (used[i] || i > 0 && !used[i - 1] && chars[i] == chars[i - 1]) {
                continue;
            }
            sub.append(chars[i]);
            used[i] = true;
            helper(chars, used, sub, result);
            sub.deleteCharAt(sub.length() - 1);
            used[i] = false;
        }
    }


    public static void main(String[] args) {
        String string = "abc";
        ArrayList<String> list = Permutation(string);
        for (String str : list) {
            System.out.println(str);
        }
    }
}
