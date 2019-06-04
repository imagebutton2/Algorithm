package com.java.myAlgorithm;

import java.util.Stack;
//有效的括号
/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 *     左括号必须用相同类型的右括号闭合。
 *     左括号必须以正确的顺序闭合。
 *
 * 注意空字符串可被认为是有效字符串。
 */
public class isValid {
    public boolean isValid(String s) {
        char[] data = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : data) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (c == '}') {
                    char temp = stack.peek();
                    if (temp == '{') {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                } else if (c == ']') {
                    char temp = stack.peek();
                    if (temp == '[') {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                } else if (c == ')') {
                    char temp = stack.peek();
                    if (temp == '(') {
                        stack.pop();
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

}
