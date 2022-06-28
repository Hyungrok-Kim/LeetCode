package per.khr.java.BinarySearch;

public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
//        0을 먼저 찾아서
//        nums의 0번 값과 마지막 값을 비교 해서
//        target이 0번 부터 ~ 0의 위치에 속하는 지
//        target이 0의 위치부터 ~ 마지막 값에 속하는 지 알아낸 후에는
//        평범한 이분 탐색으로 풀 수 있을 듯

//        가장 큰 수를 찾아야곘네
        int maxNum = Integer.MIN_VALUE;
        int maxNumIdx = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (maxNum < nums[i]) {
                maxNum = nums[i];
                maxNumIdx = i;
            }
        }

        int startIdx = 0, endIdx = nums.length - 1, zeroLocation = Integer.MAX_VALUE, result = 0;

        while (endIdx - startIdx != 0) {
            int targetIdx = (startIdx + endIdx) / 2;

            if (nums[targetIdx] == 0) {
                zeroLocation = targetIdx;
                break;
            } else if (nums[targetIdx] > target) {
                endIdx = target;
            } else if (nums[targetIdx] < target) {
                startIdx = target;
            }
        }

        if (nums[startIdx] == 0) zeroLocation = startIdx;
        if (nums[endIdx] == 0) zeroLocation = endIdx;

        if (zeroLocation > 5000) return -1;

        return result;
    }
}
