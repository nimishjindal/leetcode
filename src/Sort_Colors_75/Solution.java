package Sort_Colors_75;

public class Solution {

    private final int RED = 0, BLUE = 2;

    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            int curr = nums[mid];
            if (curr == RED) {
                swap(nums, mid, low);
                low++;
            } else if (curr == BLUE) {
                swap(nums, mid, high);
                high--;
                mid--;
            }
            mid++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}