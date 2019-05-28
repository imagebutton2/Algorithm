package com.java.bit;

import java.util.PriorityQueue;
import java.util.Scanner;
//找出n个数里最小的k个
public class The_Smallest_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            PriorityQueue<Integer>queue=new PriorityQueue<>(s.length-1);
            for(int i=0;i<s.length-1;i++){
                queue.add(Integer.parseInt(s[i]));
            }
            int k = Integer.parseInt(s[s.length-1]);
            for(;k>0;k--){
                if(k-1!=0) {
                    System.out.print(queue.poll() + " ");
                }else {
                    System.out.print(queue.poll());
                    System.out.println();
                }
            }
        }
    }
}
