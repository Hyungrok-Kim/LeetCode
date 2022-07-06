package per.khr.java.BinarySearch;

/**
 * numbers - 오름차순 정렬
 */
public class input_Array_Is_Sorted {
    /**
     * 8ms
     * faster than 9.05%
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0, limit = numbers.length; i < limit; ++i) {
            int findNum = target - numbers[i];
            int start = 0, end = numbers.length - 1;

            if (findNum >= numbers[i]) {
                start = i + 1;
            } else if (findNum < numbers[i]) {
                end = i - 1;
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (numbers[mid] == findNum) return new int[]{i + 1, mid + 1};
                else if (numbers[mid] > findNum) {
                    end = mid - 1;
                } else if (numbers[mid] < findNum) {
                    start = mid + 1;
                }
            }
        }

        return null;
    }
}
