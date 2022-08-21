package per.khr.java.DynamicProgramming;

/**
 * Zero-index 시작.
 * 최대 nums[idx]만큼 점프 가능.
 * 마지막 idx에 도달할 수 있는가.
 */
public class Jump_Game {
    public boolean getJump(int location, int[] nums) {
        if (location == nums.length - 1)
            return true;

        if (location >= nums.length)
            return false;

        boolean result = false;

        for (int i = 0, iLimit = nums[location]; i < iLimit; ++i) {
            result = getJump(location + i, nums);
        }

        return result;
    }

    /**
     * 미완성.
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int location = 0;

        for (int i = 0, iLimit = nums[0]; i < iLimit; ++i) {
            getJump(location + i, nums);
        }

        return true;
    }
}
