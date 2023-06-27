package per.khr.java.BruteForce;

import java.util.HashSet;
import java.util.Set;

public class Single_Number {

    public int singleNumber(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int num : nums) {
            if (!result.contains(num)) {
                result.add(num);
            } else {
                result.remove(num);
            }
        }
        return result.iterator().next();
    }
}
