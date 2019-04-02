//反转一个单链表。
//输入: 1->2->6->3->4->5->6
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
                cur=temp.next;//备份head。next

                temp.next=new_head;//移动headhead指向的节点

                new_head=temp;//移动new_head的位置

                temp=cur;//要执行head.next或遍历链表
            }
            return new_head;
        }

    }
}
