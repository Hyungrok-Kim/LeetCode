package per.khr.java.BruteForce;

import java.util.Arrays;

public class Majority_Element {

    public int majorityElement(int[] nums) {
        int halfLength = nums.length / 2;
        Arrays.sort(nums);
        return nums[halfLength];
    }

}
