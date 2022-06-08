package per.khr.java.Else;

public class Sqrt {
    // method 사용 solution
//    public int mySqrt(int x) {
//        return (int)Math.sqrt(x);
//    }

    // method not use solution
    public int mySqrt(int x) {
        if (x == 1) return 1;

        for (int i = 46340; i <= x / 2; ++i) {
            int pre = i * i;
            int post = (i + 1) * (i + 1);

            if (x >= pre && (x < post || post < 0)) return i;
        }

        // 어떻게 풀어야 하는가

        return 0;
    }
}
