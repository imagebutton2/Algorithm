package com.java.myAlgorithm;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */

//    找终止条件：当head指向链表只剩一个元素的时候，自然是不可能重复的，因此return
//    想想应该返回什么值：应该返回的自然是已经去重的链表的头节点
//    每一步要做什么：宏观上考虑，此时head.next已经指向一个去重的链表了，
//  而根据第二步，我应该返回一个去重的链表的头节点。
//  因此这一步应该做的是判断当前的head和head.next是否相等，如果相等则说明重了，返回head.next，否则返回head
public class deleteDuplicates {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null)
            return head;
        head.next=deleteDuplicates(head.next);
        if(head.val==head.next.val)
           head=head.next;
        return head;
        }


}
