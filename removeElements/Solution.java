//实现递归链表的插入
public class Solution {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }
        ListNode res = removeElements(head.next,val);
        if(head.val == val) {
            return res;
        }else {
            head.next = res;
            return head;
        }
    }
}