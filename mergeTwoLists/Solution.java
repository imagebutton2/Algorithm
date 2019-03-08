//��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵ�
public class Solution{

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyhead=new ListNode(-1);
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        if (l1.val > l2.val) {
            dummyhead.next = l2;l2 = l2.next;
        }else{
            dummyhead.next = l1; l1 = l1.next;
        }

        ListNode cur=dummyhead.next;
        while (l1!=null&&l2!=null){
            if(l1.val>l2.val){
                cur.next=l2;
                l2=l2.next;
            }else {
                cur.next=l1;
                l1=l1.next;
            }
            cur=cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        }else if(l2 != null) {
            cur.next = l2;
        }

    return dummyhead.next;
    }


}