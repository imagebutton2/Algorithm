package com.java.bit;

import java.util.Scanner;

public class Parity_Check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s = in.next();
            char[]arr=s.toCharArray();
            for(char a:arr){
                int []result=new int[8];
                int n=a-0;
                int count=0;
                for(int i=7;i>0;i--){
                    if(n%2>0){
                        count+=1;
                        result[i]=1;
                    }
                    n/=2;
                }
                if(count%2==0){
                    result[0]=1;
                }
                for(int i:result){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
