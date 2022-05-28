package per.khr.java.Else;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        boolean up = false;
        boolean down = false;

        int i = 0;
        for (; i < nums.length; ++i) {
            if (nums[i] == target) return i;
            else {
                if (nums[i] < target) up = true;
                else down = true;

                if (i == 0 && nums[i] > target) return 0;
            }

            if (up && down) return i;
        }

        return i;
    }
}
