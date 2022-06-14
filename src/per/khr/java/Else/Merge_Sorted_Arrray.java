package per.khr.java.Else;

import java.util.Arrays;

public class Merge_Sorted_Arrray {
    // Method 사용 답안
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        for (; index < nums2.length + m; ++index) {
            nums1[index] = nums2[index - m];
        }

        Arrays.sort(nums1);
    }
}
