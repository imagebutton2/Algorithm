//��תһ��������
//����: 1->2->6->3->4->5->6
class ListNode{
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class reverseList {

    public ListNode reverseList(ListNode head) {


        if(head==null||head.next==null){
            return head;
        }else {
            ListNode temp=head;

            ListNode new_head=null;

            ListNode cur=head;
            while(temp!=null){
                cur=temp.next;//����head��next

                temp.next=new_head;//�ƶ�headheadָ��Ľڵ�

                new_head=temp;//�ƶ�new_head��λ��

                temp=cur;//Ҫִ��head.next���������
            }
            return new_head;
        }

    }
}
