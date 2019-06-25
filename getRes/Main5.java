package com.lanqiao;

import java.util.*;
import java.util.concurrent.locks.Lock;
//合并区间
public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(9,10);
        map.put(1,4);
        map.put(3,6);
        map.put(8,12);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        //拍好序
        for (Map.Entry entry : list){
            System.out.println(entry.getKey()+"__"+entry.getValue());
        }
        Map<Integer,Integer> res = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int left = list.get(i).getKey();
            int right = list.get(i).getValue();
            if(res.size() == 0){
                res.put(left,right);
            }
            for(Map.Entry<Integer,Integer> entry : res.entrySet()){
                int l = entry.getKey();
                int r = entry.getValue();
                if(left >= l && left <= r){
                    if(r < right){
                        res.put(l,right);
                    }else{
                        res.put(l,r);

                    }
                }else{
                    res.put(left,right);
                }
            }
        }
        for (Map.Entry entry : res.entrySet()){
            System.out.println(entry.getKey()+"__"+entry.getValue());
        }
    }
}
