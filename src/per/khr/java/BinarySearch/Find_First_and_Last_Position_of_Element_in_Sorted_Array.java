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
        int[] result = new int[2];

        while (startIdx <= endIdx) {
            targetIdx = startIdx + (endIdx - startIdx) / 2;

            if (nums[targetIdx] == target) {
                findCheck = !findCheck;
                break;
            } else if (nums[targetIdx] > target) {
                endIdx = targetIdx -1;
            } else if (nums[targetIdx] < target) {
                startIdx = targetIdx + 1;
            }
        }

        // nums에 target과 같은 값이 없다면!
        if (!findCheck) return new int[]{-1, -1};

        if (nums.length == 1) return new int[] {0, 0};

        // 찾았다면!
        for (int i = targetIdx; i >= 0; --i) {
            if (nums[i] != target) {
                result[0] = i + 1;
                break;
            }

            if (i == 0) result[0] = 0;
        }

        for (int i = targetIdx; i < nums.length; ++i) {
            if (nums[i] != target) {
                result[1] = i - 1;
                break;
            }

            if ( i == nums.length - 1) result[1] = nums.length - 1;
        }

        return result;
    }
}
