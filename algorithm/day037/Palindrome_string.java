package com.gjz.day37;

import java.util.Scanner;

//回文串
public class Palindrome_string {

/*利用传统思路，掐头去尾
字符串头部添加一个尾部字符，判断是否为回文
字符串尾部添加一个头部字符，判断是否为回文
2者有1个是，返回true
否则判断头尾字符是否一样（插入的字符确定不在两边了，头尾就一定可以形成对应）
如果否 返回false
如果是 新字符串=原字符串去掉头尾 进行递归
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        while (sc.hasNext()) {
            a = sc.next();
            if (dealString(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isHuiWen(StringBuilder sb) {
        StringBuilder sb1 = new StringBuilder(sb);
        if (sb1.reverse().toString().equals(sb.toString())) {
            return true;
        }
            return false;
    }

    public  static boolean dealString(String a){
        char temp1 = a.charAt(a.length()-1);
        if(isHuiWen(new StringBuilder(temp1+a))){
            return true;
        }
        char temp2 = a.charAt(0);
        if(isHuiWen(new StringBuilder(a+temp2))){
            return true;
        }
        if(temp1!=temp2){
            return false;
        }
        return dealString(a.substring(1, a.length()-1));
    }
}
