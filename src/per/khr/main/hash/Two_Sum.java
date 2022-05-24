package per.khr.main.hash;

public class Two_Sum {
    public static int[] main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = new int[2];

        int idx = 0;
        while (true) {
            result[0] = nums[idx];
            int idx2 = ++idx;
            for (; idx2 < nums.length; ++idx2) {
                result[1] = nums[idx2];

                if (result[0] + result[1] == target) return new int[]{idx - 1, idx2};
            }
        }
    }
}
