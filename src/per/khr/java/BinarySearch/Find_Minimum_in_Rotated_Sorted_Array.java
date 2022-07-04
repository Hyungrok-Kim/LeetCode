package per.khr.java.BinarySearch;

/**
 * rotated가 nums.length만큼 일어나서 다시 한 바퀴가 돌았을 경우에는 nums[0]을 return.
 * 그렇지 않다면
 * 이전의 값과 비교 후 값이 작아지는 지점을 찾아서 return하면 된다.
 */
public class Find_Minimum_in_Rotated_Sorted_Array {
    /**
     * 0ms or 1ms
     * 1ms일 땐 faster than 42.06%
     * 0ms일 땐 faster than 100%
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int startIdx = 0, endIdx = nums.length - 1, targetIdx = 0;

        if (nums[startIdx] == nums[endIdx] ||  nums[startIdx] < nums[endIdx]) return nums[startIdx];
        else {
            while (startIdx <= endIdx) {
                targetIdx = startIdx + (endIdx - startIdx) / 2;

                if (targetIdx != 0 && nums[targetIdx - 1] > nums[targetIdx]) return nums[targetIdx];
                if (targetIdx != nums.length - 1 && nums[targetIdx] > nums[targetIdx + 1]) return nums[targetIdx + 1];

                if (nums[startIdx] <= nums[targetIdx]) {
                    startIdx = targetIdx + 1;
                } else if (nums[startIdx] > nums[targetIdx]) {
                    endIdx = targetIdx - 1;
                }
            }
        }

        return 0;
    }
}
