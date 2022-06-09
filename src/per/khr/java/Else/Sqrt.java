package per.khr.java.Else;

//
public class Sqrt {
    // method 사용 solution
//    public int mySqrt(int x) {
//        return (int)Math.sqrt(x);
//    }

    // method not use solution
    // 무식하게 푸는 방식
//    public int mySqrt(int x) {
//        if (x == 1) return 1;
//
//        for (int i = 46340; i <= x / 2; ++i) {
//            int pre = i * i;
//            int post = (i + 1) * (i + 1);
//
//            if (x >= pre && (x < post || post < 0)) return i;
//        }
//
//        return 0;
//    }

    // 이분 탐색 풀이
    public int mySqrt(int x) {
        if (x <= 1) return x;

        int left = 1, right = x;
        while (left < right) {
            int target = left + (right - left) / 2;

            if (x / target == target) {
                return target;
            } else if (x / target > target) { // 곱해서 x를 넘는 지 확인하게 되면 int 값 overflow가 되었을 때 -가 되니까..
                left = target + 1;
            } else {
                right = target;
            }
        }

        return left - 1;
    }

}
