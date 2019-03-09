//给定一个链表，判断链表中是否有环。
//为了表示给定链表中的环，
// 我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
// 如果 pos 是 -1，则在该链表中没有环。
//快慢指针
public class Solution {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            if (head.next == head) {
                return true;
            } else {
                return false;
            }
        }
        ListNode f = head;
        ListNode l = head;
        while (f!=null&&l!=null&&f.next!=null){
            f=f.next.next;
            l=l.next;
            if(f==l){
                return true;
            }
        }
        return false;

    }
}