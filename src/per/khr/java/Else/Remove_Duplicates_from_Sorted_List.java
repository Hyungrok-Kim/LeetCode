package per.khr.java.Else;

import per.khr.java.vo.ListNode;

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode prev = head;
        ListNode now = head.next;
        while (true) {
            if (now == null)
                break;

            if (prev.val == now.val) {
                prev.next = now.next;
            } else {
                prev = now;
            }

            now = now.next;
        }

        return head;
    }
}
