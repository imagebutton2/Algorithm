package com.java.myAlgorithm;

import java.util.ArrayList;
import java.util.List;

//给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
//例如，给出 n = 3，生成结果为：
//
//[
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]
public class generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        generate("",n,n,result);
        return result;
    }

    private void generate(String item, int left, int right, List<String> result) {
    if(left==0&&right==0){
        result.add(item);
    }
    if(left>0){
        generate(item+"(",left-1,right,result);
    }
    if(left<right){
       generate(item+")",left,right-1,result);

    }
    }



   
}
