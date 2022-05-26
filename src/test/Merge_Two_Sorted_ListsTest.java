import org.junit.Test;
import per.khr.java.Else.Merge_Two_Sorted_Lists;
import per.khr.java.vo.ListNode;

public class Merge_Two_Sorted_ListsTest {

    @Test
    public void mergeTwoLists() {
        Merge_Two_Sorted_Lists mtsl = new Merge_Two_Sorted_Lists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3)));

        mtsl.mergeTwoLists(list1, list2);
    }
}