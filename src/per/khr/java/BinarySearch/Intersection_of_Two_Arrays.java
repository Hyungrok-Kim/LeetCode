package per.khr.java.BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;

        if (nums1Len > nums2Len) {
            Arrays.sort(nums1);

            for (int num2 : nums2) {
                int startIndex = 0;
                int endIndex = nums1Len - 1;

                while (startIndex != endIndex) {
                    int targetIndex = (startIndex + endIndex) / 2;

                    if (nums1[targetIndex] == num2) {
                        hs.add(num2);
                        break;
                    } else if (nums1[targetIndex] > num2) {
                        endIndex = targetIndex;
                    } else if (nums1[targetIndex] < num2) {
                        startIndex = targetIndex;
                    }
                }
            }
        } else {
            Arrays.sort(nums2);

        }

        int[] result = new int[hs.size()];

        Iterator i = hs.iterator();

        int idx = 0;
        while (i.hasNext()) {
            result[idx] = (int) i.next();
            idx++;
        }

        return result;
    }
}
