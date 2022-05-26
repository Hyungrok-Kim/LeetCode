package per.khr.java.Queue;

import per.khr.java.vo.ListNode;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;

        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        while (list1 != null || list2 != null) {
            if (list1 != null) {
                pq.offer(list1.val);
                list1 = list1.next;
            }
            if (list2 != null) {
                pq.offer(list2.val);
                list2 = list2.next;
            }
        }

        Iterator i = pq.iterator();

        ListNode result = null;
        ListNode start = new ListNode(pq.poll());
        while(i.hasNext()) {
            result = new ListNode(pq.poll(), start);
            start = result;
        }

        return result;
    }
}
