package com.My.leetcode.My;
//给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
//你应当保留两个分区中每个节点的初始相对位置。
//示例:
//输入: head = 1->4->3->2->5->2, x = 3
//输出: 1->2->2->4->3->5
public class partition {
    public ListNode partition(ListNode head, int x) {

        ListNode lesshead=new ListNode(-1);
        ListNode morehead=new ListNode(-1);
        ListNode less_cut=lesshead;
        ListNode more_cut=morehead;

        while (head!=null){
            if(head.val<x){
                less_cut.next=head;
                less_cut=head;
            }else {
                more_cut.next=head;
                more_cut=head;
            }
            head=head.next;
        }

            less_cut.next=morehead.next;
            more_cut.next=null;


           return lesshead.next;

    }
}
