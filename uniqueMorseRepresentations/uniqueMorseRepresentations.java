package com.java.myAlgorithm;

import java.util.HashSet;
import java.util.TreeSet;
//唯一摩尔斯密码词

/**
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
 */
public class uniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String code[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet <String>set=new HashSet<>();
        for(String s:words){
            StringBuffer buffer=new StringBuffer();
            for(int i=0;i<s.length();i++){
                buffer.append(code[s.charAt(i)-'a']);
            }
            set.add(buffer.toString());
        }

        return set.size();

    }
}
