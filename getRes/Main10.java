package com.lanqiao;
//替换空格字符
public class Main10 {
    public static void main(String[] args) {
        String str = "hello world";
        String res = getRes(str);
        System.out.println(res);
    }

    private static String getRes(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
               count+= 2;
            }
        }
        //将字符串变长响应的空格
        char[] ch = new char[str.length() + count];
        for (int i = 0; i < str.length() + count; i++) {
            if(i<str.length()){
                ch[i] = str.charAt(i);
            }else{
                ch[i] = ' ';
            }
        }
        int i = str.length() - 1;
        int j = i + count;
        while(i >= 0){
            if(ch[i] == ' '){
                ch[j--]='0';
                ch[j--]='2';
                ch[j--]='%';
            }else{
                ch[j--] = ch[i];
            }
            i--;
        }
        return new String(ch);
    }
}
