package per.khr.java.DynamicProgramming;

public class Fibonacci_Number {
    public int getFiboNum(int n, int[] memo) {
        if (n == 0 || n == 1)
            return memo[n];

        if (memo[n] == 0)
            memo[n] = getFiboNum(n - 1, memo) + getFiboNum(n - 2, memo);

        return memo[n];
    }

    /**
     * 0ms
     * faster than 100%
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n == 0)
            return 0;

        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        return getFiboNum(n, memo);
    }
}
