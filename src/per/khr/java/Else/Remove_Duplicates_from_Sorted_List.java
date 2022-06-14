package per.khr.java.Else;

import per.khr.java.vo.ListNode;

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode target = head.next;
        while (true) {
            if (target == null) break;

            if (head.val == target.val) {
                head = target;
                target = head.next;
            } else {
                target =
            }
        }

        return null;
    }
}
