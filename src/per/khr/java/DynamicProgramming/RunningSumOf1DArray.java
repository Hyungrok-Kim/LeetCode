package per.khr.java.DynamicProgramming;

public class RunningSumOf1DArray {

    public int getBeforeSum(int idx, int[] runningSum, boolean[] allotted) {
        if (!allotted[idx - 1] && idx - 1 != 0) {
            runningSum[idx - 1] = getBeforeSum(idx - 1, runningSum, allotted);
        }

        return runningSum[idx - 1];
    }

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        boolean[] allotted = new boolean[nums.length];

        runningSum[0] = nums[0];
        for (int i = 1; i < runningSum.length; ++i) {
            runningSum[i] = getBeforeSum(i, runningSum, allotted) + nums[i];
            allotted[i] = true;
        }

        return runningSum;
    }
}
