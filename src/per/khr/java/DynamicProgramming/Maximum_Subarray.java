package per.khr.java.DynamicProgramming;

// O(n) 풀이
// 카데인 알고리즘
// 카데인 알고리즘이란
// - 이전요소의 부분합을 알면 현재요소의 최대값을 알 수 있는 알고리즘.
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int bestSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < nums.length; ++i) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            bestSum = Math.max(bestSum, curSum);
        }
        // currentMax 현재 idx의 숫자와 지금까지 더해왔던 것 중 가장 큰 값을 비교
        // globalMax는 "지금까지 더해왔던 것 중 가장 큰 값" 과 "지금까지 더해왔던 것 중 가장 큰 값에 현재 idx를 더한 값을 비교"

        return bestSum;
    }
}
