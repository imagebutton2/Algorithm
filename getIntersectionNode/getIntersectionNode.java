package com.My.leetcode.My;

import java.util.HashSet;
import java.util.Set;

// 计算长度两个链表的长度
//长度长的先走 长度差步
//然后一起向后走，当两个节点的地址相等时  返回当前节点
//public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//		int lA = length(headA);
//		int lB = length(headB);
//		return RE(headA, lA, headB, lB);
//	}
//
//	public int length(ListNode node) {//得到链表长度
//		if (node == null)
//			return 0;
//		return length(node.next) + 1;
//	}
//
//	public ListNode RE(ListNode nodeA, int lA, ListNode nodeB, int lB) {
//		if (lA > lB)//目的是控制在同一起点
//			return RE(nodeA.next, lA - 1, nodeB, lB);
//		else if (lA < lB)
//			return RE(nodeA, lA, nodeB.next, lB - 1);
//		else {
//			if (nodeA == nodeB)
//				return nodeA;
//			return RE(nodeA.next, lA - 1, nodeB.next, lB - 1);
//		}
//	}
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=getLength(headA);
        int lengthB=getLength(headB);
        int len=((lengthB-lengthA>0)?lengthB-lengthA:lengthA-lengthB);
        ListNode temp1=((lengthB-lengthA>0)?headB:headA);
        ListNode temp2=((temp1==headB)?headA:headB);

        for(int i=0;i<len;i++){
            temp1=temp1.next;
        }
        while (temp1!=null&&temp2!=null){
            if(temp1==temp2){
                return temp1;
            }else {
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return null;
    }
    private static int getLength(ListNode head){
        int len=0;
        while (head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB){
        Set<ListNode>set1=  setListNode(headA);
        ListNode temp=headB;
        while (temp!=null){
            if(set1.contains(headB)){
                return temp;
            }else {
                temp=temp.next;
            }

        }
        return null;

    }
    private static Set setListNode(ListNode head){
        Set<ListNode>set=new HashSet<>();
        while (head!=null){
            set.add(head);
            head=head.next;
        }
        return set;
    }

}
