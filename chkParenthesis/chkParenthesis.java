package com.java.bit;


public class chkParenthesis {

        public boolean chkParenthesis(String A, int n) {
            if(A == null || n == 0){
                return false;
            }
            int flag = 0;
            for(int i = 0 ; i < A.length() ; i++){
                if(A.charAt(i) == '('){
                    flag++;
                }else if(A.charAt(i) == ')'){
                    flag--;
                }else{
                    return false;
                }
                if(flag < 0){
                    return false;
                }
            }
            if(flag == 0){
                return true;
            }
            return false;

    }

}
