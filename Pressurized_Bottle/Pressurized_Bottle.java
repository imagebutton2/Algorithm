package com.java.bit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//汽水瓶
/**
 * 童鞋们在遇到这种类似数学的问题时，切记不要慌，我们来看一下这个题目。题目表达的意思很明
 * 确，3个空瓶子换一瓶饮料。如果给你10个空瓶，问你可以换多少饮料喝？我们可以在纸上简单画一下，这个题目
 * 的思路就出来了？
 */
public class Pressurized_Bottle {
    static int count(int a)
    {
        if (a == 1)
            return 0;
        if (a == 2)
            return 1;
        return a / 3 + count(a % 3 + a / 3);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        boolean flag = true;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0 || arr.size() >= 10) {
                flag = false;
                break;
            } else {
                if (arr.size() < 10 && flag == true) {
                    arr.add(n);
                }
            }
        }
        for (Integer i : arr) {
            System.out.println(Pressurized_Bottle.count(i));
        }

    }

}
