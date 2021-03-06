
//合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
//示例:
//输入:
//[
//  1->4->5,
//  1->3->4,
//  2->6
//]
//输出: 1->1->2->3->4->4->5->6
public class mergeKLists {
   
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        if (lists.length == 2) {
            return mergeTwoLists(lists[0], lists[1]);
        }

        int mid = lists.length / 2;
        ListNode[] listNodes1 = new ListNode[mid];
        for (int i = 0; i < listNodes1.length; i++) {
            listNodes1[i] = lists[i];
        }
        ListNode[] listNodes2 = new ListNode[lists.length - mid];
        for (int i = mid, j = 0; j < listNodes2.length; i++, j++) {
            listNodes2[j] = lists[i];
        }

        return mergeTwoLists(mergeKLists(listNodes1), mergeKLists(listNodes2));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = null;

        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;

    }
}
