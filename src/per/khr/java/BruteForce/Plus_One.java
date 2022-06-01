package per.khr.java.BruteForce;

// Brute Force
// 결국 모든 요소가 9라면 완전 탐색을 하기 떄문에 완전 탐색 문제라고 할 수 있겠다.
public class Plus_One {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; --i) {
            int targetNum = digits[i];

            if (targetNum < 9) {
                digits[i] = targetNum + 1;
                return digits;
            } else {
                if (i == 0) break;

                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
