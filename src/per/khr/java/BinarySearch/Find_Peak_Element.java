package per.khr.java.BinarySearch;

public class Find_Peak_Element {
    /**
     * 1ms
     * faster than 12.30%
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        int startIdx = 0, endIdx = nums.length - 1;

        while (startIdx <= endIdx) {
            if (startIdx == endIdx) return startIdx;
            else if (startIdx != endIdx) {
                if (nums[startIdx] > nums[startIdx + 1]) return startIdx;
                if (nums[endIdx] > nums[endIdx - 1]) return endIdx;
            }

            startIdx++;
            endIdx--;
        }

        return 0;
    }
}
