//�м�ڵ�
//�����2��
//������һ��
//����ĵ��յ�ʱ���ĵ����յ�
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