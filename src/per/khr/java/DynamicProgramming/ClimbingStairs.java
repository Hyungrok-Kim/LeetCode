package per.khr.java.DynamicProgramming;

// --전략--
// n = 1 => 1
// n = 2 => 2
// n = 3 => 3
// n = 4 => 5
// n = 5 => 8개
// 재귀 문제 였구나...

public class ClimbingStairs {
//    public int recursive(int n, int[] dp) {
//        if (n == 1) return 1;
//
//        if (dp[n] == 0) {
//            dp[n] = recursive(n - 1, dp) + recursive(n - 2, dp);
//        }
//
//        return dp[n];
//    }

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
