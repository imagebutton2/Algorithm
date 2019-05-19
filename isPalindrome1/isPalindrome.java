package com.java.myAlgorithm;
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
//说明：本题中，我们将空字符串定义为有效的回文串。
//
//示例 1:
//
//输入: "A man, a plan, a canal: Panama"
//输出: true
//
//示例 2:
//
//输入: "race a car"
//输出: false
public class isPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.length() == 0) return true;
        s = s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        int n=s.length();
       while (i<j){
           while (i<n&&!((s.charAt(i)>= '0' &&s.charAt(i)<='9')||s.charAt(i)>= 'a' &&s.charAt(i)<='z')){
               i++;
           }
           while (j>=0&&!((s.charAt(j)>= '0' &&s.charAt(j)<='9')||s.charAt(j)>= 'a' &&s.charAt(j)<='z')){
               j--;
           }
            if(i<n&&j>=0) {
                if (s.charAt(i) != s.charAt(j)) {
                   return false;
                }
                i++;
                j--;
            }
       }
        return true;

    }
}
