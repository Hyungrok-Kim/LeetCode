package per.khr.java.Else;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int globalMax = Integer.MIN_VALUE;
        int currentMax = 0;

        for (int i = 0; i < nums.length; ++i) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }
        // currentMax 현재 idx의 숫자와 지금까지 더해왔던 것 중 가장 큰 값을 비교
        // globalMax는 "지금까지 더해왔던 것 중 가장 큰 값" 과 "지금까지 더해왔던 것 중 가장 큰 값에 현재 idx를 더한 값을 비교"

        return globalMax;
    }
}
