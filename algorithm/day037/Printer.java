package com.gjz.day37;
//二维数组打印
public class Printer {
    public static void main(String[] args) {

    }
    public int[] arrayPrint(int[][] arr, int n) {
        int a[] = new int [n*n];
        int index=0;//a[] 的当前下标
        // i 和 j 记录每一对对角线的入口（起始）
        int i=0;//行
        int j=n-1;//列
        while(i!=n || j!=0){//左下角最后一个元素之后结束
            int t1=i;
            int t2=j;
            while(t1<n&&t2<n){
                a[index++]=arr[t1++][t2++];
            }
            // 改变 i, j 为下一组对角线的入口
            if(i==0&&j==0)
                i++;
            else if(i==0)
                j--;
            else
                i++;
        }
        return a;
    }

}
