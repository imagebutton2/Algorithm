//���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣
//�������ٰ��������ڵ㡣
//���������нڵ��ֵ����Ψһ�ġ�
//�����Ľڵ�Ϊ��ĩβ�ڵ㲢��һ���������е�һ����Ч�ڵ㡣
//��Ҫ����ĺ����з����κν����

public class Solution{
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        if(node==null){
            return ;
        }
        node.val=node.next.val;
        node.next=node.next.next;

    }
}
