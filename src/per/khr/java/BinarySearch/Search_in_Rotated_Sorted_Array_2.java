package per.khr.java.BinarySearch;

/**
 * 우선 0의 위치를 찾고 target이 첫번째 인덱스부터 0의 -1 위치까지에 속하는 지
 * 그 다음에 속하는 지를 알아야 한다.
 * 마이너스가 나올 수 있음.
 * return type이 boolean이기 때문에 가장 쉬운 방법은 nums를 sorting한 후에 이분 탐색으로 찾는 방법.
 * 하지만 찾는 숫자의 index를 요구한다면?
 */
public class Search_in_Rotated_Sorted_Array_2 {
    /**
     * 4ms
     */
    //    public boolean search(int[] nums, int target) {
//        Arrays.sort(nums);
//        int startIdx = 0, endIdx = nums.length - 1, targetIdx = 0;
//
//        while (startIdx <= endIdx) {
//            targetIdx = startIdx + (endIdx - startIdx) / 2;
//
//            if (nums[targetIdx] == target) {
//                return true;
//            } else if (nums[targetIdx] > target) {
//                endIdx = targetIdx - 1;
//            } else if (nums[targetIdx] < target) {
//                startIdx = targetIdx + 1;
//            }
//        }
//
//        return false;
//    }

    /**
     * 2ms
     * @param nums
     * @param target
     * @return
     */
    public boolean search(int[] nums, int target) {
        int before = Integer.MIN_VALUE, zeroIndex = 0;
        boolean rotated = false;
        for (int i = 0; i < nums.length; ++i) {
            if (before > nums[i]) {
                zeroIndex = i - 1;
                rotated = true;
                break;
            }

            before = nums[i];
            if (before == target) return true;
        }

        if (rotated) {
            int startIdx = 0, endIdx = nums.length - 1, targetIdx = 0;

            if (target >= nums[0] && target <= nums[zeroIndex]) endIdx = zeroIndex;
            if (target >= nums[zeroIndex + 1] && target <= nums[nums.length - 1]) startIdx = zeroIndex + 1;

            while (startIdx <= endIdx) {
                targetIdx = startIdx + (endIdx - startIdx) / 2;

                if (nums[targetIdx] == target) {
                    return true;
                } else if (nums[targetIdx] > target) {
                    endIdx = targetIdx - 1;
                } else if (nums[targetIdx] < target) {
                    startIdx = targetIdx + 1;
                }
            }
        }

        return false;
    }
}
