package com.java.bit;
//链表分割


import java.util.LinkedList;
import java.util.Queue;

//编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
//给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
public class partition1 {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null) {
            return null;
        }
        ListNode smallHead = new ListNode(-1);
        ListNode smalltail = smallHead;
        ListNode bigHead = new ListNode(-1);
        ListNode bigtail = bigHead;
        while (pHead != null) {
            if (pHead.val < x) {
                smalltail.next =new ListNode(pHead.val);
                smalltail = smalltail.next;
            } else {
                bigtail.next = new ListNode(pHead.val);
                bigtail = bigtail.next;
            }
            pHead=pHead.next;
        }
        smalltail.next = bigHead.next;
        return smallHead.next;
    }


}
