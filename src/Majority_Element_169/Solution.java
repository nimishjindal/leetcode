package Majority_Element_169;

public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate)
                count++;
            else if (count != 0)
                count--;
            else
                candidate = nums[i];
        }
        return candidate;
    }
}
