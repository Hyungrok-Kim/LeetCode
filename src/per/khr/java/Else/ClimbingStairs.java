package per.khr.java.Else;

// --전략--
// n = 1 => 1
// n = 2 => 2
// n = 3 => 3
// n = 4 => 5
// n = 5 => 8개
// 재귀 문제 였구나...

public class ClimbingStairs {
    public int climbStairs(int n) {
        int oneCount = 0, twoCount = 0, ways = 0;

        for (; 2 * twoCount <= n; ++twoCount) {
            oneCount = n - twoCount * 2;

            ways += twoCount * oneCount + 1;
        }

        return ways;
    }
}
