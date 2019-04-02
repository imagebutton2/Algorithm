//反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
//说明:
//1 ≤ m ≤ n ≤ 链表长度。
//示例:
//输入: 1->2->3->4->5->NULL, m = 2, n = 4
//输出: 1->4->3->2->5->NULL


//第一种 找到几个关键节点
//逆置前驱节点 逆置头结点 逆置尾节点  逆置后驱节点
//1.先确定翻转的长度 len=n-m+1；

//2.找到逆置节点的前驱节点。

public class reverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
      int len=n-m+1;

      ListNode temp=head;
      ListNode newhead=null;
      ListNode tail=null;
      ListNode next=null;
      ListNode prev=null;
      //先找到逆置前头节点和前驱节点
        while (temp!=null&&(--m)>0){
            prev=temp;
            temp=temp.next;
        }

         tail=temp;//逆置前头节点，逆置后的尾节点

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
