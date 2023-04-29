package per.khr.java.BruteForce;

/**
 * nums는 sorted array
 */
public class Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int addIndex = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }

        return addIndex;
    }
}
