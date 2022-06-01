package per.khr.java.DynamicProgramming;

public class RunningSumOf1DArray {

    public int getBeforeSum(int idx, int[] runningSum) {
        if (runningSum[idx - 1] == 0 && idx - 1 != 0) {
            runningSum[idx - 1] = getBeforeSum(idx - 1, runningSum);
        }

        return runningSum[idx - 1];
    }

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];
        for (int i = 1; i < runningSum.length; ++i) {
            runningSum[i] = getBeforeSum(i, runningSum) + nums[i];
        }

        return runningSum;
    }
}
