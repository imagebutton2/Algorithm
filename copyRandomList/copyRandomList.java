package com.My.leetcode.My;

import java.util.HashMap;
import java.util.Map;

//给定一个链表，每个节点包含一个额外增加的随机指针，
// 该指针可以指向链表中的任何节点或空节点。
//要求返回这个链表的深拷贝。
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}

public class copyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node,Node>map=new HashMap();
        Node cur=head;
        while (cur!=null){
            map.put(cur,new Node(cur.val,cur.next,cur.random));
            cur=cur.next;
        }
        cur=head;
        while (cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }

}
