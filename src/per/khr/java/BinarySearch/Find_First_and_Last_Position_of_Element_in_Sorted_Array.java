package per.khr.java.BinarySearch;

/**
 * 일단 target을 찾아야하니까 성능 좋은 이분탐색으로 target을 먼저 찾아본 후
 * 찾지 못했다면 [-1, -1]
 * 찾았다면 해당 인덱스에서 좌우로 움직이며 값이 변하는 지점을 찾아야할 듯
 */
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int startIdx = 0, endIdx = nums.length - 1, targetIdx = 0;
        boolean findCheck = false;


        while (startIdx <= endIdx) {
            targetIdx = (startIdx + endIdx) / 2;

            if (nums[targetIdx] == target) {
                findCheck = !findCheck;
                break;
            } else if (nums[targetIdx] > target) {
                endIdx = targetIdx;
            } else if (nums[targetIdx] < target) {
                startIdx = targetIdx;
            }
        }

        // nums에 target과 같은 값이 없다면!
        if (!findCheck) return new int[]{-1, -1};

        // 찾았다면!
        for (; targetIdx >= 0; targetIdx)

        return null;
    }
}
