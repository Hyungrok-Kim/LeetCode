package per.khr.java.BinarySearch;

/**
 * rotated된 int 배열에서 Minimum 값을 찾아라.
 * nums[startIdx] 와 nums[endIdx]를 비교
 */
public class Find_Minimum_in_Rotated_Sorted_Array_2 {

    /**
     * 1ms
     * faster than 79.30%
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int startIdx = 0, endIdx = nums.length - 1, targetIdx = 0;

        if (nums[0] < nums[nums.length - 1]) return nums[0];
        else {
            while (startIdx <= endIdx) {
                targetIdx = startIdx + (endIdx - startIdx) / 2;

                if (nums[startIdx] < nums[endIdx]) return nums[startIdx];

                if (nums[startIdx] < nums[targetIdx]) {
                    startIdx = targetIdx + 1;
                } else if (nums[startIdx] > nums[targetIdx]) {
                    endIdx = targetIdx;
                } else {
                    startIdx++;
                }
            }
        }

        return nums[endIdx];
    }
}
