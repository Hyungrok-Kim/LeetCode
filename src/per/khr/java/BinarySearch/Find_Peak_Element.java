package per.khr.java.BinarySearch;

public class Find_Peak_Element {
    /**
     * 1ms
     * faster than 12.30%
     *
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

    /**
     * 0ms
     * faster than 100.00%
     * @param nums
     * @return
     */
    public int findPeakElement2(int[] nums) {
        int numsLen = nums.length;
        if (numsLen == 1) return 0;
        if (numsLen == 2) return nums[0] > nums[1] ? 0 : 1;
        int startIdx = 0, endIdx = numsLen - 1, targetIdx = 0;
        while (startIdx + 2 <= endIdx) {
            targetIdx = startIdx + (endIdx - startIdx) / 2;
            if (nums[targetIdx - 1] < nums[targetIdx] && nums[targetIdx + 1] < nums[targetIdx]) return targetIdx;

            if (nums[targetIdx - 1] > nums[targetIdx]) endIdx = targetIdx;
            else if (nums[targetIdx - 1] <= nums[targetIdx]) startIdx = targetIdx;
        }

        return nums[startIdx] > nums[endIdx] ? startIdx : endIdx;
    }

}
