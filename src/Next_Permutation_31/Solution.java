package Next_Permutation_31;

public class Solution {
    public void nextPermutation(int[] nums) {
        int size = nums.length;
        if (size <= 1)
            return;
        int breakSlope = size - 2;
        while (breakSlope >= 0 && nums[breakSlope] >= nums[breakSlope + 1])
            breakSlope--;
        int replace = size - 1;

        if (breakSlope >= 0) {
            while (breakSlope < replace && nums[breakSlope] >= nums[replace])
                replace--;

            swap(nums, breakSlope, replace);
        }

        int start = breakSlope + 1;
        int end = size - 1;
        while (start < end)
            swap(nums, start++, end--);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
