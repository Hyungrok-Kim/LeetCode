package per.khr.java.Else;

import java.util.TreeSet;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int plus = 0;
        for (int i = 0; i < nums.length; ++i) {
            recursive(i, nums, 0);
        }

        int globalMax = Integer.MIN_VALUE;
        System.out.println(globalMax);

        return ts.last();
    }
}
