package per.khr.java.BinarySearch;

public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
//        0을 먼저 찾아서
//        nums의 0번 값과 마지막 값을 비교 해서
//        target이 0번 부터 ~ 0의 위치에 속하는 지
//        target이 0의 위치부터 ~ 마지막 값에 속하는 지 알아낸 후에는
//        평범한 이분 탐색으로 풀 수 있을 듯
        if (nums.length == 0) return -1;
        if (nums.length == 1 && nums[0] != target) return -1;

        boolean rotated = false;

        int maxNum = Integer.MIN_VALUE;
        int maxNumIdx = 0;

        for (int i = 0; i < nums.length; ++i) {
//            if (maxNum < nums[i]) {
//                maxNum = nums[i];
//                maxNumIdx = i;
//            }

            if (maxNum > nums[i]) {
                rotated = true;
                break;
            } else {
                maxNum = nums[i];
                maxNumIdx = i;
            }
        }
        int startIdx = 0, endIdx = nums.length - 1, zeroLocation = Integer.MAX_VALUE, result = 0;

//        if (nums[0] == target) return 0;
//        if (nums[maxNumIdx] == target) return maxNumIdx;

//        if (nums[maxNumIdx + 1] == target) return maxNumIdx + 1;
//        if (nums[nums.length - 1] == target) return nums.length - 1;

        if (rotated) {
            if (nums[0] <= target && nums[maxNumIdx] >= target) endIdx = maxNumIdx;
            else if (nums[nums.length - 1] >= target) startIdx = maxNumIdx + 1;
            else return -1;
        }

        while (endIdx - startIdx != 0) {
            int targetIdx = (startIdx + endIdx) / 2;

            if (nums[targetIdx] == target) {
                return targetIdx;
            } else if (nums[targetIdx] > target) {
                endIdx = targetIdx;
            } else if (nums[targetIdx] < target) {
                startIdx = targetIdx;
            }
        }

        if (nums[startIdx] == target) return startIdx;
        if (nums[endIdx] == target) return endIdx;

        return -1;
    }
}
