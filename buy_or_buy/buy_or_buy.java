package com.java.bit;
//到底买不买（20）
//小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散了卖。于是小红要你帮忙判断一
//下，某串珠子里是否包含了全部自己想要的珠子？如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。
//为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。例如，YrR8RrY是小红想做的珠串；那么ppRYYGrrYBR2258可以买，因为包含了
//全部她想要的珠子，还多了8颗不需要的珠子；ppRYYGrrYB225不能买，因为没有黑色珠子，并且少了一颗红色的珠子。
import java.util.HashMap;
import java.util.Scanner;

public class buy_or_buy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String product=sc.nextLine();
            String needer=sc.nextLine();
            HashMap<Character,Integer>map=new HashMap<>(product.length());
            for(char key:product.toCharArray()){
                if(!map.containsKey(key)){
                    map.put(key,1);
                }else {
                    map.put(key,map.get(key)+1);
                }
            }
            int lastCount = 0;
            for (char key:needer.toCharArray()) {
                if (map.containsKey(key)){
                    if (map.get(key)>0){
                        int count = map.get(key);
                        map.put(key,count-1);
                    }else {
                        lastCount++;
                    }
                }else {
                    lastCount++;
                }

            }
            if (lastCount==0){
                System.out.println("Yes "+(Math.abs(product.length()-needer.length())));
            }else {
                System.out.println("No "+lastCount);
            }
        }
    }
}
