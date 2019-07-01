package com.lanqiao.study;

import javax.sound.midi.Soundbank;
import java.time.temporal.Temporal;
//字符串压缩
public class Main12{
    public static void main(String[] args) {
        String str= "aabbbbaaaaccc";
        String res = getRes(str);
        System.out.println(res);
    }

    private static String getRes(String str) {
        int count = 0;
        char last= ' ';
        char ch ;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(ch == last){
                if(count == 0){
                    sb.append(ch);
                }else{
                    count++;
                }
            }
            if(ch != last){
                String t = Integer.toString(count);
                System.out.println(t);
                sb.append(t);
                sb.append(ch);
                count = 1;
            }
            if(count > 1){
                sb.append(count);
            }
            last = ch;
        }


        return sb.toString();

    }
}
