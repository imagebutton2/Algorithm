public class Solution {
    class ListNode {
      int val;
     ListNode next;
     ListNode(int x) {
         val = x;
     }
  }
    
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead=new ListNode(-1);
            ListNode cur = dummyHead;
            ListNode p=l1;
            ListNode q = l2;
            int sum=0;
            int result=0;
            while(p!=null||q!=null){
                int x=(p!=null)?p.val:0;
                int y=(q!=null)?q.val:0;
                sum=result+x+y;
                result=sum/10;
                cur.next = new ListNode(sum%10);
                cur = cur.next;
                if(p!=null)
                l1 = l1.next;
                if(q!=null)
                l2 = l2.next;
            }
            if(result>0){
                cur.next=new ListNode(result%10);
            }
            return dummyHead.next;
        }


    
}
