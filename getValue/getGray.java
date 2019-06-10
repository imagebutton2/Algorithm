package com.java.bit;

import java.util.Arrays;

public class getGray {
    //生成格雷码
    public String[] getGray(int n) {
        if(n == 1) {
            return new String[]{"0", "1"};
        }
        String[] temp = getGray(n - 1);
        String[] strings = new String[temp.length * 2];
        for(int i = 0,j = temp.length; i < temp.length *2; i++) {
            if(i < temp.length) {
                strings[i] = "0" + temp[i];
            } else {
                j--;
                strings[i] = "1" + temp[j];
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        getGray getGray=new getGray();
        System.out.println(Arrays.toString(getGray.getGray(3)));
    }
}
