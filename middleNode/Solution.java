//中间节点
//快的跑2步
//慢的跑一步
//当快的到终点时慢的等于终点
//1234 n/2+1
//12345 n/2+1



public class Solution{
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next = head;

           ListNode f=dummyNode.next;
           ListNode s=dummyNode.next;
            while (f!=null&&s!=null&&f.next!=null){
                s=s.next;
                f=f.next.next;

            }
            return s;


    }
}