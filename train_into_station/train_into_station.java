package com.java.bit;

import java.util.*;
//火车进站
// 给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，一共N辆火车，每辆火车以数字1-9编号。
// 要求以字典序排序输出火车出站的序列号。
public class train_into_station {
    private static void Permutation(int[] A,int start,int n,ArrayList<int[]> result){
        if(start == n){
            return;
        }
        if(start == n-1){
            int[] B = A.clone();
            result.add(B);
            return;
        }
        for(int i=start;i<n;i++){
            swap(A,start,i);
            Permutation(A,start+1,n,result);
            swap(A,start,i);
        }

    }
    private static void swap(int[] A,int i,int j){
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

    private static boolean isLegal(int[] in,int[] out,int n){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int i=0;
        int j=0;
        while(i<n){ // in 还有元素的时候都需要判断
            if(in[i] == out[j]){ //  相等时候就不用入栈，直接后移
                i++;
                j++;
            }else{
                if(stack.isEmpty()){ //空stack 就只有入栈了
                    stack.push(in[i]);
                    i++;
                }else{
                    int top = stack.peek(); // 栈顶元素相等，进行出栈
                    if(top ==out[j]){
                        j++;
                        stack.pop();
                    }else if(i<n){ //  不等时候入栈
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }
        while(!stack.isEmpty() && j<n){ // in 的结束后，栈中元素进程出栈序列应该和out剩余的元素 相同
            int top = stack.pop();
            if(top == out[j]){
                j++;
            }else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for(int i=0;i<n;i++){
                A[i] = sc.nextInt();
            }
            int start = 0;
            ArrayList<int[]> result = new ArrayList<>();
            Permutation(A,start,n,result);
            Set<String> sortResult = new TreeSet<String>();

            for(int[] out:result) {
                if(isLegal(A,out,n)){
                    StringBuilder sb = new StringBuilder();
                    for(int i=0;i<out.length-1;i++){
                        sb.append(out[i]+" ");
                    }
                    sb.append(out[out.length-1]);
                    sortResult.add(sb.toString());
                }
            }
            for(String list:sortResult){
                System.out.println(list);
            }
        }
    }
}



// for (int i = 0; i < list.size(); i++) {
//                Queue<Character> queue = new LinkedList<>();
//                Stack<Character>stack=new Stack<>();
//                for(int j=0;j<list.get(i).length();j++) {
//                      queue.add(list.get(i).charAt(j));
//                }
//                for(int j=0;j<list.get(0).length();j++) {
//
//                    stack.add(list.get(0).charAt(j));
//                    while (!stack.isEmpty()&&stack.peek()==queue.peek()){
//                            stack.pop();
//                            ((LinkedList<Character>) queue).pop();
//                    }
//                }
//                if(stack.isEmpty()){
//                    list1.add(list.get(i));
//                }
//            }



// for (int i = 0; i < list1.size(); i++) {
//                for (int j = 0; j <list1.get(i).toCharArray().length; j++) {
//                    if (j == list1.get(i).toCharArray().length - 1) {
//                        System.out.print(list1.get(i).charAt(j)-'0');
//                    } else {
//                        System.out.print((list1.get(i).charAt(j)-'0') + " ");
//                    }
//                }
//                System.out.println();
//            }