package com.My.leetcode.My;

//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
//为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
// 如果 pos 是 -1，则在该链表中没有环。
//1-2-3-4-5
//     \   \
//      \  6
//        \ \
//         7
//3是环的起点
//fast slow 都为 1
//fast 和 slow 在6处相遇
//fast1-2-3-4-5-6-7-3-4-5-6
//slow 1-2-3-4-5-6
//2-3 是a
//4-5-6 是b
//7-3是c
//slow=a+b
//fast=a+b+c
//fast=2slow
//a+b+c=2(a+b)
//a = c
//相遇之后     让meet和head一起出发，每次走一步，相遇，就是环的起点
public class detectCycle {
    public ListNode detectCycle(ListNode head) {

        ListNode fast=head;

        ListNode slow=head;

        ListNode meet=null;//相遇之后     让meet和head一起出发，每次走一步，相遇，就是环的起点

        ListNode temp=head;

        while(fast!=null){

            fast=fast.next;

            slow=slow.next;

            if(fast!=null){//1->null;这种情况不是环

                fast=fast.next;
            }else {

                return null;
            }
            if(fast==slow){

                meet=fast;

                break;
            }

        }
        if(meet==null){
            //如果没有相遇证明无环
            return null;

        }
        while (temp!=null&&meet!=null){

            if(temp==meet){

                return temp;
            }
            temp=temp.next;

            meet=meet.next;
        }

        return null;
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(fast==null){
            return false;
        }else {
            while (fast!=null&&slow!=null){
                fast=fast.next;
                slow=slow.next;
                if(fast==null){
                    return false;
                }else {
                    fast=fast.next;
                }
                if(fast==slow){
                    return true;
                }
            }
        }
        return false;
    }
}
