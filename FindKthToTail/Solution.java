
//输入一个链表，输出该链表中倒数第k个结点。
public class Solution {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next = head;

        ListNode f=dummyNode.next;
        ListNode s=dummyNode.next;
        if(head==null){
            return null;
        }
        while (k>0&&f!=null){
            f=f.next;
            k--;
        }
        if(f==head||(f==null&&k>0))
        {
            return null;
        }
        while (f!=null&&s!=null){
            s=s.next;
            f=f.next;
        }
        return s;

    }
}
