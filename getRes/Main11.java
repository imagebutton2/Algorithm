package com.lanqiao.study;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//生成合法字符
public class  Main11{
    public static void main(String[] args) {
        Set<String> res = getRes(4);
        Set<String> res2 = getResFor(4);

        System.out.print(res);
        System.out.println("------------");
        System.out.println(res2);
    }

    private static Set<String> getResFor(int i) {
        //使用迭代
        Set<String> res = new HashSet<>();
        res.add("()");
        if (i == 1) {
            res.add("()");
            return res;
        }
        for (int j = 2; j <= i; j++) {
            Set<String> temp = new HashSet<>();
            //将所有原来的都加上括号
            for (String s : res) {
                temp.add(s + "()");
                temp.add("()" + s);
                temp.add("(" + s + ")");
            }
            res = temp;
        }
        List<String> list = new ArrayList<>(res);
        return res;
    }

    private static Set<String> getRes(int i) {
        Set<String> n = new HashSet<>();
        if (i == 1) {
            n.add("()");
            return n;
        }
        Set<String> n_1 = getRes(i - 1);
        //将n-1所有的内容都加括号
        for (String str : n_1) {
            n.add(str + "()");
            n.add("()" + str);
            n.add("(" + str + ")");
        }
        return n;
    }
}
