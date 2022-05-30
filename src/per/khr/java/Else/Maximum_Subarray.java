package per.khr.java.Else;

import java.util.TreeSet;

public class Maximum_Subarray {
    private TreeSet<Integer> ts = new TreeSet<>();

    public void recursive(int startIdx, int[] nums, int plus) {
        if(startIdx + plus >= nums.length) return ;

        int startFixed = startIdx;
        int sum = 0;
        for(int i = startIdx; i < startIdx + plus; ++i) {
            sum += nums[i];
        }

        ts.add(sum);
        recursive(startFixed, nums, plus + 1);
    }

    public int maxSubArray(int[] nums) {

        int plus = 0;
        for (int i = 0; i < nums.length; ++i) {
            recursive(i, nums, plus);
        }

        return ts.last();
    }
}
