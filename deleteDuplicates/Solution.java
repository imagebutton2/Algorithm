//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//输入: 1->1->2
//输出: 1->2

//输入: 1->1->2->3->3
//输出: 1->2->3
public class Solution {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        while (temp!=null&&temp.next!=null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
