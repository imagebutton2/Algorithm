package com.java.bit;


import java.util.Scanner;

public class Magic_Pocket {

    static final int V = 40;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int n = input.nextInt();
            int[] weight = new int[n];
            int[] flag = new int[n];
            int count = 0;
            int all_count = 1;
            for(int i=0;i<=n;i++) {
                weight[i] = input.nextInt();
            }
            for(int i=1;i<=n;i++)
                all_count *=2;

            for(int num=0;num<=all_count;num++) {
                for(int i=1;i<=n;i++) {
                    if(flag[i]==0) {
                        flag[i]=1;
                        continue;
                    }
                    else {
                        flag[i]=0;
                        break;
                    }
                }
                int sum = 0;
                for(int i=1;i<=n;i++) {
                    if(flag[i]==1)
                        sum += weight[i];
                }
                if(sum==V)
                    count++;
            }
            System.out.println(count);
        }
    }
}

