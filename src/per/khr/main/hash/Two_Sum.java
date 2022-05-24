package per.khr.main.hash;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static int[] main(String[] args) {
        // 내 답안 169ms
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

//        빠른 답안(HashMap 사용..)
//        int[] result = new int[2];
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])) {
//                result[1] = i;
//                result[0] = map.get(target - nums[i]);
//                return result;
//            }
//            map.put(nums[i], i);
//        }
//        return result;
    }
}
