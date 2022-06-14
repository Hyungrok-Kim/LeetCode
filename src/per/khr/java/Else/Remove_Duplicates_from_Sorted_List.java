package per.khr.java.Else;

import per.khr.java.vo.ListNode;

import java.util.Iterator;
import java.util.TreeSet;

// 미완성
public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer> ts = new TreeSet<>();

        while (head.next != null) {
            ts.add(head.val);

            head = head.next;
        }

        Iterator i = ts.iterator();
        ListNode resultNode = new ListNode();
        while (i.hasNext()) {
            int target = (int) i.next();
            resultNode.val = target;

            if (i.hasNext()) {
                int nextTarget = (int) i.next();

                if (target != nextTarget) {
                    resultNode.next = new ListNode(nextTarget);
                }
            }
        }
        return null;
    }
}
