//反转一个单链表。
//输入: 1->2->6->3->4->5->6

public class Solution {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode dummyNode =new ListNode(-1);
        dummyNode.next=head;


        空链表 或者 只有1个元素
        if(head==nullhead.next==null){
            return head;
        }else {
            ListNode f=dummyNode.next;
            ListNode s=f.next;

            while (s!=null){
                f.next=s.next;
                s.next=f;
                dummyNode.next=s;
                s=f.next;

            }

        }
        return null;
    }

}