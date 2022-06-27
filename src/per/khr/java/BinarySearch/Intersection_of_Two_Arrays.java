package per.khr.java.BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        int nums1Len = nums1.length, nums2Len = nums2.length;;
        int[] largeArr, smallArr;

        if (nums1Len > nums2Len) {
           largeArr = nums1;
           smallArr = nums2;
        } else {
            largeArr = nums2;
            smallArr = nums1;
        }

        Arrays.sort(largeArr);

        for (int num : smallArr) {
            int startIndex = 0;
            int endIndex = largeArr.length - 1;

            while (endIndex - startIndex != 1) {
                int targetIndex = (startIndex + endIndex) / 2;

                if (largeArr[targetIndex] == num) {
                    hs.add(num);
                    break;
                } else if (largeArr[targetIndex] > num) {
                    endIndex = targetIndex;
                } else if (largeArr[targetIndex] < num) {
                    startIndex = targetIndex;
                }
            }

            if (largeArr[startIndex] == num) hs.add(num);
            if (largeArr[endIndex] == num) hs.add(num);
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

//    스트림 답안
//    public int[] intersection(int[] nums1, int[] nums2)
//    {
//        Set<Integer> n2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
//        return Arrays.stream(nums1)
//                .boxed()
//                .filter(n2Set::contains)
//                .distinct()
//                .mapToInt(i->i).toArray();
//    }
}
