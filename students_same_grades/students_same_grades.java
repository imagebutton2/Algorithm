package com.java.bit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//统计同成绩学生人数
//读入N名学生的成绩，将获得某一给定分数的学生人数输出。
public class students_same_grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if(n<=0||n>1000){
                break;
            }
            HashMap<Integer, Integer> map = null;
            map = new HashMap<>(n);
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                if (!map.containsKey(k)) {
                    map.put(k, 1);
                } else {
                    map.put(k, map.get(k) + 1);
                }
            }
            int m = sc.nextInt();
            if (map.containsKey(m)) {
                list.add(map.get(m));
            } else {
                list.add(0);
            }
        }
        for(int i:list){
            System.out.println(i);
        }
    }
}
