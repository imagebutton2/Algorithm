package com.gjz;

import java.util.HashMap;
import java.util.Scanner;

//字母统计
public class Alphabetical_statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            char c[] = s.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>(26);
            for (int i = 0; i < 26; i++) {
                map.put((char) ('A' + i), 0);
            }
            for (char a : c) {
                if (map.containsKey(a)) {
                    map.put(a,map.get(a)+1);
                }
            }
            for(Character set:map.keySet()){
                System.out.println(set+":"+map.get(set));
            }
        }
    }
}
