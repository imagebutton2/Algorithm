//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//暴力解法

class Solution {
public   boolean isPalindrome(int x) {
       if(x>=0){
            int num=x;
            int  y=0;
            while (num>0){
                y=num%10+y*10;
                num=num/10;
            }
           if(y==x){
               return true;
           }else {
               return false;
           }
       }else {
           return false;
       }
}
}