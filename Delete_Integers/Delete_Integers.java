package com.java.bit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//删数

/**
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。
 * 以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
 */
    public class Delete_Integers {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int count=0;
            int size=list.size();
            while (size!=1){
                Iterator <Integer> iterator=list.iterator();
                while (iterator.hasNext()){
                   iterator.next();
                    if(count==2){
                        iterator.remove();
                        count=-1;
                        size--;
                    }
                    count++;
                }
            }
            System.out.println(list.get(0));
        }
    }
}
