//��ת��λ�� m �� n ��������ʹ��һ��ɨ����ɷ�ת��
//˵��:
//1 �� m �� n �� �����ȡ�
//ʾ��:
//����: 1->2->3->4->5->NULL, m = 2, n = 4
//���: 1->4->3->2->5->NULL


//��һ�� �ҵ������ؼ��ڵ�
//����ǰ���ڵ� ����ͷ��� ����β�ڵ�  ���ú����ڵ�
//1.��ȷ����ת�ĳ��� len=n-m+1��

//2.�ҵ����ýڵ��ǰ���ڵ㡣

public class reverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
      int len=n-m+1;

      ListNode temp=head;
      ListNode newhead=null;
      ListNode tail=null;
      ListNode next=null;
      ListNode prev=null;
      //���ҵ�����ǰͷ�ڵ��ǰ���ڵ�
        while (temp!=null&&(--m)>0){
            prev=temp;
            temp=temp.next;
        }

         tail=temp;//����ǰͷ�ڵ㣬���ú��β�ڵ�

        while (temp!=null&&len>0){
            next=temp.next;
            temp.next=newhead;
            newhead=temp;
            temp=next;
            len--;
        }
        tail.next=next;
        if(prev!=null){
            prev.next=newhead;
        }else {
            head=newhead;
        }
        return head;
    }
}
