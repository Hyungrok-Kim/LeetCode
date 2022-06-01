package per.khr.java.Else;

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
