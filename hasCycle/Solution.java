//����һ�������ж��������Ƿ��л���
//Ϊ�˱�ʾ���������еĻ���
// ����ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ����
// ��� pos �� -1�����ڸ�������û�л���
//����ָ��
public class Solution {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            if (head.next == head) {
                return true;
            } else {
                return false;
            }
        }
        ListNode f = head;
        ListNode l = head;
        while (f!=null&&l!=null&&f.next!=null){
            f=f.next.next;
            l=l.next;
            if(f==l){
                return true;
            }
        }
        return false;

    }
}