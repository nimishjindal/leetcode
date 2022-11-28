package Sort_Colors_75;

public class Solution {

    private final int RED = 0, WHITE = 1;

    public void sortColors(int[] nums) {
        int r = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == RED) {
                r++;
                swap(nums, i, r);
            }
        }
        int w = r;
        for (int i = r+1; i < nums.length; i++) {
            if (nums[i] == WHITE) {
                w++;
                swap(nums, i, w);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}