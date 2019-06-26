package com.lanqiao.study;

import java.util.*;
//UserHobby
public class  Main7{

    public static HashMap<Integer, Node> hashMap = new HashMap<>();
    static class Node{
        private int position;
        private Node Next;
        public Node(int position) {
            this.position = position;
        }
        public void addNode(Node newNode) {
            if (this.Next == null) {
                this.Next = newNode;
            } else {
                this.Next.addNode(newNode);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,q,l,r,k,num;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            num = in.nextInt();
            Node node = new Node(i);
            if (hashMap.get(num) != null) {//判断hashmap中是否存在该用户喜好，存在就添加到链尾
                hashMap.get(num).addNode(node);
            } else if (hashMap.get(num) == null) {//不存在就添加为头结点
                hashMap.put(num, node);
            }
        }
        q = in.nextInt();
        for (int i = 0; i < q; i++) {
            l = in.nextInt();
            r = in.nextInt();
            k = in.nextInt();
            int count = 0;
            Node root = hashMap.get(k);
            while (root != null && root.position <= r) {
                if (root.position >= l && root.position <= r) {
                    count++;
                }
                root = root.Next;
            }
            System.out.println(count);
        }
    }
}