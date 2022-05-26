import org.junit.Test;
import per.khr.java.Queue.Merge_Two_Sorted_Lists;
import per.khr.java.vo.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class Merge_Two_Sorted_ListsTest {

    @Test
    public void mergeTwoLists() {
        Merge_Two_Sorted_Lists mtsl = new Merge_Two_Sorted_Lists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        ListNode list3 = new ListNode(5);
        ListNode list4 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode result2 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));

        assertThat(mtsl.mergeTwoLists(list3, list4)).isEqualTo(result2);
    }
}